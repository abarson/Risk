import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Color here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Color extends World
{

    /**
     * Constructor for objects of class Player_Color.
     * 
     */
    private int numberOfPlayers;
    private static int BLACK;
    private static int BLUE;
    private static int YELLOW;
    private static int GREEN;
    private static int LIGHTBLUE;
    private static int RED;
    public static GreenfootSound backgroundMusic;
    public Player_Color(int players, GreenfootSound sound)
    {    
        
        super(600, 400, 1); 
        addObject(new spinningGlobeSmall("RotatingEarthSmall.gif"),500,110);
        addObject(new riskpic(1), 500, 160);
        backgroundMusic = sound;
        numberOfPlayers = players;
        Player_Color_Buttons x = new Player_Color_Buttons(numberOfPlayers);
        addObject(new Player_1(), 100, 40);
            addObject(new Black(), 200, 40);
            addObject(new Red(), 229, 40);
            addObject(new Blue(), 258, 40);
            addObject(new Green(), 287, 40);
            addObject(new Yellow(), 316, 40);
            addObject(new Light_Blue(), 345, 40);
        addObject(new Player_2(), 100, 105);
            addObject(new Black(), 200, 105);
            addObject(new Red(), 229, 105);
            addObject(new Blue(), 258, 105);
            addObject(new Green(), 287, 105);
            addObject(new Yellow(), 316, 105);
            addObject(new Light_Blue(), 345, 105);
        if (numberOfPlayers>2)
        {
        addObject(new Player_3(), 100, 170);
            addObject(new Black(), 200, 170);
            addObject(new Red(), 229, 170);
            addObject(new Blue(), 258, 170);
            addObject(new Green(), 287, 170);
            addObject(new Yellow(), 316, 170);
            addObject(new Light_Blue(), 345, 170);
        }
        if (numberOfPlayers>3)
        {
        addObject(new Player_4(), 100, 235);
            addObject(new Black(), 200, 235);
            addObject(new Red(), 229, 235);
            addObject(new Blue(), 258, 235);
            addObject(new Green(), 287, 235);
            addObject(new Yellow(), 316, 235);
            addObject(new Light_Blue(), 345, 235);
        }
        if (numberOfPlayers>4)  
        {
        addObject(new Player_5(), 100, 300);
            addObject(new Black(), 200, 300);
            addObject(new Red(), 229, 300);
            addObject(new Blue(), 258, 300);
            addObject(new Green(), 287, 300);
            addObject(new Yellow(), 316, 300);
            addObject(new Light_Blue(), 345, 300);
        }
        if (numberOfPlayers>5)
        {
        addObject(new Player_6(), 100, 365);
            addObject(new Black(), 200, 365);
            addObject(new Red(), 229, 365);
            addObject(new Blue(), 258, 365);
            addObject(new Green(), 287, 365);
            addObject(new Yellow(), 316, 365);
            addObject(new Light_Blue(), 345, 365);
        }
        addObject(new backbutton(backgroundMusic), 500, 275);
        addObject(new Begin(backgroundMusic), 500, 350);
        
    }
    public int getNumPlayers(){
        return numberOfPlayers;
    }
   
    
}
