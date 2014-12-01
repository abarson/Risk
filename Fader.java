import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Fader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fader extends Actor  
{  
    public int fadeLevel = 0;  
    /** 
     * Act - do whatever the Fader wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */  
    private GreenfootSound backgroundMusic;
    public void act()   
    {  
        fade(fadeLevel++);  
          
        if (fadeLevel > 255)  
        {  
            Greenfoot.setWorld(new Player_Selection(backgroundMusic));  
        }  
    }      
      
    public Fader(GreenfootSound sound)  
    {  
        backgroundMusic = sound;
        fade(0);  
    }  
    public Fader()  
    {  
        fade(0);  
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
          
        GreenfootImage fade = new GreenfootImage(800, 650);  
        Color fadeColor;  
        fadeColor = new Color(0, 0, 0, f);  
        fade.clear();  
        fade.setColor(fadeColor);  
        fade.fillRect(0, 0, 800, 650);  
        setImage(fade);  
    }  
}  
