import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 
import java.util.Arrays;
/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platfall extends World
{
    public ArrayList<String> keybinds = new ArrayList<>(Arrays.asList("left","right","up","a", "d", "w"));
    public boolean keyBindMenu;
    public KeyBinds selected;
    private ArrayList<String> textForKeybinds = new ArrayList<>(Arrays.asList("left","right","up","a", "d", "w"));
    public boolean keyBindContinue;
    public boolean infoBoxExit;
    private ArrayList<String> forbiddenKeyBindings = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
    
    //For Background
    private GifImage bg = new GifImage("ForUseImages/StartBackground.gif");
    public Platfall()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //Create main part of main menu
        createMenu();
        
        keyBindMenu = false;
        selected = null;
        keyBindContinue = false;
        infoBoxExit = false;
    }
    public void createMenu()
    {
        //Set Background
        bg.getCurrentImage().scale(800,600);
        setBackground(bg.getCurrentImage());
        //Add Title
        addObject(new Title(), 410, 60);
        //Add play button
        addObject(new playButton(), 400, 300);
        //Add about the game button
        addObject(new infoIcon(), 777, 20);
        //Add keyBind button
        addObject(new keyBindButton(keybinds), 401,405);
        //Add mute button
    }
    public ArrayList getKeybinds(){
        return keybinds;
    }
    public void act()
    {
        bg.getCurrentImage().scale(800,600);
        setBackground(bg.getCurrentImage());
        if (keyBindMenu)
        {
            if (selected != null){
                int num = selected.number;
                String key = Greenfoot.getKey();
                if (key != null && !forbiddenKeyBindings.contains(key)){
                    keybinds.set(num, key);
                    textForKeybinds.set(num, key);
                    selected = null;
                }
            }
            //Creates text to show keybinds
            showText(textForKeybinds.get(0),250 ,490);
            showText(textForKeybinds.get(1),300,490);
            showText(textForKeybinds.get(2),275,450);
            showText(textForKeybinds.get(3),510,490);
            showText(textForKeybinds.get(4),560,490);
            showText(textForKeybinds.get(5),535,450);
        } else{
            //Hides the text
            showText("",250 ,490);
            showText("",300,490);
            showText("",275,450);
            showText("",560,490);
            showText("",510,490);
            showText("",535,450);
            showText("",275,400);
            showText("",535,400);
        }
    }
}
