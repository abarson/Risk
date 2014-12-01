import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Selection_3 extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Player_Selection_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Tank tank3;
    public Player_Selection_3(Tank tank){
        tank3 = tank;
        getImage().setTransparency(150);
        tank3.getImage().setTransparency(0);
        if (getPlayerAmounts()==3)
        {
            getImage().setTransparency(255);
            tank3.setVisible(true);
    }
}
    public void act() 
    {
        choosePlayers();
        if (!checkNumber(3))
        {
        getImage().setTransparency(150);
        tank3.setVisible(false);
    }
}    
    public void choosePlayers(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this) && clicked==1)
        {
            setPlayerAmounts(3);
            getImage().setTransparency(255);
            tank3.setVisible(true);
        }
        
    }
}}
