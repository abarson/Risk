import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class Player_Selection_6 extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Player_Selection_6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Tank tank6;
    public Player_Selection_6(Tank tank){
        tank6 = tank;
        getImage().setTransparency(150);
        tank6.getImage().setTransparency(0);
        if (getPlayerAmounts()==6)
        {
            getImage().setTransparency(255);
            tank6.setVisible(true);
    }
}
    public void act() 
    {
        choosePlayers();
        if (!checkNumber(6))
        {
        getImage().setTransparency(150);
        tank6.setVisible(false);
    }
}    
    public void choosePlayers(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this))
        {
            setPlayerAmounts(6);
            getImage().setTransparency(255);
            tank6.setVisible(true);
        }
        }
    }
}
