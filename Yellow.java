import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yellow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yellow extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Yellow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String yellow;
    
    public Yellow(){
        yellow = "yellow";
    }
    public void act() 
    {
        if (getYellow()==0);
            show();
        canChangeColor(yellow);
        if(getYellow()>0)
        {
        hide();
        if(getRed()>0&&getYellowPos()==getRedPos()&&getRedPos()!=0)
        {
            setRed();
            setRedPos();
        }
        else if(getBlue()>0&&getYellowPos()==getBluePos()&&getBluePos()!=0)
        {
            setBlue();
            setBluePos();
        }
        else if(getGreen()>0&&getYellowPos()==getGreenPos()&&getGreenPos()!=0)
        {
            setGreen();
            setGreenPos();
        }
        else if(getLightBlue()>0&&getYellowPos()==getLightBluePos()&&getLightBluePos()!=0)
        {
            setLightBlue();
            setLightBluePos();
        }
        else if(getBlack()>0&&getYellowPos()==getBlackPos()&&getBlackPos()!=0)
        {
            setBlack();
            setBlackPos();
        }
        }   
        
    }    
    public boolean isShowing(){
        return (getYellow()!=1);
    }
}
