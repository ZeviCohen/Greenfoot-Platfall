import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GrayBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrayBackground extends Actor
{
    /**
     * Act - do whatever the GrayBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String purpose;
    public GrayBackground(String purpose, int type)
    {
        this.purpose = purpose;
        GreenfootImage img = getImage();
        if (purpose.equals("keyBind")){
            if (type==1){
                img.scale(300, 280);
                img.mirrorVertically();
            }
            else if (type==2){
                img.scale(400, 17);
                img.mirrorVertically();
            }
        }
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
        if (purpose.equals("keyBind")){
            if (((Platfall)getWorld()).keyBindContinue){
                getWorld().removeObject(this);
            }
        }
    }
}
