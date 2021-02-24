import java.awt.*;
/**
 * This draws topping two.
 *
 * @author 817852
 * @version 18 March 2017
 */
public class ToppingTwo extends Topping
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;

    /**
     * Constructor for Topping Two.
     * @param win the window to draw the topping on
     * @param topX the top-left x coordinate for the section of screen to draw pizza on
     * @param topY the top-left y coordinate for the section of screen to draw pizza on
     */
    public ToppingTwo(Canvas win, double topX, double topY)
    {        
        super(win,topX,topY);
        canvas = win;
        topLeftX = topX;
        topLeftY = topY;
    }

    /**
     * Method for drawing the second topping on the canvas
     */
    public void drawToppingTwo()
    {
        canvas.setForegroundColor(Color.RED);
        canvas.fillRectangle(topLeftX+0, topLeftY+0, 5, 20);
        canvas.fillRectangle(topLeftX+10, topLeftY+0, 5, 20);
        canvas.fillRectangle(topLeftX+20, topLeftY+0, 5, 20);
        canvas.setForegroundColor(Color.PINK);
        canvas.fillRectangle(topLeftX+5, topLeftY+0, 5, 20);
        canvas.fillRectangle(topLeftX+15, topLeftY+0, 5, 20);
    }
}
