import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartBackground extends Actor
{
    /**
     * Act - do whatever the StartBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public StartBackground(){
        GreenfootImage img = getImage();
        img.scale(800, 600);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
