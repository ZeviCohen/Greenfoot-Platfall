import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int winner)
    {    
        // Create a new world
        super(800, 600, 1);
        
        //End text
        showText("Player " + winner + " wins!!!", 400, 200);
        
        //Restart button
        addObject(new playAgainButton(), 400, 400);
    }
}