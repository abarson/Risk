import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Congo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congo extends Territories
{
    /**
     * Act - do whatever the Mexico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String currentColor;
    private static int occupiedUnits;
    private static Player occupyingPlayer;
    private static String name;
    public Congo(){
        occupiedUnits = 1;
        name = "Congo";
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
            setImage("CongoRed.png");
        else if(currentColor.equals("black"))
            setImage("CongoBlack.png");
        else if(currentColor.equals("blue"))
            setImage("CongoBlue.png");
        else if(currentColor.equals("green"))
            setImage("CongoGreen.png");
        else if(currentColor.equals("light_blue"))
            setImage("CongoLightblue.png");
        else if(currentColor.equals("yellow"))
            setImage("CongoYellow.png");
    }
    //-----------------------------------------------------------------------------//
    //Will check if the territory is being attacked. Will add a screen for unit use.
    public void defend(){
        if (beingAttacked()&&!isAttacking()&&!getFortifying()){
            setDefendingTerritory(this);
            setAttacking(true);
            getWorld().addObject(new FortifyingScreen(), 873, 540);
            getWorld().addObject(new FortifyingUnitsBox(), 873, 550);
            getWorld().addObject(new FPlus(), 904, 550);
            getWorld().addObject(new AllButton(), 936, 560);
            getWorld().addObject(new FMinus(), 904, 573);
            getWorld().addObject(new FortifyingButton(), 826, 612);
            getWorld().addObject(new FCancelButton(), 918, 612);
            
            getWorld().addObject(new AttackScreen(), 873, 540);
            getWorld().addObject(new AttackUnitsBox(), 873, 550);
            getWorld().addObject(new Plus(), 904, 550);
            getWorld().addObject(new Minus(), 904, 573);
            getWorld().addObject(new AttackButton(), 826, 612);
            
            getWorld().addObject(new aroll1(), 808, 540);
            getWorld().addObject(new aroll2(), 823, 540);
            getWorld().addObject(new aroll3(), 838, 540);
            getWorld().addObject(new droll1(), 808, 570);
            getWorld().addObject(new droll2(), 823, 570);
            
            getWorld().addObject(new CancelButton(), 918, 612);
        }
    }
    //Will check if the name of the attack territory is adjacent. Use this method in beingAttacked.
    public boolean isAdjacent()
    {
        String tempName = getCurrentlyClickedTerritory().getName();
        if (tempName.equals("NorthAfrica"))
            return true;
        else if(tempName.equals("EastAfrica"))
            return true;
        else if(tempName.equals("SouthAfrica"))
            return true;
        return false;
    }
    public void fortify(){
        if (fortifying()&&getFortifying()&&!getFortifyInProgress()&&!getHasFortified())
        {
        setDefendingTerritory(this);
        setFortifyInProgress(true);
            getWorld().addObject(new FortifyingScreen(), 873, 540);
            getWorld().addObject(new FortifyingUnitsBox(), 873, 550);
            getWorld().addObject(new FPlus(), 904, 550);
            getWorld().addObject(new AllButton(), 936, 560);
            getWorld().addObject(new FMinus(), 904, 573);
            getWorld().addObject(new FortifyingButton(), 826, 612);
            getWorld().addObject(new FCancelButton(), 918, 612);
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
