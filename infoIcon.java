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
    private boolean open;
    public infoIcon()
    {
        GreenfootImage img = getImage();
        img.scale(45, 45);
        setImage(img);
        open = false;
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            if (!open){
                open = true;
                ((Platfall)getWorld()).infoBoxExit = false;
                ((Platfall)getWorld()).keyBindContinue = false;
                getWorld().setPaintOrder(infoIcon.class, Textbox.class);
                //Creates the gray out
                getWorld().addObject(new GrayBackground("infoButton",1), 268, 301);
                getWorld().addObject(new GrayBackground("infoButton",2), 718, 561);
                //Creates the text box
                getWorld().addObject(new Textbox(600,600,90, "infoButton"),682,207);
            }
            else{
                ((Platfall)getWorld()).infoBoxExit = true;
                open = false;
            }
        }
    }
}
