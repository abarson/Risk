import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alberta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alberta extends Territories
{
    /**
     * Act - do whatever the Alberta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String currentColor;
    private static int occupiedUnits;
    private static Player occupyingPlayer;
    private static String name;
    public Alberta(){
        occupiedUnits = 1;
        name = "Alberta";
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
    
    public int getOccupiedUnits(){
        return occupiedUnits;
    }
    public void setOccupiedUnits(int num)
    {
        occupiedUnits+=num;
    }
    public void act(){
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
    public void imageSelect(){
        if (currentColor.equals("red"))
            setImage("AlbertaRed.png");
        else if(currentColor.equals("black"))
            setImage("AlbertaBlack.png");
        else if(currentColor.equals("blue"))
            setImage("AlbertaBlue.png");
        else if(currentColor.equals("green"))
            setImage("AlbertaGreen.png");
        else if(currentColor.equals("light_blue"))
            setImage("AlbertaLightBlue.png");
        else if(currentColor.equals("yellow"))
            setImage("AlbertaYellow.png");
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
    public void defend(){
        if (beingAttacked()&&!isAttacking()&&!getFortifying()){
            setDefendingTerritory(this);
            setAttacking(true);
            getWorld().addObject(new FortifyingScreen(), 235, 370);
            getWorld().addObject(new FortifyingUnitsBox(), 235, 380);
            getWorld().addObject(new FPlus(), 268, 383);
            getWorld().addObject(new AllButton(), 300, 393);
            getWorld().addObject(new FMinus(), 268, 406);
            getWorld().addObject(new FortifyingButton(), 188, 443);
            getWorld().addObject(new FCancelButton(), 281, 443);
            
            getWorld().addObject(new AttackScreen(), 235, 370);
            getWorld().addObject(new AttackUnitsBox(), 235, 380);
            getWorld().addObject(new Plus(), 268, 383);
            getWorld().addObject(new Minus(), 268, 406);
            getWorld().addObject(new AttackButton(), 188, 443);
            
            getWorld().addObject(new aroll1(), 170, 370);
            getWorld().addObject(new aroll2(), 185, 370);
            getWorld().addObject(new aroll3(), 200, 370);
            getWorld().addObject(new droll1(), 170, 400);
            getWorld().addObject(new droll2(), 185, 400);
            
            getWorld().addObject(new CancelButton(), 281, 443);
        }
    }
    //Will check if the name of the attack territory is adjacent. Use this method in beingAttacked.
    public boolean isAdjacent()
    {
        String tempName = getCurrentlyClickedTerritory().getName();
        if (tempName.equals("Alaska"))
            return true;
        else if(tempName.equals("NorthWestTerritory"))
            return true;
        else if(tempName.equals("Ontario"))
            return true;
        else if(tempName.equals("WesternUnitedStates"))
            return true;
        return false;
    }
    public void setCurrentColor(String theColor){
        currentColor = theColor;
    }
    public String getColor(){
        return color;
    }
    public void fortify(){
        if (fortifying()&&getFortifying()&&!getFortifyInProgress()&&!getHasFortified())
        {
        setDefendingTerritory(this);
        setFortifyInProgress(true);
            getWorld().addObject(new FortifyingScreen(), 235, 370);
            getWorld().addObject(new FortifyingUnitsBox(), 235, 380);
            getWorld().addObject(new FPlus(), 268, 383);
            getWorld().addObject(new AllButton(), 300, 393);
            getWorld().addObject(new FMinus(), 268, 406);
            getWorld().addObject(new FortifyingButton(), 188, 443);
            getWorld().addObject(new FCancelButton(), 281, 443);
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
}
