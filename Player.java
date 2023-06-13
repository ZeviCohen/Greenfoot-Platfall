import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //Variables
    private int platformHeight;
    private int speed;
    //Animation variables
    private boolean walkAnimation;
    private GreenfootImage walk1;
    private GreenfootImage walk2;
    private GreenfootImage jumpImage;
    //Jump Variables
    private boolean isJump;
    private boolean touchingPlatform;
    private String direction;
    private int cooldownVar;
    private int jumpCount;
    public Player(){
        //Resize the image
        GreenfootImage img = getImage();
        img.scale(50, 75);
        setImage(img);
        //Other variables
        platformHeight = 0;
        speed = 5;
        walkAnimation = false;
        //walk1 is default image
        walk1 = new GreenfootImage("ForUseImages/playerGrey_walk1.png");
        walk2 = new GreenfootImage("ForUseImages/playerGrey_walk2.png");
        jumpImage = new GreenfootImage("ForUseImages/playerGrey_up2.png");
        //TODO- put file in for walk1, walk2 and jumpImage(they are images for animation)
        //Variables for jump
        isJump = false;
        jumpCount = 7;
        touchingPlatform = true;
        direction = "up";
        cooldownVar = 0;
    }
    public void act()
    {
        //For updating mainPlatform height
        checkHeight();
        //To move the player
        checkKeyPresses();
        //This is basic jump but will not work for multiple platforms. Will work on later
        //checkJump();
        if (!isJump){
            //walkAnimation();
        }
    }
    public void checkHeight()
    {
        if (getY()>platformHeight){
            platformHeight = getY();
        }
    }
    public void checkKeyPresses()
    {
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
            walkAnimation = true;
        }
        else if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
            walkAnimation = true;
        }
        else{
            walkAnimation = false;
        }
    }
    public void checkJump()
    {
        //Update cooldownVar. This makes it so the player location is updated every other few frames slowing down the animation
        if (cooldownVar<3){
            cooldownVar++;
        } else if (cooldownVar==0){
            cooldownVar=0;
        }
        if (isJump){
                setImage(jumpImage);
                if (cooldownVar==0){
                    if(jumpCount>0 & direction =="up"){
                            setLocation(getX(), getY()-(int)(Math.pow(jumpCount,2)));
                            jumpCount--;
                    }
                    if(jumpCount==0){
                        direction = "down";
                    }
                    if(jumpCount<=7 & direction == "down"){
                        setLocation(getX(), getY()+(int)(Math.pow(jumpCount,2)));
                        jumpCount++;
                    }
                    if (jumpCount == 8){
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
            setImage(walk2);
            setImage(walk1);
        }
        else{
            setImage(walk1);
        }
    }
    public int getPlayerHeight(){
        return platformHeight;
    }
}
