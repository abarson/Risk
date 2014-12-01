import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Territories here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Territories extends ReinforcementDisplay
{
    /**
     * Act - do whatever the Territories wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int clicks;
    private static String currentColor;
    public String color;
    
    public String getCurrentColor(){
        return currentColor;
    }
    public void setCurrentColor(String theColor){
        currentColor=theColor;
    }
    public void setOccupyingPlayer(Player player){
        
    }
    public int getCurrentPlayerTurn(){
        return getPlayerTurn();
    }
    public void act() 
    {
    }   
    public String getName(){
        return null;
    }
    public int getOccupiedUnits(){
        return 0;
    }
    public void setOccupiedUnits(int a){
    }
    public Player getOccupyingPlayer(){
        return null;
    }
}
