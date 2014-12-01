import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AllButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllButton extends FortifyingScreenTemplate
{
    /**
     * Act - do whatever the AllButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }  
    public void clicked()
    {
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this))
            setFortifyUnits(getCurrentlyClickedTerritory().getOccupiedUnits()-1);
        }
    }
}
