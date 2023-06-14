import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 
import java.util.Arrays;

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    //To assign a number to each platform
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
    private Integer number = numbers.get(Greenfoot.getRandomNumber(numbers.size()));
    
    //Define image
    private GreenfootImage image = getImage();
    
    //Gravity
    private int gravityVar;
    private int[] currentLocation = new int[2];
    public Platform()
    {
        gravityVar = 5;
    }
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updatePosition();
        getWorld().showText("", currentLocation[0], currentLocation[1]);
        getWorld().showText(number + "", getX(),getY());
        currentLocation[0] = getX();
        currentLocation[1] = getY();
    }
    public void updatePosition()
    {
        setLocation(getX(),getY()+gravityVar);
    }
}
