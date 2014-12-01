import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String blue;
    
    public Blue(){
        blue = "blue";
    }
    public void act() 
    {
        
        if (getBlue()==0);
            show();
        canChangeColor(blue);
        if(getBlue()>0)
        {
        hide();
        if(getRed()>0&&getBluePos()==getRedPos()&&getRedPos()!=0)
        {
            setRed();
            setRedPos();
        }
        else if(getBlack()>0&&getBluePos()==getBlackPos()&&getBlackPos()!=0)
        {
            setBlack();
            setBlackPos();
        }
        else if(getGreen()>0&&getBluePos()==getGreenPos()&&getGreenPos()!=0)
        {
            setGreen();
            setGreenPos();
        }
        else if(getLightBlue()>0&&getBluePos()==getLightBluePos()&&getLightBluePos()!=0)
        {
            setLightBlue();
            setLightBluePos();
        }
        else if(getYellow()>0&&getBluePos()==getYellowPos()&&getYellowPos()!=0)
        {
            setYellow();
            setYellowPos();
        }
        
    }
    }      
    public boolean isShowing(){
        return (getBlue()!=1);
    }
}
