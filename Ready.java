import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ready here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ready extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Ready wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound backgroundMusic;
    public Ready(GreenfootSound sound){
        getImage().setTransparency(150);
        backgroundMusic = sound; 
    }
    public void act() 
    {
        if(getPlayerAmounts()>0)
        getImage().setTransparency(255);
        else
        getImage().setTransparency(150);
        readyClick();
    }    
    public void readyClick(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this))
        {
            if (getImage().getTransparency()==255)
            {
                Greenfoot.setWorld(new Player_Color(getPlayerAmounts(),backgroundMusic));
            }
        }
        
    }
    }
}
