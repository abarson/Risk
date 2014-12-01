import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String red;
    
    public Red()
    {
        red = "red";
    }
    public void act() 
    {
        if (getRed()==0);
            show();
        canChangeColor(red);
        
        if(getRed()>0)
        {
        hide();
        if(getBlack()>0&&getRedPos()==getBlackPos()&&getBlackPos()!=0)
        {
            setBlack();
            setBlackPos();
        }
        else if(getBlue()>0&&getRedPos()==getBluePos()&&getBluePos()!=0)
        {
            setBlue();
            setBluePos();
        }
        else if(getGreen()>0&&getRedPos()==getGreenPos()&&getGreenPos()!=0)
        {
            setGreen();
            setGreenPos();
        }
        else if(getLightBlue()>0&&getRedPos()==getLightBluePos()&&getLightBluePos()!=0)
        {
            setLightBlue();
            setLightBluePos();
        }
        else if(getYellow()>0&&getRedPos()==getYellowPos()&&getYellowPos()!=0)
        {
            setYellow();
            setYellowPos();
        }
        }   
        
    }    
    public boolean isShowing(){
        return (getRed()!=1);
    }
    
    
    
    
}

