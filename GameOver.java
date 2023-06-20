import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    //Background gif
    private GifImage bg = new GifImage("ForUseImages/endScreenGif.gif");
    //For music
    public GreenfootSound song;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int winner, ArrayList keybinds)
    {    
        // Create a new world
        super(800, 600, 1);
        
        //End text
        showText("Player " + winner + " wins!!!", 400, 200);
        
        //Restart button
        addObject(new playAgainButton(keybinds), 400, 400);
    }
    
    public void act()
    {
        bg.getCurrentImage().scale(800, 600);
        setBackground(bg.getCurrentImage());
    }
}
