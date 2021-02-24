import java.awt.*;
import java.util.*;
/**
 * Class to represent a single pizza.
 * @author 817852
 */
public class Pizza 
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;
    private String pizzaSize;
    private Color baseSauce;
    private String crust;
    private String sauce;
    /**
     * Constructor for pizza.
     * @param win the window to draw the pizza on
     * @param startX the top-left x coordinate for the section of screen to draw pizza on
     * @param startY the top-left y coordinate for the section of screen to draw pizza on
     */
    public Pizza(Canvas win, double startX, double startY,String size, String crust,Color bSauce)
    {        
        canvas = win;
        topLeftX = startX;
        topLeftY = startY;
        baseSauce = bSauce;
        crust = crust;
        pizzaSize = size;
    }

    /**
     * Method to display the pizza information on the screen.
     */
    public void displayPizza()
    {
        drawPizza();
        drawTopLine();
        drawBottomLine();
    }

    /**
     * Method to set the pizza crust on the screen.
     * 
     * @param       newCrust
     */
    public void setPizzaCrust(String newCrust)
    {
        crust = newCrust;
    }

    /**
     * Method to set the pizza base on the screen.
     * 
     * @param       base
     */
    public void setBase(Color base)
    {
        baseSauce = base;
    }

    /**
     * Method to return the crust on the screen.
     * 
     * @return       crust
     */
    public String getBase()
    {
        return crust;
    }

    /**
     * Method to set the pizza size on the screen.
     * 
     * @param       newSize
     */
    public void setSize(String newSize)
    {
        pizzaSize = newSize;
    }

    /**
     * Method to return the pizza size on the screen.
     * 
     * @return      pizzaSize
     */
    public String getSize()
    {
        return pizzaSize;
    }

    /**
     * Method to return the pizza sauce on the screen.
     * 
     * @return     sauce
     */
    public String getColour()
    {
        if(baseSauce.equals (Color.orange)){
            sauce = "bbq";
        }
        else{
            sauce = "tomato";
        }
        return sauce;
    }

    /**
     * Method to display the pizza on the screen.
     */
    public void drawPizza()
    {
        canvas.setForegroundColor(Color.YELLOW);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 200);
        canvas.setForegroundColor(baseSauce);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 180);
        canvas.setForegroundColor(Color.WHITE);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 160);
    }

    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen. 
     * This method will display the pizza number and size at the top of the 
     * screen (once completed)
     */
    private void drawTopLine()
    {
        String topLine = "Pizza: " + getSize();

        double stringX = topLeftX+10;
        double stringY = topLeftY + 25;

        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(topLine, stringX, stringY);
    }

    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen.  
     * This method will display the type of crust and sauce ordered (once 
     * completed)
     */
    private void drawBottomLine()
    {
        String bottomLine = "Crust: " +getBase() + ", " + getColour() + " Sauce" ;

        double stringX = topLeftX+10;
        double stringY = topLeftY + 290;

        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(bottomLine, stringX, stringY);
    }

}
