import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    
    private GreenfootSound backgroundMusic;
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1); 
        backgroundMusic = new GreenfootSound("/Users/adambarson/Desktop/Risk/MainTheme.mp3");
        addObject(new Button_Play(backgroundMusic),92, 550);
        addObject(new spinningGlobe("RotatingEarth.gif"),400,325);
        addObject(new riskpic(), 400, 90);
        
    }
    public Menu(GreenfootSound sound)
    {
        super(800, 650, 1); 
        addObject(new Button_Play(sound),92, 550);
        addObject(new spinningGlobe("RotatingEarth.gif"),400,325);
        addObject(new riskpic(), 400, 90);
    }
    }

