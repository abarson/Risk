import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Fader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fader2 extends Actor  
{  
    public int fadeLevel = 0; 
    public int volume = 80;
    /** 
     * Act - do whatever the Fader wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */  
    private GreenfootSound backgroundMusic;
    private int numPlayer;
    private String color1;
    private String color2;
    private String color3;
    private String color4;
    private String color5;
    private String color6;
    public void act()   
    {  
        fade(fadeLevel++);  
        if (fadeLevel % 3 == 0)
            reduceVolume(volume--);  
        if (fadeLevel > 255)  
        {  
            Greenfoot.setWorld(new RiskBoard(numPlayer, color1, color2, color3, color4, color5, color6));  
        }  
    }      
      
    public Fader2(GreenfootSound sound)  
    {  
        backgroundMusic = sound;
        fade(0);  
    }  
    public Fader2(int num, String col1, String col2, String col3, String col4, String col5, String col6, GreenfootSound sound)
    {
        numPlayer = num;
        color1 = col1;
        color2 = col2;
        color3 = col3;
        color4 = col4;
        color5 = col5;
        color6 = col6;
        backgroundMusic = sound;
       
    }
    public Fader2()  
    {  
        fade(0);  
    }  
    public void reduceVolume(int v)
    {
        if (v > 100)
        {
            v = 100;
        }
        else if (v < 5)
        {
            v = 0;
            backgroundMusic.stop();
        }
        backgroundMusic.setVolume(v);
        
    }
    public void fade(int f)  
    {  
        if (f > 255)  
        {  
            f = 255;  
        }  
        else if (f < 0)  
        {  
            f = 0;  
        }  
          
        GreenfootImage fade = new GreenfootImage(600, 400);  
        Color fadeColor;  
        fadeColor = new Color(0, 0, 0, f);  
        fade.clear();  
        fade.setColor(fadeColor);  
        fade.fillRect(0, 0, 600, 400);  
        setImage(fade); 
        
    }  
}  
