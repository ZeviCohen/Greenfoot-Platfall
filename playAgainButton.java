import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class playAgainButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgainButton extends Actor
{
    /**
     * Act - do whatever the playAgainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ArrayList keybinds;
    public playAgainButton(ArrayList keybinds){
        this.keybinds = keybinds;
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Game(keybinds));
        }
    }
}
