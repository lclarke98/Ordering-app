import java.awt.*;
import java.util.*;
/**
 * Class to manage the pizza order.
 * @author 817852
 */
public class OrderingSystem 
{
    private Canvas canvas;
    private KeyboardInput keyboardInput;
    private ArrayList<Pizza> pizzas;
    private Color colour;
    private ArrayList<Topping> firstTopping;
    private ArrayList<Topping> secondTopping;
    private String firstToppingType;
    private String secondToppingType;

    private double totalCost;
    /**
     * Constructor for the ordering system.
     */
    public OrderingSystem()
    {
        canvas = new Canvas("Pizza Ordering", 900, 650);
        pizzas = new ArrayList<Pizza>();
        firstTopping = new ArrayList<Topping>();
        secondTopping = new ArrayList<Topping>();
    }

    /**
     * Method to draw the outline of the order screen.
     */
    public void drawOrderScreen()
    {
        canvas.setForegroundColor(Color.BLACK);
        // vertical dividers
        canvas.drawLine(300, 0, 300, 600);
        canvas.drawLine(600, 0, 600, 600);

        // halfway divider
        canvas.drawLine(0, 300, 900, 300);

        // total price line
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        canvas.drawString("Total Price of the Order: ", 10, 640);
    }

    /**
     * Method to manage the ordering, drawing and calculating of the pizzas.
     */
    public void startOrdering()
    {
        GetInputs getInputs = new GetInputs();
        CalculateCost getCost = new CalculateCost();
        int numPizza = getInputs.getNumberOfPizzas();
        Pizza currentPizza;
        int index = 0;
        Topping currentFirstTopping;
        Topping currentSecondTopping;
        int numTopping;
        double pizzaCost;
        double totalCost =0;
        String size="";
        String crust="";
        
        if(numPizza >3){
            for (int i = 0; i <3; i++)
            {
                pizzas.add(new Pizza(canvas, i*300,0,size,crust,colour));
                firstTopping.add(new Topping(canvas,0+(i*300),0));
                secondTopping.add(new Topping(canvas,0+(i*300),0));
            }
            for (int i = 0; i <numPizza-3; i++)
            {
                pizzas.add(new Pizza(canvas, i*300,300,size,crust,colour));
                firstTopping.add(new Topping(canvas,0+(i*300),300));
                secondTopping.add(new Topping(canvas,0+(i*300),300));
            }
        }
        else{
            for (int i = 0; i <numPizza; i++)
            {
                pizzas.add(new Pizza(canvas, i*300,0,size,crust,colour));
                firstTopping.add(new Topping(canvas,0+(i*300),0));
                secondTopping.add(new Topping(canvas,0+(i*300),0));
            }
        }
        
        while (index!=pizzas.size()){
            currentPizza = pizzas.get(index);
            currentFirstTopping = firstTopping.get(index);
            currentSecondTopping = secondTopping.get(index);
            // This gets pizza size
            String pizzaSize = getInputs.getPizzaSize();
            currentPizza.setSize(pizzaSize);
            double sizeCost = getCost.calculateBaseSize(currentPizza.getSize());
            // This gets the crust and calculates the total cost of the pizza base
            crust = getInputs.getCrust();
            currentPizza.setPizzaCrust(crust);
            double baseCost = getCost.calculateBaseCost(currentPizza.getBase());
            // This gets the sauce of the pizzza and calculates the cost of that sauce
            colour = getInputs.getSauce();
            currentPizza.setBase(colour);
            double sauceCost = getCost.calculateSauceCost(currentPizza.getColour());
            // This draws the pizza and displays the pizza information
            currentPizza.drawPizza();
            currentPizza.displayPizza();
            // This gets the number of toppings
            numTopping = getInputs.getNumToppings();
            if(numTopping==1){
                firstToppingType = getInputs.getTopping();
                currentFirstTopping.setFirstTopping(firstToppingType);
                secondToppingType = "";
            }
            else if(numTopping==2){
                firstToppingType= getInputs.getTopping();
                currentFirstTopping.setFirstTopping(firstToppingType);
                secondToppingType = getInputs.getTopping();
                currentSecondTopping.setSecondTopping(secondToppingType);
            }
            else{
                firstToppingType = "";
                secondToppingType = "";
            }
            // This calculates the cost of the toppings used
            double firstToppingCost = getCost.calculateFirstTopping(firstToppingType);
            double secondToppingCost = getCost.calculateSecondTopping(secondToppingType);
            // This calculates the cost of the individual pizza
            pizzaCost = baseCost+sauceCost+firstToppingCost+secondToppingCost;
            // This calculates the overall cost of the order
            totalCost+=pizzaCost;
            
            canvas.setForegroundColor(Color.WHITE);
            canvas.fillRectangle(300,620, 300,40);
            canvas.setForegroundColor(Color.BLACK);
            canvas.setFontSize(25);
            canvas.drawString("£" + (Math.round(totalCost*100d)/100d), 325, 640);
            
            index++;
        }
    }
}

