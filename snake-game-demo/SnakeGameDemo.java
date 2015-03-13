
import java.util.Random;
/**
 * Write a description of class SnakeGameDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGameDemo
{
    // instance variables - replace the example below with your own
    private int x;
    private Canvas myCanvas;
    private Random random;

    /**
     * Constructor for objects of class SnakeGameDemo
     */
    public SnakeGameDemo()
    {
        myCanvas = new Canvas("snake demo", 600, 500);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void drawSnake()
    {
         int ground = 400;
        myCanvas.setVisible(true);
        myCanvas.drawLine(50, ground, 550, ground);
        myCanvas.drawLine(50, 550, ground, ground);
        myCanvas.drawLine(50, ground, ground, ground);
        myCanvas.drawLine(50, ground, 550, ground);
           
    }
}
