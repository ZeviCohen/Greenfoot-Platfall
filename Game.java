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
    
    public mainPlatform mainPlatform1;
    public mainPlatform mainPlatform2;
    
    //Background gif
    private GifImage bg = new GifImage("images/Background.gif");
    public Game(ArrayList keybinds)
    {    
        // Create a new world
        super(800, 600, 1);
        setBackground(bg.getCurrentImage());
        
        //Keybinds
        ArrayList<String> player1Keybinds = new ArrayList(Arrays.asList(keybinds.get(0), keybinds.get(1), keybinds.get(2),keybinds.get(3),keybinds.get(4),keybinds.get(5)));
        ArrayList<String> player2Keybinds = new ArrayList(Arrays.asList(keybinds.get(0), keybinds.get(1), keybinds.get(2),keybinds.get(3),keybinds.get(4),keybinds.get(5)));
    
        //Initialize the players
        Player player1 = new Player(1, 50, player1Keybinds);
        Player player2 = new Player(2, 750, player2Keybinds);
        
        //Initialize the mainPlatforms
        mainPlatform1 = new mainPlatform(player1, false);
        mainPlatform2 = new mainPlatform(player2, true);
        
        //Creates the players
        addObject(player1, 50, 500);
        addObject(player2, 750, 500);
        
        //Creates the mainPlatforms
        addObject(mainPlatform1,65,565);
        addObject(mainPlatform2 ,735, 565);
        
        //Creates the finish line
        addObject(new finishLine(), 100,15);
        addObject(new finishLine(), 358, 15);
        addObject(new finishLine(), 616, 15);
        addObject(new finishLine(), 715, 15);
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(1000)<5){
            addObject(new Platform(), Greenfoot.getRandomNumber(519)+152, 40);
        }
        setBackground(bg.getCurrentImage());
    }
}
