import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tank extends Actor
{
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String img;
    private GifImage gifImage;
    private boolean visible;
    public Tank(String img)
    {
        this.img = img;
        gifImage = new GifImage(img);
    }
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }
    public boolean isVisible()
    {
        return visible;
    }
    public void setVisible(boolean v)
    {
        visible = v;
    }
}
