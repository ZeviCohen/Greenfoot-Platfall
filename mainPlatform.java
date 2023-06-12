import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main_Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainPlatform extends Actor
{
    public Platfall platfall = (Platfall)getWorld();
    /**
     * Act - do whatever the Main_Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(platfall.player1.getHeight(), getY());
    }
}
