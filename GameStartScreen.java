import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStartScreen extends Actor
{
    /**
     * Act - do whatever the GameStartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {   
        if(Greenfoot.mouseClicked(this))
            getWorld().removeObjects(getWorld().getObjects(GameStartScreen.class));
        }
    }    
}
