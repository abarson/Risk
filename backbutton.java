import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backbutton extends Player_Color_Buttons
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound backgroundMusic;
    public backbutton(GreenfootSound sound)
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
            setY(0);
            setColor(null);
            setBlackPos();
            setBlack();
            setYellowPos();
            setYellow();
            setGreenPos();
            setGreen();
            setRedPos();
            setRed();
            setLightBluePos();
            setLightBlue();
            setBluePos();
            setBlue();
            setFirstRow();
            setSecondRow();
            setThirdRow();
            setFourthRow();
            setFifthRow();
            setSixthRow();
            Greenfoot.setWorld(new Player_Selection(backgroundMusic));
        }
        }
    }    
}
