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
    public Platfall()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(100)<2){
            addObject(new Platform(), Greenfoot.getRandomNumber(740)+30, 0);
        }
    }
}
