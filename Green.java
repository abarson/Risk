import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Green wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String green;
    
    public Green(){
        green = "green";
    }
    public void act() 
    {
        if (getGreen()==0);
            show();
        canChangeColor(green);
        if(getGreen()>0)
        {
        hide();
        if(getRed()>0&&getGreenPos()==getRedPos())
        {
            setRed();
            setRedPos();
        }
        else if(getBlue()>0&&getGreenPos()==getBluePos())
        {
            setBlue();
            setBluePos();
        }
        else if(getBlack()>0&&getGreenPos()==getBlackPos())
        {
            setBlack();
            setBlackPos();
        }
        else if(getLightBlue()>0&&getGreenPos()==getLightBluePos())
        {
            setLightBlue();
            setLightBluePos();
        }
        else if(getYellow()>0&&getGreenPos()==getYellowPos())
        {
            setYellow();
            setYellowPos();
        }   
    } 
         
}
public boolean isShowing(){
        return (getGreen()!=1);
    }
}
