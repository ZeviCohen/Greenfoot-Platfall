import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 
import java.util.Arrays;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //Initialize the players
    public Player player1 = new Player(1, 50, new ArrayList<String>(Arrays.asList("left","right","up")));
    public Player player2 = new Player(2, 750, new ArrayList<String>(Arrays.asList("a","d","w")));
    
    //Initialize the mainPlatforms
    public mainPlatform mainPlatform1 = new mainPlatform(player1, false);
    public mainPlatform mainPlatform2 = new mainPlatform(player2, true);
    
    //Background gif
    private GifImage bg = new GifImage("images/Background.gif");
    
    public Game()
    {    
        // Create a new world
        super(800, 600, 1);
        setBackground(bg.getCurrentImage());
        //Creates the players
        addObject(player1, 50, 500);
        addObject(player2, 750, 500);
        //Creates the mainPlatforms
        addObject(mainPlatform1,65,565);
        addObject(mainPlatform2 ,735, 565);
        //Creates the finish line
        addObject(new finishLine(), 231,17);
        addObject(new finishLine(), 585, 17);
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(1000)<5){
            addObject(new Platform(), Greenfoot.getRandomNumber(519)+152, 40);
        }
        setBackground(bg.getCurrentImage());
    }
}
