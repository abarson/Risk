import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WesternAustralia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WesternAustralia extends Territories
{
    /**
     * Act - do whatever the Mexico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String currentColor;
    private static int occupiedUnits;
    private static Player occupyingPlayer;
    private static String name;
    public WesternAustralia(){
        occupiedUnits = 1;
        name = "WesternAustralia";
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
        if (press!=null)
            if(!getFortifyInProgress()&&!isAttacking()&&Greenfoot.mouseClicked(this)&&getOccupyingPlayer()==getPlayerOrder().get(getPlayerTurn())&&getOccupyingPlayer().getNumUnits()==0)
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
            setImage("WesternAustraliaRed.png");
        else if(currentColor.equals("black"))
            setImage("WesternAustraliaBlack.png");
        else if(currentColor.equals("blue"))
            setImage("WesternAustraliaBlue.png");
        else if(currentColor.equals("green"))
            setImage("WesternAustraliaGreen.png");
        else if(currentColor.equals("light_blue"))
            setImage("WesternAustraliaLightBlue.png");
        else if(currentColor.equals("yellow"))
            setImage("WesternAustraliaYellow.png");
    }
    //-----------------------------------------------------------------------------//
    //Will check if the territory is being attacked. Will add a screen for unit use.
    public void defend(){
        if (beingAttacked()&&!isAttacking()&&!getFortifying()){
            setDefendingTerritory(this);
            setAttacking(true);
            getWorld().addObject(new FortifyingScreen(), 840, 527);
            getWorld().addObject(new FortifyingUnitsBox(), 840, 537);
            getWorld().addObject(new FPlus(), 872, 536);
            getWorld().addObject(new AllButton(), 905, 546);
            getWorld().addObject(new FMinus(), 872, 558);
            getWorld().addObject(new FortifyingButton(), 793, 600);
            getWorld().addObject(new FCancelButton(), 885, 600);
            
            getWorld().addObject(new AttackScreen(), 840, 527);
            getWorld().addObject(new AttackUnitsBox(), 840, 537);
            getWorld().addObject(new Plus(), 872, 536);
            getWorld().addObject(new Minus(), 872, 558);
            getWorld().addObject(new AttackButton(), 793, 600);
            
            getWorld().addObject(new aroll1(), 775, 527);
            getWorld().addObject(new aroll2(), 790, 527);
            getWorld().addObject(new aroll3(), 805, 527);
            getWorld().addObject(new droll1(), 775, 557);
            getWorld().addObject(new droll2(), 790, 557);
            
            getWorld().addObject(new CancelButton(), 885, 600);
        }
    }
    //Will check if the name of the attack territory is adjacent. Use this method in beingAttacked.
    public boolean isAdjacent()
    {
        String tempName = getCurrentlyClickedTerritory().getName();
        if (tempName.equals("NewGuinea"))
            return true;
        else if(tempName.equals("EasternAustralia"))
            return true;
        else if(tempName.equals("Indonesia"))
            return true;
        return false;
    }
    public void fortify(){
        if (fortifying()&&getFortifying()&&!getFortifyInProgress()&&!getHasFortified())
        {
        setDefendingTerritory(this);
        setFortifyInProgress(true);
            getWorld().addObject(new FortifyingScreen(), 840, 527);
            getWorld().addObject(new FortifyingUnitsBox(), 840, 537);
            getWorld().addObject(new FPlus(), 872, 536);
            getWorld().addObject(new AllButton(), 905, 546);
            getWorld().addObject(new FMinus(), 872, 558);
            getWorld().addObject(new FortifyingButton(), 793, 600);
            getWorld().addObject(new FCancelButton(), 885, 600);
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
