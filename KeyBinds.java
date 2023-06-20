import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyBinds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyBinds extends Actor
{
    /**
     * Act - do whatever the KeyBinds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Fill in
    private String selectedImage = "";
    public int number;
    public KeyBinds(int width, int height, int number)
    {
        GreenfootImage img = getImage();
        img.scale(width, height);
        setImage(img);
        
        /*
         * 1 - player1up; 2 - player1left; 3 - player1right
         * 4 - player2up; 5 - player2left; 3 - player3right
         */
        this.number = number;
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            ((Platfall)getWorld()).selected = this;
        }
        if (((Platfall)getWorld()).keyBindContinue){
            getWorld().removeObject(this);
        }
    }
}
