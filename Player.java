import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.awt.Color;
public class Player
{

    private int playerNumber;
    private int numUnits;
    private String color;
    private ArrayList<Territories>list;
    public Player(int number, int units, String theColor, ArrayList<Territories>list)
    {    
        playerNumber = number;
        numUnits = units;
        color = theColor;
        this.list = list;
    }
    public String getColor(){
        return color;
    }
    public ArrayList<Territories> getTerritories(){
        return list;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public int getNumUnits(){
        return numUnits;
    }
    public void setNumUnits(int num){
        numUnits = num;
    }
    public void setPlayerNumber(int num)
    {
        playerNumber = num;
    }
    public boolean hasNorthAmerica(){
        int check = 0;
        for (int i = 0; i<getTerritories().size(); i++)
        {
        if(getTerritories().get(i).getName().equals("Alaska")||getTerritories().get(i).getName().equals("Alberta")||getTerritories().get(i).getName().equals("Mexico")||getTerritories().get(i).getName().equals("EasternUnitedStates")||getTerritories().get(i).getName().equals("Greenland")||getTerritories().get(i).getName().equals("NorthWestTerritory")||getTerritories().get(i).getName().equals("Ontario")||getTerritories().get(i).getName().equals("Quebec")||getTerritories().get(i).getName().equals("WesternUnitedStates"))
        check++;
    }
    return (check==9);
}
    
    public void removeTerritory(String territoryName){
        for (int i = 0; i<list.size();i++){
            if(list.get(i).getName().equals(territoryName))
                list.remove(i);
        }
    }
}
