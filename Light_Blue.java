import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Light_Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Light_Blue extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Light_Blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String lightblue;
    
    public Light_Blue(){
        lightblue = "light_blue";
    }
    public void act() 
    {
        canChangeColor(lightblue);
        if (getLightBlue()==0);
            show();
        if(getLightBlue()>0)
        {
        hide();
        if(getRed()>0&&getLightBluePos()==getRedPos())
        {
            setRed();
            setRedPos();
        }
        else if(getBlue()>0&&getLightBluePos()==getBluePos())
        {
            setBlue();
            setBluePos();
        }
        else if(getGreen()>0&&getLightBluePos()==getGreenPos())
        {
            setGreen();
            setGreenPos();
        }
        else if(getBlack()>0&&getLightBluePos()==getBlackPos())
        {
            setBlack();
            setBlackPos();
        }
        else if(getYellow()>0&&getLightBluePos()==getYellowPos())
        {
            setYellow();
            setYellowPos();
        }
        
    }
    }   
    public boolean isShowing(){
        return (getLightBlue()!=1);
    }
    }    

