import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FortifyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FortifyButton extends ReinforcementDisplay
{
    /**
     * Act - do whatever the FortifyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImageTransparency();
       fortifying();
    }    
    public void setImageTransparency(){
        if (!getGameStart()||getCurrentPlayer().getNumUnits()!=0||isAttacking()||getFortifying())
            getImage().setTransparency(150);
        else
            getImage().setTransparency(255);
    }
    public void fortifying(){
       {
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this)&&getImage().getTransparency()==255&&getFortifying()==false){
            setFortifying(true);
            setCurrentlyClickedTerritory(null);
            setDefendingTerritory(null);
        }
        }
    }   
    }
}
