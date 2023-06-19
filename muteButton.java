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
    private String mute;
    private String unmute;
    
    private int muteStatus;
    
    public muteButton()
    {
        mute = "ForUseImages/MuteImage.png";
        unmute = "ForUseImages/UnmuteImage.png";
        
        muteStatus = 0;
    }
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            if (muteStatus==0){
                setImage(mute);
                muteStatus = 1;
            } else {
                setImage(unmute);
                muteStatus = 0;
            }
            //TODO- Make music play and stop with the mute/unmute
        }
    }
}
