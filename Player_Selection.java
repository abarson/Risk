import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Selection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Selection extends World
{

    /**
     * Constructor for objects of class Player_Selection.
     * 
     */
    private Tank tank2;
    private Tank tank3;
    private Tank tank4;
    private Tank tank5;
    private Tank tank6;
    public Player_Selection(GreenfootSound sound)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        tank2 = new Tank("TankSmall.gif");
        tank3 = new Tank("TankSmall.gif");
        tank4 = new Tank("TankSmall.gif");
        tank5 = new Tank("TankSmall.gif");
        tank6 = new Tank("TankSmall.gif");
        
        addObject(new Player_Selection_2(tank2), 300, 50);
        addObject(new Player_Selection_3(tank3), 300, 125);
        addObject(new Player_Selection_4(tank4), 300, 200);
        addObject(new Player_Selection_5(tank5), 300, 275);
        addObject(new Player_Selection_6(tank6), 300, 350);
        
        addObject(new spinningGlobeSmall("RotatingEarthSmall.gif"),500,110);
        addObject(new riskpic(1), 500, 160);
        
        addObject(new Ready(sound), 500, 350);
        
        addObject(new Back(sound), 500, 275);
        
    }
    public void act()
    {
        addTanks();
    }
    public void addTanks()
    {
        if (tank2.isVisible())
        {
            addObject(tank2, 150, 40);
        }
        else
        {
            removeObject(tank2);
        }
        
        if (tank3.isVisible())
        {
            addObject(tank3, 150, 115);
        }
        else
        {
            removeObject(tank3);
        }
        
        if (tank4.isVisible())
        {
            addObject(tank4, 150, 190);
        }
        else
        {
            removeObject(tank4);
        }
        
        if (tank5.isVisible())
        {
            addObject(tank5, 150, 265);
        }
        else
        {
            removeObject(tank5);
        }
        
        if (tank6.isVisible())
        {
            addObject(tank6, 150, 340);
        }
        else
        {
            removeObject(tank6);
        }
    }
}
