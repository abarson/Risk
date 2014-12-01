import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection_Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Selection_Buttons extends Actor
{
    /**
     * Act - do whatever the Player_Selection_Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int playerAmounts;
    
    public void act() 
    {
        // Add your action code here.
    }    
    public int getPlayerAmounts(){
        return playerAmounts;
    }
    public void setPlayerAmounts(int amounts){
        playerAmounts=amounts;
    }
    public boolean checkNumber(int number){
        return (playerAmounts==number);
    }
}
