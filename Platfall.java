import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platfall extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Player player1 = new Player();
    public Player player2 = new Player();
    public Platfall()
    {    
        // Create a new world
        super(800, 600, 1);
        //Creates the players
        //addObject(player1, 20, 560);
        //addObject(player2, 680, 40);
        //Creates the mainPlatforms
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(1000)<2){
            addObject(new Platform(), Greenfoot.getRandomNumber(720)+40, 40);
        }
    }
}
