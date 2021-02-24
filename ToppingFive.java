import java.awt.*;
/**
 * This class draws topping Five
 *
 * @author 817852
 * @version 18 March 2018
 */
public class ToppingFive extends Topping
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;

    /**
     * Constructor for Topping Five.
     * @param win the window to draw the topping on
     * @param topX the top-left x coordinate for the section of screen to draw pizza on
     * @param topY the top-left y coordinate for the section of screen to draw pizza on
     */
    public ToppingFive(Canvas win, double topX, double topY)
    {        
        super(win,topX,topY);
        canvas = win;
        topLeftX = topX;
        topLeftY = topY;

    }

    /**
     * Method for drawing the fifth topping on the canvas
     */
    public void drawToppingFive()
    {
        canvas.setForegroundColor(Color.GREEN);
        canvas.fillCircle(topLeftX+14, topLeftY+14, 25);
        canvas.setForegroundColor(Color.WHITE);
        canvas.fillCircle(topLeftX+14, topLeftY+14, 20);
        canvas.setForegroundColor(Color.BLACK);
        canvas.fillCircle(topLeftX+15, topLeftY+15, 5);
        canvas.fillCircle(topLeftX+10, topLeftY+15, 5);
        canvas.fillCircle(topLeftX+20, topLeftY+15, 5);
        canvas.fillCircle(topLeftX+15, topLeftY+20, 5);
        canvas.fillCircle(topLeftX+15, topLeftY+10, 5);
    }
}
