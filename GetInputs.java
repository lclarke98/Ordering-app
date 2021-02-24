import java.awt.*;
import java.util.*;
/**
 * Write a description of class GetInputs here.
 *
 * @author 817852
 * @version (a version number or a date)
 */
public class GetInputs
{
    private KeyboardInput keyboardInput;
    private ArrayList<Pizza> pizzas;
    private Color colour;

    /**
     * Constructor for objects of class GetInputs
     */
    public GetInputs()
    {
        keyboardInput = new KeyboardInput();
    }

    /**
     * Method to get the number of pizzas that is required
     * @return      The number of pizzas
     */
    public int getNumberOfPizzas()
    {
        int numPizza;
        boolean validEntry = false;
        do{
            System.out.println("Enter number of pizzas");
            numPizza = keyboardInput.getInputInteger();
            if(numPizza <=0 || numPizza >6){
                System.out.println("Invalid number");
            }
            else{
                validEntry = true;
            }
        }while(!validEntry);
        return numPizza;
    }

    /**
     * Method for getting the pizzas size based on users input
     * 
     *@return       Returns pizzaSize
     */
    public String getPizzaSize()
    {
        boolean validEntry = false;
        String pizzaSize;
        do{
            System.out.println("Enter pizza Size either small, medium or large: ");
            pizzaSize = keyboardInput.getInputString();
            if(pizzaSize.equals("small") ||(pizzaSize.equals("medium"))||(pizzaSize.equals("large"))){
                validEntry = true;
            }
            else{
                System.out.println("Invalid size");
            }
        } while(!validEntry); 
        return pizzaSize;
    }

    /**
     * Method for getting the pizzas crust based on users input
     * 
     *@return       Returns pizzaCrust
     */
    public String getCrust()
    {
        boolean validEntry = false;
        String crust;
        do{
            System.out.println("Enter pizza crust either thin crust, deep pan or stuffed crust: ");
            crust = keyboardInput.getInputString();
            if(crust.equals("deep pan")){
                crust = "deep pan";
                validEntry = true;
            }
            else if(crust.equals("thin crust")){
                crust = "thin crust";
                validEntry = true;
            }
            else if(crust.equals("stuffed crust")){
                crust = "stuffed crust";
                validEntry = true;
            }
            else{
                System.out.println("Invalid crust");
            }
        } while(!validEntry);
        return crust;
    }

    /**
     * Method for getting the pizzas sauce based on users input
     * 
     *@return       Returns pizzaSauce
     */
    public Color getSauce()
    {
        boolean validEntry = false;
        String pSauce;
        //Color colour;
        do{
            System.out.println("Enter pizza base sauce either tomato or bbq: ");
            pSauce = keyboardInput.getInputString();
            if(pSauce.equals("tomato")){
                colour = (Color.RED);
                validEntry = true;
            }
            else if(pSauce.equals("bbq")){
                colour = (Color.orange);
                validEntry = true;
            }
            else{
                System.out.println("Invalid sauce");
                validEntry = false;
            }
        }while(!validEntry);
        return colour;
    }
    
    /**
     * Method for getting the number of toppings based on users input
     * 
     *@return       Returns number of toppings
     */
    public int getNumToppings()
    {
        int numToppings;
        boolean validEntry = false;
        do{
            System.out.println("Enter number of toppings either 0, 1 or 2");
            numToppings = keyboardInput.getInputInteger();
            if(numToppings >2){
                System.out.println("No more than 2 toppings");
            }
            else if(numToppings >=0){
                validEntry = true;
            }
            else if(numToppings <0){
                System.out.println("invalid input number must be 0 or higer");
            }
        }while(!validEntry);
        return numToppings;
    }
    
    /**
     * Method for getting the pizzas toppings based on users input
     * 
     *@return       Returns the pizzas toppings
     */
    public String getTopping()
    {
        boolean validEntry = false;
        String toppingType;
        do{
            System.out.println("Enter pizza topping either bacon or jalapeno: ");
            toppingType = keyboardInput.getInputString();
            if(toppingType.equals("bacon")){
                toppingType = "bacon";
                validEntry = true;
                
            }
            else if(toppingType.equals("jalapeno")){
                toppingType = "jalapeno";
                validEntry = true;
            }
            else{
                System.out.println("Invalid crust");
            }
        } while(!validEntry);
        return toppingType;
    }
}
