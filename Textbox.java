import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    /**
     * Act - do whatever the Textbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String purpose;
    public Textbox(int width, int height, int rotation, String purpose)
    {
        GreenfootImage img = getImage();
        img.scale(width, height);
        setImage(img);
        setRotation(rotation);
        
        this.purpose = purpose;
    }
    
    public void act()
    {
        if (purpose.equals("keyBind")){
            if (((Platfall)getWorld()).keyBindContinue){
                getWorld().removeObject(this);
            }
        }
        if (purpose.equals("infoButton")){
            if (((Platfall)getWorld()).infoBoxExit){
                getWorld().removeObject(this);
            }
        }
    }
}
