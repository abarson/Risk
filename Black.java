import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class Black extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Black wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int count;
    private String black;
    public Black()
    {
        black = "black";
        getImage().drawRect(getBlackPos(), getRedPos(), 5, 6);
    }
    public void act() 
    {
        if (getBlack()==0);
            show();
        canChangeColor(black);
        
        if(getBlack()>0)
        {
        hide();
            if(getRed()>0&&getBlackPos()==getRedPos())
            {
            setRed();
            setRedPos();
            }
            else if(getBlue()>0&&getBlackPos()==getBluePos())
            {
            setBlue();
            setBluePos();
            }
            else if(getGreen()>0&&getBlackPos()==getGreenPos())
            {
            setGreen();
            setGreenPos();
            }
            else if(getLightBlue()>0&&getBlackPos()==getLightBluePos())
            {
            setLightBlue();
            setLightBluePos();
            }
            else if(getYellow()>0&&getBlackPos()==getYellowPos())
            {
            setYellow();
            setYellowPos();
            }
        }  
    }    
    public boolean isShowing(){
        return (getBlack()!=1);
    }
    public int getCount(){
        return count;
    }
    public void setCount(){
        count=0;
    }
    public void add()
    {
        count++;
    }
}   

