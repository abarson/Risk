import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SouthernEuropeUnitDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class SouthernEuropeUnitDisplay extends SouthernEurope{
    /**
     * Act - do whatever the UnitDisplayBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setText()  
    {  
        updateImage(getOccupiedUnits());  
    }  
      
    private void updateImage(int num)  
    {  
        String numUnits = ""+num;
        setImage(new GreenfootImage(numUnits, 25, Color.black, Color.white));  
    }  
    public void act() 
    {
        fortify();
        updateClickedTerritory();
        placeReinforcement();
        defend();
        setText();
    }    
}
