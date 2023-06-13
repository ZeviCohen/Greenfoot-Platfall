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
        getWorld().showText(number + "", getX(),getY());
    }
    public void updatePosition()
    {
        setLocation(getX(),getY()+gravityVar);
    }
}
