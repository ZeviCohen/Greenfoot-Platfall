import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finishLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finishLine extends Actor
{
    /**
     * Act - do whatever the finishLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public finishLine(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
