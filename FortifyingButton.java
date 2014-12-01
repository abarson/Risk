import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FortifyingButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FortifyingButton extends FortifyingScreenTemplate
{
    /**
     * Act - do whatever the FortifyingButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }    
    public void clicked()
    {
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        if(Greenfoot.mouseClicked(this))
        {
                getCurrentlyClickedTerritory().setOccupiedUnits(-getFortifyUnits());
                getDefendingTerritory().setOccupiedUnits(getFortifyUnits());
                setFortifyUnits(0);
                setMandatoryMoveUnits(0);
                setAttacking(false);
                setCurrentlyClickedTerritory(getDefendingTerritory());
                setDefendingTerritory(null);
                setAttackingUnits(1);
                if(getFortifying()){
                setHasFortified(true);
                setFortifyInProgress(false);
            }
            getWorld().removeObjects(getWorld().getObjects(FortifyingScreen.class));
            getWorld().removeObjects(getWorld().getObjects(FortifyingUnitsBox.class));
            getWorld().removeObjects(getWorld().getObjects(FPlus.class));
            getWorld().removeObjects(getWorld().getObjects(AllButton.class));
            getWorld().removeObjects(getWorld().getObjects(FMinus.class));
            getWorld().removeObjects(getWorld().getObjects(FCancelButton.class));
            
            getWorld().removeObjects(getWorld().getObjects(droll2.class));
            getWorld().removeObjects(getWorld().getObjects(droll1.class));
            getWorld().removeObjects(getWorld().getObjects(aroll3.class));
            getWorld().removeObjects(getWorld().getObjects(aroll2.class));
            getWorld().removeObjects(getWorld().getObjects(aroll1.class));
            
            getWorld().removeObjects(getWorld().getObjects(FortifyingButton.class));
        }
        }
    }
}
