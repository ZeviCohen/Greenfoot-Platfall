import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class okayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class okayButton extends Actor
{
    /**
     * Act - do whatever the okayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean duplicateApproval = true;
    private String currentKey;
    private ArrayList<String> keybinds;
    public okayButton(ArrayList<String> keybinds){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()/12, img.getHeight()/12);
        setImage(img);
        this.keybinds = keybinds;
    }
    public void act()
    {
        ArrayList<String> destroyKeyBinds = new ArrayList<String>();
        destroyKeyBinds.addAll(keybinds);
        duplicateApproval = true;
        if (Greenfoot.mouseClicked(this)){
            for(int j = 0; j < keybinds.size(); j ++){
                currentKey = keybinds.get(j);
                destroyKeyBinds.remove(currentKey);
                if(destroyKeyBinds.contains(currentKey)){
                    getWorld().showText("Warning: Duplicate Values Found", 275, 400);
                    duplicateApproval = false;
                }
            }
            if(duplicateApproval){
                ((Platfall)getWorld()).keyBindContinue = true;
                ((Platfall)getWorld()).keyBindMenu = false;
                getWorld().removeObject(this);
            }
        }
    }
}
