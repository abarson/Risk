import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yakutsk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yakutsk extends Territories
{
    /**
     * Act - do whatever the Mexico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String currentColor;
    private static int occupiedUnits;
    private static Player occupyingPlayer;
    private static String name;
    public Yakutsk(){
        occupiedUnits = 1;
        name = "Yakutsk";
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
            setImage("YakutskRed.png");
        else if(currentColor.equals("black"))
            setImage("YakutskBlack.png");
        else if(currentColor.equals("blue"))
            setImage("YakutskBlue.png");
        else if(currentColor.equals("green"))
            setImage("YakutskGreen.png");
        else if(currentColor.equals("light_blue"))
            setImage("YakutskLightBlue.png");
        else if(currentColor.equals("yellow"))
            setImage("YakutskYellow.png");
    }
    //-----------------------------------------------------------------------------//
    //Will check if the territory is being attacked. Will add a screen for unit use.
    public void defend(){
        if (beingAttacked()&&!isAttacking()&&!getFortifying()){
            setDefendingTerritory(this);
            setAttacking(true);
            getWorld().addObject(new FortifyingScreen(), 1131, 388);
            getWorld().addObject(new FortifyingUnitsBox(), 1131, 398);
            getWorld().addObject(new FPlus(), 1163, 398);
            getWorld().addObject(new AllButton(), 1195, 408);
            getWorld().addObject(new FMinus(), 1163, 420);
            getWorld().addObject(new FortifyingButton(), 1086, 460);
            getWorld().addObject(new FCancelButton(), 1175, 460);
            
            getWorld().addObject(new AttackScreen(), 1131, 388);
            getWorld().addObject(new AttackUnitsBox(), 1131, 398);
            getWorld().addObject(new Plus(), 1163, 398);
            getWorld().addObject(new Minus(), 1163, 420);
            getWorld().addObject(new AttackButton(), 1086, 460);
            
            getWorld().addObject(new aroll1(), 1066, 388);
            getWorld().addObject(new aroll2(), 1081, 388);
            getWorld().addObject(new aroll3(), 1096, 388);
            getWorld().addObject(new droll1(), 1066, 418);
            getWorld().addObject(new droll2(), 1081, 418);
            
            getWorld().addObject(new CancelButton(), 1175, 460);
        }
    }
    //Will check if the name of the attack territory is adjacent. Use this method in beingAttacked.
    public boolean isAdjacent()
    {
        String tempName = getCurrentlyClickedTerritory().getName();
        if (tempName.equals("Kamchatka"))
            return true;
        else if(tempName.equals("Siberia"))
            return true;
        else if(tempName.equals("Irkutsk"))
            return true;
        return false;
    }
    public void fortify(){
        if (fortifying()&&getFortifying()&&!getFortifyInProgress()&&!getHasFortified())
        {
        setDefendingTerritory(this);
        setFortifyInProgress(true);
            getWorld().addObject(new FortifyingScreen(), 1131, 388);
            getWorld().addObject(new FortifyingUnitsBox(), 1131, 398);
            getWorld().addObject(new FPlus(), 1163, 398);
            getWorld().addObject(new AllButton(), 1195, 408);
            getWorld().addObject(new FMinus(), 1163, 420);
            getWorld().addObject(new FortifyingButton(), 1086, 460);
            getWorld().addObject(new FCancelButton(), 1175, 460);
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
