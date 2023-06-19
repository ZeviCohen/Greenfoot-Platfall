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
    //Initialize the players
    public Player player1 = new Player(1, 50);
    public Player player2 = new Player(2, 750);
    
    //Initialize the mainPlatforms
    public mainPlatform mainPlatform1 = new mainPlatform(player1, false);
    public mainPlatform mainPlatform2 = new mainPlatform(player2, true);
    public Platfall()
    {    
        // Create a new world
        super(800, 600, 1);
        //Creates the players
        addObject(player1, 50, 500);
        //addObject(player2, 750, 500);
        //Creates the mainPlatforms
        addObject(mainPlatform1,65,560);
        addObject(mainPlatform2 ,735, 560);
        //Creates the finish line
        addObject(new finishLine(), 231,17);
        addObject(new finishLine(), 585, 17);
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(1000)<5){
            addObject(new Platform(), Greenfoot.getRandomNumber(720)+40, 40);
        }
    }
}
