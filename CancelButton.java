import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CancelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CancelButton extends AttackScreenTemplate
{
    /**
     * Act - do whatever the CancelButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       MouseInfo info = Greenfoot.getMouseInfo();  
        if(info!=null) 
        {  
        int clicked = info.getButton();  
        if(Greenfoot.mouseClicked(this)){
            setAttacking(false);
            setAttackingUnits(1);
            setDefendingTerritory(null);
            
            getWorld().removeObjects(getWorld().getObjects(FortifyingScreen.class));
            getWorld().removeObjects(getWorld().getObjects(FortifyingUnitsBox.class));
            getWorld().removeObjects(getWorld().getObjects(FPlus.class));
            getWorld().removeObjects(getWorld().getObjects(AllButton.class));
            getWorld().removeObjects(getWorld().getObjects(FMinus.class));
            getWorld().removeObjects(getWorld().getObjects(FortifyingButton.class));
            getWorld().removeObjects(getWorld().getObjects(FCancelButton.class));
            
            getWorld().removeObjects(getWorld().getObjects(AttackScreen.class));
            getWorld().removeObjects(getWorld().getObjects(AttackUnitsBox.class));
            getWorld().removeObjects(getWorld().getObjects(Plus.class));
            getWorld().removeObjects(getWorld().getObjects(Minus.class));
            getWorld().removeObjects(getWorld().getObjects(AttackButton.class));
            
            getWorld().removeObjects(getWorld().getObjects(droll2.class));
            getWorld().removeObjects(getWorld().getObjects(droll1.class));
            getWorld().removeObjects(getWorld().getObjects(aroll3.class));
            getWorld().removeObjects(getWorld().getObjects(aroll2.class));
            getWorld().removeObjects(getWorld().getObjects(aroll1.class));
            
            getWorld().removeObjects(getWorld().getObjects(CancelButton.class));
            
        }
    }
}
}
