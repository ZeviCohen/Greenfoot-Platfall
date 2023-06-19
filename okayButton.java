import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class okayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class okayButton extends Actor
{
    /**
     * Act - do whatever the okayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public okayButton(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/12, img.getHeight()/12);
        setImage(img);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
             ((Platfall)getWorld()).keyBindContinue = true;
             getWorld().removeObject(this);
        }
    }
}
