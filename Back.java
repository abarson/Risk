import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Player_Selection_Buttons
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound backgroundMusic;
    public Back(GreenfootSound sound)
    {
       backgroundMusic = sound; 
    }
    public void act() 
    {
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this) && clicked==1)
        {
            setPlayerAmounts(0);
            //backgroundMusic.stop();
            Greenfoot.setWorld(new Menu(backgroundMusic));
        }
    
    }    
}
}
