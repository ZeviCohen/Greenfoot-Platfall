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
    private Integer number;
    
    //Define image
    private GreenfootImage image = getImage();
    
    //Gravity
    private int gravityVar;
    
    //To update text location
    private int[] currentLocation = new int[2];
    
    //Frozen or not
    private boolean frozen;
    
    //For cooldown on freezing
    private int cooldownVar;
    public Platform()
    {
        number = numbers.get(Greenfoot.getRandomNumber(numbers.size()));
        gravityVar = 5;
        frozen = false;
        cooldownVar = 0;
    }
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updateCooldown();
        checkFrozen();
        updatePosition();
        updateText();
        checkBottom();
    }
    public void updateCooldown()
    {
        if (cooldownVar<10 && cooldownVar != 0){
            cooldownVar++;
        } else if (cooldownVar==10){
            cooldownVar = 0;
        }
    }
    public void checkFrozen()
    {
        if (!frozen){
            if (Greenfoot.isKeyDown(number + "") && cooldownVar==0){
                gravityVar = 0;
                frozen = true;
                cooldownVar++;
            }
        } else{
            if (Greenfoot.isKeyDown(number + "")&& cooldownVar==0){
                gravityVar = 5;
                frozen = false;
                cooldownVar++;
            }
        }
    }
    public void updatePosition()
    {
        if (!frozen){
            setLocation(getX(),getY()+gravityVar);
        }
    }
    public void updateText()
    {
        getWorld().showText("", currentLocation[0], currentLocation[1]);
        getWorld().showText(number + "", getX(),getY());
        currentLocation[0] = getX();
        currentLocation[1] = getY();
    }
    private void checkBottom(){
        if(getY() > 597){
            getWorld().showText("", currentLocation[0], currentLocation[1]);
            getWorld().removeObject(this);
        }
    }
    public int getGravity()
    {
        return gravityVar;
    }
}
