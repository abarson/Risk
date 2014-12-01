import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plus extends AttackScreenTemplate
{
    /**
     * Act - do whatever the Plus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }    
    public void check(){
        if(getAttackingUnits()<3&&getCurrentlyClickedTerritory().getOccupiedUnits()>getAttackingUnits()+1)
            incrementAttackingUnits();
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
