import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Selection_4 extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Player_Selection_4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Tank tank4;
    public Player_Selection_4(Tank tank){
        tank4 = tank;
        getImage().setTransparency(150);
        tank4.getImage().setTransparency(0);
        if (getPlayerAmounts()==4)
        {
            getImage().setTransparency(255);
            tank4.setVisible(true);
    }
}
    public void act() 
    {
        choosePlayers();
        if (!checkNumber(4))
        {
        getImage().setTransparency(150);
        tank4.setVisible(false);
    }
}    
    public void choosePlayers(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this) && clicked==1)
        {
            setPlayerAmounts(4);
            getImage().setTransparency(255);
            tank4.setVisible(true);
        }
        
        }
    }
}
