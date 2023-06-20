import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class muteButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class muteButton extends Actor
{
    /**
     * Act - do whatever the muteButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Image variables
    private GreenfootImage mute;
    private GreenfootImage unmute;
    
    private int muteStatus;
    
    public muteButton()
    {
        mute = new GreenfootImage("ForUseImages/MuteImage.png");
        mute.scale(mute.getWidth()/10, mute.getHeight()/10);
        unmute = new GreenfootImage("ForUseImages/UnmuteImage.png");
        unmute.scale(unmute.getWidth()/10, unmute.getHeight()/10);
        setImage(unmute);
        muteStatus = 0;
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            if (muteStatus==0){
                setImage(mute);
                muteStatus = 1;
                ((Platfall)getWorld()).song.stop();
            } else {
                setImage(unmute);
                muteStatus = 0;
                ((Platfall)getWorld()).song.playLoop();
            }
            //TODO- Make music play and stop with the mute/unmute
        }
    }
}
