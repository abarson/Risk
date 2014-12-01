import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spinningGlobeSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spinningGlobeSmall extends Actor
{
    /**
     * Act - do whatever the spinningGlobe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String img;
    private GifImage gifImage;
    public spinningGlobeSmall(String img)
    {
        this.img = img;
        gifImage = new GifImage(img);
    }
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
