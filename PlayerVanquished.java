import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerVanquished here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerVanquished extends Actor
{
    /**
     * Act - do whatever the PlayerVanquished wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String playerColor;
    public PlayerVanquished(String color)
    {
        playerColor = color;
    }
    public PlayerVanquished()
    {
        
    }
    public void imageSelect()
    {
       if (playerColor.equals("blue"))
       {
           setImage("PlayerVanquishedBlue.png");
       }
       else if (playerColor.equals("yellow"))
       {
           setImage("PlayerVanquishedYellow.png");
       }
       else if (playerColor.equals("red"))
       {
           setImage("PlayerVanquishedRed.png");
       }
       else if (playerColor.equals("light_blue"))
       {
           setImage("PlayerVanquishedLightBlue.png");
       }
       else if (playerColor.equals("black"))
       {
           setImage("PlayerVanquishedBlack.png");
       }
       else if (playerColor.equals("green"))
       {
           setImage("PlayerVanquishedGreen.png");
       }
    }
    public void act() 
    {
        imageSelect();
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {   
        if(Greenfoot.mouseClicked(this))
            getWorld().removeObjects(getWorld().getObjects(PlayerVanquished.class));
        }
    }    
}
