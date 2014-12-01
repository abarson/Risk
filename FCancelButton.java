import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FCancelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FCancelButton extends FortifyingScreenTemplate
{
    /**
     * Act - do whatever the FCancelButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        transparency();
        closeScreen();
    }    
    public void transparency(){
        if(getMandatoryMoveUnits()>0)
            getImage().setTransparency(150);
        else
            getImage().setTransparency(255);
    }
    public void closeScreen(){
        if(getImage().getTransparency()==255)
        {
            //setFortifying();
            MouseInfo info = Greenfoot.getMouseInfo();
            if(info!=null)
            {
            if (Greenfoot.mouseClicked(this)){
            setFortifyUnits(0);    
            setFortifyInProgress(false);
            setDefendingTerritory(null);
            setCurrentlyClickedTerritory(null);
            getWorld().removeObjects(getWorld().getObjects(FortifyingScreen.class));
            getWorld().removeObjects(getWorld().getObjects(FortifyingUnitsBox.class));
            getWorld().removeObjects(getWorld().getObjects(FPlus.class));
            getWorld().removeObjects(getWorld().getObjects(AllButton.class));
            getWorld().removeObjects(getWorld().getObjects(FMinus.class));
            getWorld().removeObjects(getWorld().getObjects(FortifyingButton.class));
            getWorld().removeObjects(getWorld().getObjects(FCancelButton.class));
        }
    }
}
}
}
