import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platfall extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public Platfall()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //Create main part of main menu
        createMenu();
    }
    public void createMenu()
    {
        //Add play button
        addObject(new playButton(), 400, 300);
        //Add about the game button
        addObject(new infoIcon(), 782, 19);
        //Add keyBind button
        addObject(new keyBindButton(), 401,405);
        //Add mute button
    }
}
