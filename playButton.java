import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends Actor
{
    /**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playButton()
    {
        GreenfootImage img = getImage();
        img.scale(300, 225);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
