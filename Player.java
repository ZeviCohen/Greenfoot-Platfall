import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //Player dependent variables
    private int playerNum;
    private int respawnX;
    private ArrayList keyBinds;
    //Variables
    private int platformHeight;
    private int speed;
    //Animation variables
    private boolean walkAnimation;
    private GreenfootImage walk1;
    private GreenfootImage walk2;
    private int walkState;
    private GreenfootImage jumpImage;
    //Jump Variables
    private boolean isJump;
    private boolean touchingPlatform;
    private String direction;
    private int cooldownVar;
    private int jumpCount;
    //Gravity Variables
    private int gravityVar;
    public Player(int playerNum, int respawnX, ArrayList keyBinds){
        //Player dependent variables
        this.playerNum = playerNum;
        this.respawnX = respawnX;
        this.keyBinds = keyBinds;
        //Other variables
        platformHeight = 500;
        speed = 5;
        //Animation variables
        walk1 = new GreenfootImage("ForUseImages/playerGrey_walk1.png");
        walk2 = new GreenfootImage("ForUseImages/playerGrey_walk2.png");
        walk1.scale(54,67);
        walk2.scale(54,64);
        setImage(walk1);
        walkState = 1;
        walkAnimation = false;
        jumpImage = new GreenfootImage("ForUseImages/playerGrey_up2.png");
        jumpImage.scale(54,58);
        //TODO- put file in for walk1, walk2 and jumpImage(they are images for animation)
        //Variables for jump
        isJump = false;
        jumpCount = 7;
        touchingPlatform = true;
        direction = "up";
        cooldownVar = 0;
        //Initializes gravity to 0;
        gravityVar = 0;
    }
    public void act()
    {
        updateCooldown();
        //Check if player is touching a platform
        checkPlatform();
        //Makes the player fall if not touching a platform. If touching a platform the player will fall if that platform is falling.
        checkGravity();
        //To move the player
        checkKeyPresses();
        //This is basic jump but will not work for multiple platforms. Will work on later
        checkJump();
        if (!isJump){
            walkAnimation();
        }
        //Checks if the player dies
        checkDeath();
        //Checks if the player wins
        checkWin();
    }
    public void updateCooldown(){
        //Update cooldownVar. This makes it so the player location is updated every other few frames slowing down the animation
        if (cooldownVar<3){
            cooldownVar++;
        } else if (cooldownVar==3){
            cooldownVar=0;
        }
    }
    public void checkHeight()
    {
        if (getY()<platformHeight){
            platformHeight = getY();
        }
    }
    public void checkPlatform()
    {
       Platform detected1 = (Platform) getOneObjectAtOffset(0,-getImage().getHeight()/2,Platform.class);
       Platform detected2 = (Platform) getOneObjectAtOffset(0,getImage().getHeight()/2+8,Platform.class);
       mainPlatform detectedMainPlatform = (mainPlatform) getOneObjectAtOffset(0,getImage().getHeight()/2 + 8,mainPlatform.class);
       if (detected1 != null && detected1.frozen != true ) {
           respawn();
       }
       else if (detected2 != null) {
           touchingPlatform = true;
           setLocation(getX(),detected2.getY() - detected2.getImage().getHeight());
           gravityVar = detected2.getGravity();
       }
       if (detectedMainPlatform != null) {
           touchingPlatform = true;
       } 
    }
    public void checkGravity()
    {
        if (!isJump && !isTouching(mainPlatform.class) && !isTouching(Platform.class)){
            isJump = true;
            direction = "down";
            jumpCount = 0;
            touchingPlatform = false;
        }
        else if(!isJump && isTouching(Platform.class)){
            ;
        }
        else{
            gravityVar = 0;
        }
        setLocation(getX(), getY()+gravityVar);
    }
    public void checkKeyPresses()
    {
        String left = "";
        String right = "";
        String up = "";
        if (playerNum==1){
            left = keyBinds.get(0)+"";
            right = keyBinds.get(1)+"";
            up = keyBinds.get(2)+"";
        } else if (playerNum==2){
            left = keyBinds.get(3)+"";
            right = keyBinds.get(4)+"";
            up = keyBinds.get(5)+"";
        }
        if (Greenfoot.isKeyDown(left)){
                setLocation(getX() - speed, getY());
                walkAnimation = true;
            }
            else if (Greenfoot.isKeyDown(right)){
                setLocation(getX() + speed, getY());
                walkAnimation = true;
            }
            else{
                walkAnimation = false;
                setImage(walk1);
            }
        //Jump check
        if (Greenfoot.isKeyDown(up)){
            isJump = true;
        }
    }
    public void checkJump()
    {
        if (isJump){
                setImage(jumpImage);
                if (cooldownVar==0){
                    if(jumpCount>0 & direction =="up"){
                            setLocation(getX(), getY()-(int)(Math.pow(jumpCount,2)));
                            jumpCount--;
                            touchingPlatform = false;
                    }
                    if(jumpCount==0){
                        direction = "down";
                    }
                    if(!touchingPlatform & direction == "down"){
                        setLocation(getX(), getY()+(int)(Math.pow(jumpCount,2)));
                        jumpCount++;
                    }
                    if (touchingPlatform){
                        direction = "up";
                        jumpCount = 7;
                        setImage(walk1);
                        isJump=false;
                    }
                }
        }
    }
    public void walkAnimation()
    {
        if (walkAnimation){
            if (walkState==1 && cooldownVar==0){
                setImage(walk2);
                walkState=2;
            } else if (walkState==2 && cooldownVar==0){
                setImage(walk1);
                walkState=1;
            }
        }
    }
    public void checkDeath()
    {
        if (getY()>600-(getImage().getHeight()/2))
        {
            respawn();
        }
    }
    public void respawn()
    {
        
        if (playerNum == 1){
            ((Game)getWorld()).mainPlatform1.setPlayerDeathVar(1);
        } else if (playerNum == 2){
            ((Game)getWorld()).mainPlatform2.setPlayerDeathVar(1);
        }
        //Respawns to the highest point the player has been (stored in platformHeight)
        setLocation(respawnX, platformHeight);
    }
    public void checkWin(){
        if (isTouching(finishLine.class)){
            Greenfoot.setWorld(new GameOver(playerNum, keyBinds));
        }
    }
    public int getPlayerHeight(){
        return platformHeight;
    }
}