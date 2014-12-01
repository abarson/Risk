import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class riskpic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class riskpic extends Actor
{
    /**
     * Act - do whatever the riskpic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public riskpic()
    {}
    public riskpic(int size)
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);  
        setImage(image);  
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
