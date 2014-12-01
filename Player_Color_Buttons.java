import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Color_Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
    
public class Player_Color_Buttons extends Actor
{
    /**
     * Act - do whatever the Player_Color_Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int Players;
    private static String color;
    private static int yLoc;
    private static int BLACK;
    private static int BLUE;
    private static int YELLOW;
    private static int GREEN;
    private static int LIGHTBLUE;
    private static int RED;
    private static String firstrow;
    private static String secondrow;
    private static String thirdrow;
    private static String fourthrow;
    private static String fifthrow;
    private static String sixthrow;
    private static int BlackPos;
    private static int BluePos;
    private static int YellowPos;
    private static int GreenPos;
    private static int LightBluePos;
    private static int RedPos;
    
    public Player_Color_Buttons(){
    }
    public Player_Color_Buttons(int players){
        Players = players;
    }
    public int getNumPlayers(){
        return Players;
    }
    public void setNumPlayers(){
        Players = 0;
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public int getBlackPos(){
        return BlackPos;
    }
    public int getBluePos(){
        return BluePos;
    }
    public int getYellowPos(){
        return YellowPos;
    }
    public int getGreenPos(){
        return GreenPos;
    }
    public int getLightBluePos(){
        return LightBluePos;
    }
    public int getRedPos(){
        return RedPos;
    }
    public void setBlackPos(){
        BlackPos = 0;
    }
    public void setBluePos(){
        BluePos = 0;
    }
    public void setYellowPos(){
        YellowPos = 0;
    }
    public void setGreenPos(){
        GreenPos = 0;
    }
    public void setLightBluePos(){
        LightBluePos = 0;
    }
    public void setRedPos(){
        RedPos = 0;
    }
    
    public String getFirstRowColor(){
        return firstrow;
    }
    public String getSecondRowColor(){
        return secondrow;
    }
    public String getThirdRowColor(){
        return thirdrow;
    }
    public String getFourthRowColor(){
        return fourthrow;
    }
    public String getFifthRowColor(){
        return fifthrow;
    }
    public String getSixthRowColor(){
        return sixthrow;
    }
    public void setFirstRow(){
        firstrow = null;
    }
    public void setSecondRow(){
        secondrow = null;
    }
    public void setThirdRow(){
        thirdrow = null;
    }
    public void setFourthRow(){
        fourthrow = null;
    }
    public void setFifthRow(){
        fifthrow = null;
    }
    public void setSixthRow(){
        sixthrow = null;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String theColor){
        color = theColor;
    }
    public void setY(int theY){
        yLoc = theY;
    }
    public int getTheY(){
        return yLoc;
    }
    
    public int getBlack(){
        return BLACK;
    }
    public int getBlue(){
        return BLUE;
    }
    public int getYellow(){
        return YELLOW;
    }
    public int getGreen(){
        return GREEN;
    }
    public int getLightBlue(){
        return LIGHTBLUE;
    }
    public int getRed(){
        return RED;
    }
    public void setBlack(){
        BLACK = 0;
    }
    public void setBlue(){
        BLUE = 0;
    }
    public void setGreen(){
        GREEN = 0;
    }
    public void setYellow(){
        YELLOW = 0;
    }
    public void setLightBlue(){
        LIGHTBLUE = 0;
    }
    public void setRed(){
        RED = 0;
    }
    
    
    public void changeColor(){
    {
        
        if (getY()==getTheY())
        {
            if (getColor().equals("black"))
                {
                    getImage().setColor(Color.black);
                    getImage().fill();
                }
            else if (getColor().equals("red"))
                {
                    getImage().setColor(Color.red);
                    getImage().fill();
                }
            else if (getColor().equals("blue"))
                {
                    getImage().setColor(Color.blue);
                    getImage().fill();
                }
            else if (getColor().equals("yellow"))
                {
                    getImage().setColor(Color.yellow);
                    getImage().fill();
                }
            else if (getColor().equals("light_blue"))
                {
                    getImage().setColor(Color.cyan);
                    getImage().fill();
                }
            else if (getColor().equals("green"))
                {
                    getImage().setColor(Color.green);
                    getImage().fill();
                }
        
    }
        
    }
}
public void canChangeColor(String color){
        MouseInfo a = Greenfoot.getMouseInfo();
        if (a!=null)
        {
            if(isShowing())
            {
            if(Greenfoot.mouseClicked(this)&&getY()==40)
            {
                set(color);
                setColor(color);
                setY(40);
                setPosition(color);
                firstrow = color;
            }
            else if(Greenfoot.mouseClicked(this)&&getY()==105&&getImage().getTransparency()==255)
            {
                set(color);
                setColor(color);
                setY(105);
                setPosition(color);
                secondrow = color;
            }
            else if(Greenfoot.mouseClicked(this)&&getY()==170&&getImage().getTransparency()==255)
            {
                set(color);
                setColor(color);
                setY(170);
                setPosition(color);
                thirdrow = color;
            }
            else if(Greenfoot.mouseClicked(this)&&getY()==235&&getImage().getTransparency()==255)
            {
                set(color);
                setColor(color);
                setY(235);
                setPosition(color);
                fourthrow = color;
            }
            else if(Greenfoot.mouseClicked(this)&&getY()==300&&getImage().getTransparency()==255)
            {
                set(color);
                setColor(color);
                setY(300);
                setPosition(color);
                fifthrow = color;
            }
            else if(Greenfoot.mouseClicked(this)&&getY()==365&&getImage().getTransparency()==255)
            {
                set(color);
                setColor(color);
                setY(365);
                setPosition(color);
                sixthrow = color;
            }
        }
}
}
public boolean isShowing(){
    return (getImage().getTransparency()==255);
}
public void hide(){
    getImage().setTransparency(0);
}
public void show(){
    getImage().setTransparency(255);
}
public void set(String color){
    if(color.equals("black"))
        BLACK++;
    else if(color.equals("red"))
        RED++;
    else if(color.equals("blue"))
        BLUE++;
    else if(color.equals("green"))
        GREEN++;
    else if(color.equals("light_blue"))
        LIGHTBLUE++;
    else if(color.equals("yellow"))
        YELLOW++;
}
public void setPosition(String color){
    if(color.equals("black"))
        BlackPos=getY();
    else if(color.equals("blue"))
        BluePos=getY();
    else if(color.equals("yellow"))
        YellowPos=getY();
    else if(color.equals("green"))
        GreenPos=getY();
    else if(color.equals("light_blue"))
        LightBluePos=getY();
    else if(color.equals("red"))
        RedPos=getY();
}
public boolean finished(){
    return false;
}
}
