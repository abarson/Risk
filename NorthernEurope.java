import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NorthernEurope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NorthernEurope extends Territories
{
    /**
     * Act - do whatever the Mexico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String currentColor;
    private static int occupiedUnits;
    private static Player occupyingPlayer;
    private static String name;
    public NorthernEurope(){
        occupiedUnits = 1;
        name = "NorthernEurope";
    }
    public String getName(){
        return name;
    }
    public void setOccupyingPlayer(Player player){
        occupyingPlayer = player;
    }
    public Player getOccupyingPlayer(){
        return occupyingPlayer;
    }
    public void act() 
    {
        imageSelect();
        fortify();
        updateClickedTerritory();
        placeReinforcement();
        defend();
    }    
    public void placeReinforcement(){
        MouseInfo press = Greenfoot.getMouseInfo();
            if (press!=null)
            if(Greenfoot.mouseClicked(this)&&getOccupyingPlayer()==getPlayerOrder().get(getPlayerTurn()))
            {
            if(getOccupyingPlayer().getNumUnits()>0)
            {
                setOccupiedUnits(1);
                getOccupyingPlayer().setNumUnits(getOccupyingPlayer().getNumUnits()-1);
            }
                if(!getGameStart())
                    setPlayerTurn();
            }
    }
    public void updateClickedTerritory(){
        MouseInfo press = Greenfoot.getMouseInfo();
        if (!isAttacking()&&press!=null)
            if(!getFortifyInProgress()&&Greenfoot.mouseClicked(this)&&getOccupyingPlayer()==getPlayerOrder().get(getPlayerTurn())&&getOccupyingPlayer().getNumUnits()==0)
            {
                setCurrentlyClickedTerritory(this);
            }
    }
    public boolean beingAttacked(){
        {
        MouseInfo press = Greenfoot.getMouseInfo();
        if (getCurrentlyClickedTerritory()==null)
            return false;
        if (press!=null)
            if(Greenfoot.mouseClicked(this)&&isAdjacent()&&getOccupyingPlayer()!=getPlayerOrder().get(getPlayerTurn())&&getPlayerOrder().get(getPlayerTurn()).getNumUnits()==0)
            {
                if (getCurrentlyClickedTerritory().getOccupiedUnits()<2)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }
    public int getOccupiedUnits(){
        return occupiedUnits;
    }
    public void setOccupiedUnits(int num)
    {
        occupiedUnits+=num;
    }
    public void setCurrentColor(String theColor){
        currentColor = theColor;
    }
    public void imageSelect(){
        if (currentColor.equals("red"))
            setImage("NorthernEuropeRed.png");
        else if(currentColor.equals("black"))
            setImage("NorthernEuropeBlack.png");
        else if(currentColor.equals("blue"))
            setImage("NorthernEuropeBlue.png");
        else if(currentColor.equals("green"))
            setImage("NorthernEuropeGreen.png");
        else if(currentColor.equals("light_blue"))
            setImage("NorthernEuropeLightBlue.png");
        else if(currentColor.equals("yellow"))
            setImage("NorthernEuropeYellow.png");
    }
    //-----------------------------------------------------------------------------//
    //Will check if the territory is being attacked. Will add a screen for unit use.
    public void defend(){
        if (beingAttacked()&&!isAttacking()&&!getFortifying()){
            setDefendingTerritory(this);
            setAttacking(true);
            getWorld().addObject(new FortifyingScreen(), 484, 253);
            getWorld().addObject(new FortifyingUnitsBox(), 484, 263);
            getWorld().addObject(new FPlus(), 516, 264);
            getWorld().addObject(new AllButton(), 548, 274);
            getWorld().addObject(new FMinus(), 516, 286);
            getWorld().addObject(new FortifyingButton(), 438, 326);
            getWorld().addObject(new FCancelButton(), 529, 326);
            
            getWorld().addObject(new AttackScreen(), 484, 253);
            getWorld().addObject(new AttackUnitsBox(), 484, 263);
            getWorld().addObject(new Plus(), 516, 264);
            getWorld().addObject(new Minus(), 516, 286);
            getWorld().addObject(new AttackButton(), 438, 326);
            
            getWorld().addObject(new aroll1(), 419, 253);
            getWorld().addObject(new aroll2(), 434, 253);
            getWorld().addObject(new aroll3(), 449, 253);
            getWorld().addObject(new droll1(), 419, 283);
            getWorld().addObject(new droll2(), 434, 283);
            
            getWorld().addObject(new CancelButton(), 529, 326);
        }
    }
    //Will check if the name of the attack territory is adjacent. Use this method in beingAttacked.
    public boolean isAdjacent()
    {
        String tempName = getCurrentlyClickedTerritory().getName();
        if (tempName.equals("Scandinavia"))
            return true;
        else if(tempName.equals("GreatBritain"))
            return true;
        else if(tempName.equals("WesternEurope"))
            return true;
        else if(tempName.equals("SouthernEurope"))
            return true;
        else if(tempName.equals("Ukraine"))
            return true;
        return false;
    }
    public void fortify(){
        if (fortifying()&&getFortifying()&&!getFortifyInProgress()&&!getHasFortified())
        {
        setDefendingTerritory(this);
        setFortifyInProgress(true);
            getWorld().addObject(new FortifyingScreen(), 484, 253);
            getWorld().addObject(new FortifyingUnitsBox(), 484, 263);
            getWorld().addObject(new FPlus(), 516, 264);
            getWorld().addObject(new AllButton(), 548, 274);
            getWorld().addObject(new FMinus(), 516, 286);
            getWorld().addObject(new FortifyingButton(), 438, 326);
            getWorld().addObject(new FCancelButton(), 529, 326);
    }
    }
    public boolean fortifying(){
        {
        MouseInfo press = Greenfoot.getMouseInfo();
        if (getCurrentlyClickedTerritory()==null)
            return false;
        if (press!=null)
            if(Greenfoot.mouseClicked(this)&&isAdjacent()&&getOccupyingPlayer()==getPlayerOrder().get(getPlayerTurn())&&getPlayerOrder().get(getPlayerTurn()).getNumUnits()==0)
            {
                if (getCurrentlyClickedTerritory().getOccupiedUnits()<2)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }
    //--------------------------------------------------------------------------------//
    
    
}
