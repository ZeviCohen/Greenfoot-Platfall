import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keyBindButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keyBindButton extends Actor
{
    /**
     * Act - do whatever the keyBindButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public keyBindButton()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            //Creates the textbox
            Textbox textbox = new Textbox();
            getWorld().addObject(textbox, 0 ,0);
            //Creates the keyBind buttons
        }
    }
}
