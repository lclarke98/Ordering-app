
/**
 * The CalculateCost class will calculate the overall cost of the pizza order.
 *
 * @author 817852
 * @version 13 March 2018
 */
public class CalculateCost
{
    private double baseSize;
    private double baseCost;
    private double sauceCost;
    private double firstToppingCost;
    private double secondToppingCost;

    /**
     * Constructor for objects of class CalculateCost
     */
    public CalculateCost()
    {
    }

    /**
     * Method for the baseSize calculation.
     * 
     * @param       size in string format
     * @return      base size in double format
     */
    public double calculateBaseSize(String size)
    {
        if(size.equals("small")){
            baseSize = Math.PI*(5*5);
        }
        else if (size.equals("medium")){
            baseSize = Math.PI*(6*6);
        }
        else if(size.equals("large")){
            baseSize = Math.PI*(7*7);
        }
        return baseSize;
    }

    /**
     * This method calculates the cost of the pizza base
     *
     * @param     The type of base the pizza has
     * @return    The cost of that base
     */
    public double calculateBaseCost(String base)
    {
        if(base.equals("thin crust")){
            baseCost = 0.08 * baseSize;
        }
        else if(base.equals("deep pan")){
            baseCost = 0.11 * baseSize;
        }
        else if(base.equals("stuffed crust")){
            baseCost = 0.14 * baseSize;
        }
        return baseCost;
    }
    
    /**
     * Method for calculating the cost of the pizza sauce
     * 
     * @param      The sauce the pizza has 
     * @return     The cost of the sauce
     */
    public double calculateSauceCost(String sauce)
    {
        if (sauce.equals("bbq")){
            sauceCost = 0.5;
        }
        else{
            sauceCost = 0.0;
        }
        return sauceCost;
    }

    /**
     * This method calculates the cost of the first topping on the pizza
     *
     * @param     The name of the first topping
     * @return    the cost of that topping multiplied by 5
     */
    public double calculateFirstTopping(String firstTopping)
    {
        if(firstTopping.equals("bacon")){
            firstToppingCost = 0.02 * 5;
        }
        else if(firstTopping.equals("jalapeno")){
            firstToppingCost = 0.04 * 5;
        }
        else{
            firstToppingCost =0;
        }
        return firstToppingCost;
    }

    /**
     * This method calculates the cost of the first topping on the pizza
     *
     * @param     The name of the first topping
     * @return    the cost of that topping multiplied by 4
     */
    public double calculateSecondTopping(String secondTopping)
    {
        if(secondTopping.equals("bacon")){
            secondToppingCost = 0.02 * 4;
        }
        else if(secondTopping.equals("jalapeno")){
            secondToppingCost = 0.04     * 4;
        }
        else{
            secondToppingCost =0;
        }
        return secondToppingCost;
    }
}