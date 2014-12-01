import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aroll2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class aroll2 extends AttackButton
{
    /**
     * Act - do whatever the UnitDisplayBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setText()  
    {  
        updateImage(getAttackRoll2());  
    }  
      
    private void updateImage(int num)  
    {  
        String numUnits = ""+num;
        setImage(new GreenfootImage(numUnits, 25, Color.red, Color.white));  
    }  
    public void act() 
    {
        setText();
        hide();
    }    
    public void hide(){
        if (getAttackRoll2()==0)
            getImage().setTransparency(0);
        else
            getImage().setTransparency(255);
    }
}

