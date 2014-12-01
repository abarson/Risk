import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InitialDeploymentScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InitialDeploymentScreen extends Actor
{
    /**
     * Act - do whatever the InitialDeploymentScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {   
        if(Greenfoot.mouseClicked(this))
            getWorld().removeObjects(getWorld().getObjects(InitialDeploymentScreen.class));
        }
    }    
}
