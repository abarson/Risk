import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTurn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class PlayerTurn extends ReinforcementDisplay
{
    /**
     * Act - do whatever the PlayerTurn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imageSelect();
    }    
    public void imageSelect(){
        String color = getCurrentPlayerColor();
        if(color.equals("black"))
            setImage("BlackTurn.png");
        else if(color.equals("red"))
            setImage("RedTurn.png");
        else if(color.equals("blue"))
            setImage("BlueTurn.png");
        else if(color.equals("light_blue"))
            setImage("LightBlueTurn.png");
        else if(color.equals("yellow"))
            setImage("YellowTurn.png");
        else if(color.equals("green"))
            setImage("GreenTurn.png");
    }
    public String getCurrentPlayerColor(){
        return getPlayerOrder().get(getPlayerTurn()).getColor();
    }
}
