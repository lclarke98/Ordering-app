import java.util.*;
/**
 * This class draws the first topping and second topping on the pizza.
 *
 * @author 817852
 * @version 17 March 2018
 */
public class Topping
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;
    private ArrayList<ToppingTwo> toppingTwo;
    private ArrayList<ToppingFive> toppingFive;
    /**
     * Constructor for objects of class Toppings
     */
    public Topping(Canvas win, double topX, double topY)
    {
        canvas = win;
        topLeftX = topX;
        topLeftY = topY;
        toppingTwo = new ArrayList<ToppingTwo>();
        toppingFive = new ArrayList<ToppingFive>();
    }

    /**
     * Method for drawing the first topping as Bacon
     */
    public void drawFirstToppingTwo()
    {
        for(int i = 0; i <2; i++){
            toppingTwo.add(new ToppingTwo(canvas, topLeftX+100+(i*70),topLeftY+100));
            toppingTwo.add(new ToppingTwo(canvas, topLeftX+100+(i*70),topLeftY+170));
            toppingTwo.add(new ToppingTwo(canvas, topLeftX+140,topLeftY+140));
        }
        for(ToppingTwo toppingTwo : toppingTwo)
        {
            toppingTwo.drawToppingTwo();
        }
    }

    /**
     * Method for drawing the first topping as Jalapeno Slice
     */
    public void drawFirstToppingFive()
    {
        for(int i = 0; i <2; i++){
            toppingFive.add(new ToppingFive(canvas, topLeftX+100+(i*70),topLeftY+100));
            toppingFive.add(new ToppingFive(canvas, topLeftX+100+(i*70),topLeftY+170));
            toppingFive.add(new ToppingFive(canvas, topLeftX+140,topLeftY+140));
        }
        for(ToppingFive toppingFive : toppingFive)
        {
            toppingFive.drawToppingFive();
        }
    }

    /**
     * Method for drawing the second topping as Bacon
     */
    public void drawSecondToppingTwo()
    {
        for(int i = 0; i <2; i++){
            toppingTwo.add(new ToppingTwo(canvas, topLeftX+140,topLeftY+100+(i*70)));
            toppingTwo.add(new ToppingTwo(canvas, topLeftX+100+(i*70),topLeftY+140));
        }
        for(ToppingTwo toppingTwo : toppingTwo)
        {
            toppingTwo.drawToppingTwo();
        }
    }

    /**
     * Method for drawing the second topping as Jalapeno
     */
    public void drawSecondToppingFive()
    {
        for(int i = 0; i <2; i++){
            toppingFive.add(new ToppingFive(canvas, topLeftX+140,topLeftY+100+(i*70)));
            toppingFive.add(new ToppingFive(canvas, topLeftX+100+(i*70),topLeftY+140));
        }
        for(ToppingFive toppingFive : toppingFive)
        {
            toppingFive.drawToppingFive();
        }
    }
    
    /**
     * Method for setting first topping based on users input
     * 
     * @param       Takes the users first topping
     */
    public void setFirstTopping(String firstTopping)
    {
        if(firstTopping.equals("bacon")){
            drawFirstToppingTwo();
        }
        else if(firstTopping.equals("jalapeno")){
            drawFirstToppingFive();
        }
    }

    /**
     * Method for setting second topping based on users input
     * 
     * @param       Takes the users second topping
     */
    public void setSecondTopping(String secondTopping)
    {
        if(secondTopping.equals("bacon")){
            drawSecondToppingTwo();
        }
        else if(secondTopping.equals("jalapeno")){
            drawSecondToppingFive();
        }
    }
    

}
