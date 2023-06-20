import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 
import java.util.Arrays;
/**
 * Write a description of class keyBindButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keyBindButton extends Actor
{
    public ArrayList keybinds;
    public keyBindButton(ArrayList keybinds)
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);
        
        this.keybinds = keybinds;
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            ((Platfall)getWorld()).keyBindContinue = false;
            if (!((Platfall)getWorld()).keyBindMenu){
               //Grays out background
                getWorld().addObject(new GrayBackground("keyBind",0), 400, 130);
                getWorld().addObject(new GrayBackground("keyBind",1), 50, 500);
                getWorld().addObject(new GrayBackground("keyBind",1), 750, 500);
                getWorld().addObject(new GrayBackground("keyBind",2), 400, 595);
                //Creates the textbox
                Textbox textbox = new Textbox(600, 600,0,"keyBind");
                getWorld().addObject(textbox, 401 ,475);
                //Creates the continue button
                getWorld().addObject(new okayButton(keybinds), 410,550);
            }
            //Creates the keyBind buttons
            getWorld().addObject(new KeyBinds(60,60, 0),250 ,490);
            getWorld().addObject(new KeyBinds(60,60, 1),300,490);
            getWorld().addObject(new KeyBinds(60,60, 2),275,450);
            getWorld().addObject(new KeyBinds(60,60, 3),510,490);
            getWorld().addObject(new KeyBinds(60,60, 4),560,490);
            getWorld().addObject(new KeyBinds(60,60, 5),535,450);
            //Creates the text
            getWorld().showText("Player 1", 275, 400);
            getWorld().showText("Player 2", 535, 400);
            ((Platfall)getWorld()).keyBindMenu = true;
        }
    }
}
