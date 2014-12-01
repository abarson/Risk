import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReinforcementBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReinforcementBox extends ReinforcementDisplay
{
    /**
     * Act - do whatever the ReinforcementBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getDisplayUnits(){
        return getPlayerOrder().get(getPlayerTurn()).getNumUnits();
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
