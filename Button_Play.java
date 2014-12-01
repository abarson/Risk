import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Play extends Actor
{
    /**
     * Act - do whatever the Button_Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound backgroundMusic;
    public Button_Play(GreenfootSound sound)
    {
        backgroundMusic = sound;
        GreenfootImage image = getImage();  
        image.scale(image.getWidth() - 200, image.getHeight() - 200);  
        setImage(image);  
    }
    public void act() 
    {
       if (!(backgroundMusic.isPlaying()))
       {
       backgroundMusic.playLoop();
       }
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this) && clicked==1)
        {
            //Greenfoot.delay(100);  
            //backgroundMusic.playLoop();
            getWorld().addObject(new Fader(backgroundMusic), getWorld().getWidth() / 2, getWorld().getHeight() / 2);  
            //Greenfoot.setWorld(new Player_Selection(backgroundMusic));
        }
        }
    }   
    
    
}
