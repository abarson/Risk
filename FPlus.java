import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FPlus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FPlus extends FortifyingScreenTemplate
{
    /**
     * Act - do whatever the FPlus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }   
    public void check(){
        if(getFortifyUnits()<getCurrentlyClickedTerritory().getOccupiedUnits()-1)
            incrementFortifyUnits();
    }
    public void clicked(){
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this))
            check();
        }
    }
}
