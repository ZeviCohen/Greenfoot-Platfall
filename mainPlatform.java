import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main_Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainPlatform extends Actor
{
    /**
     * Act - do whatever the Main_Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Player player;
    private int playerDeathVar;
    public mainPlatform(Player player)
    {
        this.player = player;
        playerDeathVar = 0;
        //Scale image
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2,image.getHeight()/2);
        setImage(image);
    }
    public void act()
    {
        if (playerDeathVar == 1){
            setLocation(getX(),player.getPlayerHeight()+(player.getImage().getHeight()/2));
            playerDeathVar = 0;
        }
    }
    public void setPlayerDeathVar(int var)
    {
        playerDeathVar = var;
    }
}
