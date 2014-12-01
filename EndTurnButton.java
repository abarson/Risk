import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndTurnButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndTurnButton extends ReinforcementDisplay
{
    /**
     * Act - do whatever the EndTurnButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImageTransparency();
        endTurn();
    }    
    public void setImageTransparency(){
        if (!getGameStart()||getCurrentPlayer().getNumUnits()!=0||isAttacking())
            getImage().setTransparency(150);
        else
            getImage().setTransparency(255);
    }
    public void endTurn(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this)&&getImage().getTransparency()==255)
            setPlayerTurn();
        }
    }
}
