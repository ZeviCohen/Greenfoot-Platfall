import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoIcon extends Actor
{
    /**
     * Act - do whatever the infoIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public infoIcon()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/10, img.getHeight()/10);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}