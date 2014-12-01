import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReinforcementDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ReinforcementDisplay extends Actor
{
    /**
     * Act - do whatever the ReinforcementDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static ArrayList<Player>orderList;
    private static int playerTurn;
    private static boolean gameStart;
    private static int turnNumber;
    private static int individualTurnNumber;
    private static boolean fortifying;
    private static Territories currentlyClickedTerritory;
    private static Territories defendingTerritory;
    private static boolean attacking;
    private static int attackingUnits;
    private static int mandatoryMoveUnits;
    private static int fortifyUnits;
    private static boolean hasFortified;
    private static boolean fortifyInProgress;
    private static int namericacheck;
    private static int samericacheck;
    private static int europecheck;
    private static int asiacheck;
    private static int australiacheck;
    private static int africacheck;
    private static boolean knockedOut;
    private boolean player1Defeated;
    private boolean player2Defeated;
    private boolean player3Defeated;
    private boolean player4Defeated;
    private boolean player5Defeated;
    private boolean player6Defeated;
    public ReinforcementDisplay(ArrayList<Player>list)
    {
        orderList = list;
        playerTurn = 0;
        gameStart = false;
        turnNumber = 0;
        individualTurnNumber = 0;
        fortifying = false;
        attacking = false;
        attackingUnits = 1;
        mandatoryMoveUnits = 0;
        hasFortified=false;
        fortifyInProgress = false;
        namericacheck = 0;
        samericacheck = 0;
        europecheck = 0;
        asiacheck = 0;
        australiacheck = 0;
        africacheck = 0;
        knockedOut = false;
        player1Defeated = false;
        player2Defeated = false;
        player3Defeated = false;
        player4Defeated = false;
        player5Defeated = false;
        player6Defeated = false;
    }
    public void playerDefeated()
    {
       if (getGameStart())
       {
       for (int i = 0; i < getPlayerOrder().size(); i++)
       {
           if (getPlayerOrder().get(i).getTerritories().size()==0)
           {
               if (i==0 && !player1Defeated)
                    {
                        player1Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
               else if (i==1 && !player2Defeated)
                    {
                        player2Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
               else if (i==2 && !player3Defeated)
                    {
                        player3Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
               else if (i==3 && !player4Defeated)
                    {
                        player4Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
               else if (i==4 && !player5Defeated)
                    {
                        player5Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
               else if (i==5 && !player6Defeated)
                    {
                        player6Defeated = true;
                        getWorld().addObject(new PlayerVanquished(getPlayerOrder().get(i).getColor()), 500, 300);
                    }
            }
       }
    }
    }
    public boolean getFortifyInProgress(){
        return fortifyInProgress;
    }
    public void setFortifyInProgress(boolean foo){
        fortifyInProgress = foo;
    }
    public boolean getHasFortified(){
        return hasFortified;
    }
    public void setHasFortified(boolean foo){
        hasFortified = foo;
    }
    public int getMandatoryMoveUnits(){
        return mandatoryMoveUnits;
    }
    public void setMandatoryMoveUnits(int num){
        mandatoryMoveUnits = num;
    }
    public boolean getFortifying(){
        return fortifying;
    }
    public void setFortifying(boolean foo){
        fortifying = foo;
    }
    public int getAttackingUnits(){
        return attackingUnits;
    }
    public void setAttackingUnits(int num){
        attackingUnits = num;
    }
    public void incrementAttackingUnits(){
        attackingUnits++;
    }
    public void decrementAttackingUnits(){
        attackingUnits--;
    }
    public boolean isAttacking(){
        return attacking;
    }
    public void setAttacking(boolean foo){
        attacking = foo;
    }
    public Territories getDefendingTerritory(){
        return defendingTerritory;
    }
    public void setDefendingTerritory(Territories territory){
        defendingTerritory = territory;
    }
    public void setCurrentlyClickedTerritory(Territories territory){
        currentlyClickedTerritory = territory;
    }
    public Territories getCurrentlyClickedTerritory(){
        return currentlyClickedTerritory;
    }
    public void setIndividualTurnNumber(){
        individualTurnNumber++;
        if(individualTurnNumber==getPlayerOrder().size())
            individualTurnNumber = 0;
    }
    public void changeIndividualTurnNumber(int i){
        individualTurnNumber = i;
    }
    public void changeTurnNumber(int i){
        turnNumber = i;
    }
    public void setTurnNumber(){
        turnNumber++;
    }
    public void detractIndividualTurnNumber(){
        individualTurnNumber--;
        if(getIndividualTurnNumber()==-1)
        {
            individualTurnNumber = getPlayerOrder().size()-1;
        }
    }
    public void detractTurnNumber(){
        turnNumber--;
        if(getTurnNumber()==-1)
        {
            turnNumber = getPlayerOrder().size()-1;
        }
    }
    public int getIndividualTurnNumber(){
        return individualTurnNumber;
    }
    public int getTurnNumber(){
        return turnNumber;
    }
    
    public ReinforcementDisplay(){
    }
    public boolean getGameStart(){
        return gameStart;
    }
    public void setGameStart(){
        gameStart = true;
    }
    public int getPlayerTurn(){
        return playerTurn;
    }
    public Player getCurrentPlayer(){
        return getPlayerOrder().get(getPlayerTurn());
    }
    public void setPlayerTurn(){
        if (getCurrentPlayer().getTerritories().size()==0&&getGameStart())
        {
            getCurrentPlayer().setNumUnits(0);
        }
        playerTurn++;
        if(getPlayerTurn()==orderList.size())
            playerTurn = 0;
        if(getGameStart()&&getPlayerTurn()==0)
            setTurnNumber();
        setCurrentlyClickedTerritory(null);
        setDefendingTerritory(null);
        if(getFortifying()){
            setFortifying(false);
            setFortifyInProgress(false);
            setHasFortified(false);
        }
        knockedOut = false;
    }
    
    public ArrayList<Player> getPlayerOrder(){
        return orderList;
    }
    public boolean reinforcementsGone(){
        for (int i = 0; i < getPlayerOrder().size(); i++)
        {
             if (getPlayerOrder().get(i).getNumUnits()>0)
                return false;
        }
        return true;
    }
    public boolean hasNorthAmerica(){
        namericacheck = 0;
        String Ala = "Alaska";
        String Alb = "Alberta";
        String Mex = "Mexico";
        String Eas = "EasternUnitedStates";
        String Gre = "Greenland";
        String Nor = "NorthWestTerritory";
        String Ont = "Ontario";
        String Que = "Quebec";
        String Wes = "WesternUnitedStates";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas)||getCurrentPlayer().getTerritories().get(i).getName().equals(Gre)||getCurrentPlayer().getTerritories().get(i).getName().equals(Nor)||getCurrentPlayer().getTerritories().get(i).getName().equals(Ont)||getCurrentPlayer().getTerritories().get(i).getName().equals(Que)||getCurrentPlayer().getTerritories().get(i).getName().equals(Wes))
        namericacheck++;
        }
        if (namericacheck==9){
        return true;
        }
        return false;
    }
    public boolean hasEurope(){
        europecheck = 0;
        String Ala = "Scandinavia";
        String Alb = "SouthernEurope";
        String Mex = "NorthernEurope";
        String Eas = "WesternEurope";
        String Gre = "Ukraine";
        String Nor = "GreatBritain";
        String Ont = "Iceland";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas)||getCurrentPlayer().getTerritories().get(i).getName().equals(Gre)||getCurrentPlayer().getTerritories().get(i).getName().equals(Nor)||getCurrentPlayer().getTerritories().get(i).getName().equals(Ont))
        europecheck++;
        }
        if (europecheck==7){
        return true;
        }
        return false;
    }
    public boolean hasSouthAmerica(){
        samericacheck = 0;
        String Ala = "Peru";
        String Alb = "Brazil";
        String Mex = "Venezuela";
        String Eas = "Argentina";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas))
        samericacheck++;
        }
        if (samericacheck==4){
        return true;
        }
        return false;
    }
    public boolean hasAfrica(){
        africacheck = 0;
        String Ala = "Congo";
        String Alb = "SouthAfrica";
        String Mex = "NorthAfrica";
        String Eas = "EastAfrica";
        String Gre = "Egypt";
        String Nor = "Madagascar";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas)||getCurrentPlayer().getTerritories().get(i).getName().equals(Gre)||getCurrentPlayer().getTerritories().get(i).getName().equals(Nor))
        africacheck++;
        }
        if (africacheck==6){
        return true;
        }
        return false;
    }
    public boolean hasAsia(){
        asiacheck = 0;
        String Ala = "Afghanistan";
        String Alb = "China";
        String Mex = "India";
        String Eas = "Irkutsk";
        String Gre = "Japan";
        String Nor = "Kamchatka";
        String Ont = "MiddleEast";
        String Que = "Mongolia";
        String Wes = "Siam";
        String Ala1 = "Siberia";
        String Alb1 = "Ural";
        String Mex1 = "Yakutsk";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas)||getCurrentPlayer().getTerritories().get(i).getName().equals(Gre)||getCurrentPlayer().getTerritories().get(i).getName().equals(Nor)||getCurrentPlayer().getTerritories().get(i).getName().equals(Ont)||getCurrentPlayer().getTerritories().get(i).getName().equals(Que)||getCurrentPlayer().getTerritories().get(i).getName().equals(Wes)||getCurrentPlayer().getTerritories().get(i).getName().equals(Ala1)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb1)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex1))
        asiacheck++;
        }
        if (asiacheck==12){
        return true;
        }
        return false;
    }
    public boolean hasAustralia(){
        australiacheck = 0;
        String Ala = "NewGuinea";
        String Alb = "EasternAustralia";
        String Mex = "WesternAustralia";
        String Eas = "Indonesia";
        for (int i = 0; i<getCurrentPlayer().getTerritories().size(); i++)
        {
        if(getCurrentPlayer().getTerritories().get(i).getName().equals(Ala)||getCurrentPlayer().getTerritories().get(i).getName().equals(Alb)||getCurrentPlayer().getTerritories().get(i).getName().equals(Mex)||getCurrentPlayer().getTerritories().get(i).getName().equals(Eas))
        australiacheck++;
        }
        if (australiacheck==4){
        return true;
        }
        return false;
    }
    public void act() 
    {
    playerDefeated();
    if (getGameStart() && getCurrentPlayer().getTerritories().size()==0)
    {
        setPlayerTurn();
        setIndividualTurnNumber();
    }
    else{
        if (!knockedOut && orderList.get(playerTurn).getNumUnits()==0&&!getGameStart())
            setPlayerTurn();
        if (reinforcementsGone()&&!getGameStart()&&!knockedOut)
        {
            setGameStart();
            playerTurn = 0;
            getWorld().addObject(new GameStartScreen(), 450, 212);
        }
        else if (getGameStart()&&getTurnNumber()>0&&getIndividualTurnNumber()==getPlayerTurn()&&!knockedOut)
        {
            int i = getCurrentPlayer().getTerritories().size();
            int z = i/3;
            int bonus = 0;
            if (z<3)
                z=3;
            if (hasNorthAmerica())
            {
                bonus+=5;
            }
            if (hasEurope())
            {
                bonus+=5;
            }
            if (hasSouthAmerica())
            {
                bonus+=2;
            }
            if (hasAfrica())
            {
                bonus+=3;
            }
            if (hasAsia())
            {
                bonus+=7;
            }
            if (hasAustralia())
            {
                bonus+=2;
            }
            z+=bonus;
            getCurrentPlayer().setNumUnits(z);
            setIndividualTurnNumber();
        }
        if (isAttacking())
        updateAttackUnits();
        //changeOwner();
    }
    }    
    public void changeOwner(){
        if (getDefendingTerritory()!=null&&getDefendingTerritory().getOccupiedUnits()<1)
        {
            setMandatoryMoveUnits(attackingUnits);
            updateFortifyUnits();
            getCurrentPlayer().getTerritories().add(getDefendingTerritory());
            getDefendingTerritory().getOccupyingPlayer().removeTerritory(getDefendingTerritory().getName());
            getDefendingTerritory().setCurrentColor(getCurrentPlayer().getColor());
            Player player = getDefendingTerritory().getOccupyingPlayer();
            getDefendingTerritory().setOccupyingPlayer(getCurrentPlayer());
            //knockOut(player);
        }
    }
    public void removeTerritory(){
        
    }
    /*public void knockOut(Player player){
        
        if(player.getTerritories().size()==0)
            {
                for (int i = 0; i<getPlayerOrder().size(); i++){
                    if (getPlayerOrder().get(i).getPlayerNumber()==player.getPlayerNumber()){
                        int z = player.getPlayerNumber()-1;
                        knockedOut = true;
                        if (getPlayerTurn()>player.getPlayerNumber()-1)
                        {
                            for (int j = player.getPlayerNumber()-1;j<orderList.size()-1;j++)
                            {
                                orderList.get(j+1).setPlayerNumber(orderList.get(j).getPlayerNumber());
                                //orderList.remove(player.getPlayerNumber()-1);
                            }
                            orderList.remove(z);
                        }
                        else
                        {
                            orderList.remove(i);
                        }
                        //if (i<getTurnNumber())
                        //{
                        //    getPlayerOrder().remove(i);
                         //   if (getIndividualTurnNumber()==0){
                         //       changeIndividualTurnNumber(getPlayerOrder().size());
                         //       changeTurnNumber(getPlayerOrder().size());
                         //   }
                        //    else
                         //   {
                         //   detractIndividualTurnNumber();
                         //   detractTurnNumber();
                       // }
                        //}
                        //else
                       // {
                       // }
                        
                    }
            }
            }
    }*/
    public void updateFortifyUnits(){
        fortifyUnits = mandatoryMoveUnits;
    }
    public int getFortifyUnits(){
        return fortifyUnits;
    }
    public void setFortifyUnits(int num){
        fortifyUnits = num;
    }
    public void incrementFortifyUnits(){
        fortifyUnits++;
    }
    public void decrementFortifyUnits(){
        fortifyUnits--;
    }
    public void updateAttackUnits(){
        if(getCurrentlyClickedTerritory().getOccupiedUnits()<=getAttackingUnits())
        {
            if (getAttackingUnits()==1&&getCurrentlyClickedTerritory().getOccupiedUnits()==1)
            setAttackingUnits(0);
            else if(getAttackingUnits()==2&&getCurrentlyClickedTerritory().getOccupiedUnits()==2)
            setAttackingUnits(1);
            else if(getAttackingUnits()==3&&getCurrentlyClickedTerritory().getOccupiedUnits()==3)
            setAttackingUnits(2);
            else if(getAttackingUnits()==3&&getCurrentlyClickedTerritory().getOccupiedUnits()==2)
            setAttackingUnits(1);
        }
    }
}
