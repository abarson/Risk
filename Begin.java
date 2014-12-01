import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Begin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Begin extends Player_Color_Buttons
{
    /**
     * Act - do whatever the Begin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound backgroundMusic;
    public Begin(GreenfootSound sound){
        getImage().setTransparency(150);
        backgroundMusic = sound;
    }
    public void act() 
    {
        if (check())
            getImage().setTransparency(255);
        startgame();
    }    
    public boolean check()
    {
        if (getNumPlayers()==2)
        {
            return (getFirstRowColor()!=null && getSecondRowColor()!=null);      
        }
        else if (getNumPlayers()==3)
        {
            return (getFirstRowColor()!=null&& getSecondRowColor()!=null&& getThirdRowColor()!=null);
        }
        else if (getNumPlayers()==4)
        {
            return (getFirstRowColor()!=null&& getSecondRowColor()!=null&& getThirdRowColor()!=null
            &&getFourthRowColor()!=null);
        }
        else if (getNumPlayers()==5)
        {
            return (getFirstRowColor()!=null&& getSecondRowColor()!=null&& getThirdRowColor()!=null
            &&getFourthRowColor()!=null && getFifthRowColor()!=null);
        }
        else if (getNumPlayers()==6)
        {
            return (getFirstRowColor()!=null&& getSecondRowColor()!=null&& getThirdRowColor()!=null
            &&getFourthRowColor()!=null && getFifthRowColor()!=null&&getSixthRowColor()!=null);
        }
        return false;
}
    public void startgame(){
        MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this) && getImage().getTransparency()==255)
        {
            
            getWorld().addObject(new Fader2(getNumPlayers(),getFirstRowColor(), getSecondRowColor(), getThirdRowColor(), getFourthRowColor(), getFifthRowColor(), getSixthRowColor(),backgroundMusic), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            //Greenfoot.setWorld(new RiskBoard(getNumPlayers(), getFirstRowColor(), getSecondRowColor(), getThirdRowColor(), getFourthRowColor(), getFifthRowColor(), getSixthRowColor()));
        }
    }
    }
}