import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_3 extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Player_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getColor()!=null)
        changeColor();
    }    
}
