import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Selection_2 extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Player_Selection_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Tank tank2;
    public Player_Selection_2(Tank tank){
        tank2 = tank;
        getImage().setTransparency(150);
        tank2.getImage().setTransparency(0);
        if (getPlayerAmounts()==2)
        {
            getImage().setTransparency(255);
            tank2.setVisible(true);
        }
        
    }
    public void act() 
    {
        choosePlayers();
        if (!checkNumber(2))
        {
        getImage().setTransparency(150);
        tank2.setVisible(false);
    }
    }    
    
    public void choosePlayers(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this))
        {
            setPlayerAmounts(2);
            getImage().setTransparency(255);
            tank2.setVisible(true);
        }
        
        
    }
}
}
