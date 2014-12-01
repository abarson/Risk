import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FMinus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FMinus extends FortifyingScreenTemplate
{
    /**
     * Act - do whatever the FMinus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }    
    public void check(){
        if(getFortifyUnits()>getMandatoryMoveUnits())
            decrementFortifyUnits();
    }
    public void clicked(){
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this))
            check();
        }
    }
}
