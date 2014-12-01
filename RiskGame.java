import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RiskGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RiskGame 
{
    private static boolean gameStart;
    private static int numPlayers;
    private static int startingUnits;
    private static ArrayList<Player>Players;
    private static int playerTurn;
    private static String player1color;
    private static String player2color;
    private static String player3color;
    private static String player4color;
    private static String player5color;
    private static String player6color;
    private static ArrayList<Territories>player1List;
    private static ArrayList<Territories>player2List;
    private static ArrayList<Territories>player3List;
    private static ArrayList<Territories>player4List;
    private static ArrayList<Territories>player5List;
    private static ArrayList<Territories>player6List;
    private static ArrayList<Territories>list;
    public RiskGame(int players, String color1, String color2, String color3, String color4, String color5, String color6)
    {    
        gameStart = false;
        numPlayers=players;
        Players = new ArrayList<Player>();
        ArrayList<Territories>tempList= new ArrayList<Territories>();
        player1List = new ArrayList<Territories>();
        player2List = new ArrayList<Territories>();
        player3List = new ArrayList<Territories>();
        player4List = new ArrayList<Territories>();
        player5List = new ArrayList<Territories>();
        player6List = new ArrayList<Territories>();
        String tempColor;
        if(numPlayers==2){
            startingUnits = 40;
            player1color=color1;
            player2color=color2;
            for (int i = 1; i<=numPlayers; i++)
            {
            tempColor = null;
            if (i==1)
            {
                tempColor = player1color;
                tempList = player1List;
            }
            else if(i==2)
            {
                tempColor = player2color;
                tempList = player2List;
            }
            Player tempPlayer = new Player(i, startingUnits, tempColor, tempList);
            Players.add(tempPlayer);
            }
        }
        else if(numPlayers==3)
        {
            startingUnits = 35;
            player1color=color1;
            player2color=color2;
            player3color=color3;
            for (int i = 1; i<=numPlayers; i++)
            {
            tempColor = null;
            if (i==1)
            {
                tempColor = player1color;
                tempList = player1List;
            }
            else if(i==2)
            {
                tempColor = player2color;
                tempList = player2List;
            }
            else if(i==3)
            {
                tempColor = player3color;
                tempList = player3List;
            }
            Player tempPlayer = new Player(i, startingUnits, tempColor, tempList);
            Players.add(tempPlayer);
            }
        }
        else if(numPlayers==4)
        {
            startingUnits = 30;
            player1color=color1;
            player2color=color2;
            player3color=color3;
            player4color=color4;
            for (int i = 1; i<=numPlayers; i++)
            {
            tempColor = null;
            if (i==1)
            {
                tempColor = player1color;
                tempList = player1List;
            }
            else if(i==2)
            {
                tempColor = player2color;
                tempList = player2List;
            }
            else if(i==3)
            {
                tempColor = player3color;
                tempList = player3List;
            }
            else if(i==4)
            {
                tempColor = player4color;
                tempList = player4List;
            }
            Player tempPlayer = new Player(i, startingUnits, tempColor, tempList);
            Players.add(tempPlayer);
            }
        }
        else if(numPlayers==5)
           {
            startingUnits = 25;
            player1color=color1;
            player2color=color2;
            player3color=color3;
            player4color=color4;
            player5color=color5;
            for (int i = 1; i<=numPlayers; i++)
            {
            tempColor = null;
            if (i==1)
            {
                tempColor = player1color;
                tempList = player1List;
            }
            else if(i==2)
            {
                tempColor = player2color;
                tempList = player2List;
            }
            else if(i==3)
            {
                tempColor = player3color;
                tempList = player3List;
            }
            else if(i==4)
            {
                tempColor = player4color;
                tempList = player4List;
            }
            else if(i==5)
            {
                tempColor = player5color;
                tempList = player5List;
            }
            Player tempPlayer = new Player(i, startingUnits, tempColor, tempList);
            Players.add(tempPlayer);
            }
            }
        else
            {
            startingUnits = 20;
            player1color=color1;
            player2color=color2;
            player3color=color3;
            player4color=color4;
            player5color=color5;
            player6color=color6;
            for (int i = 1; i<=numPlayers; i++)
            {
            tempColor = null;
            if (i==1)
            {
                tempColor = player1color;
                tempList = player1List;
            }
            else if(i==2)
            {
                tempColor = player2color;
                tempList = player2List;
            }
            else if(i==3)
            {
                tempColor = player3color;
                tempList = player3List;
            }
            else if(i==4)
            {
                tempColor = player4color;
                tempList = player4List;
            }
            else if(i==5)
            {
                tempColor = player5color;
                tempList = player5List;
            }
            else if(i==6)
            {
                tempColor = player6color;
                tempList = player6List;
            }
            Player tempPlayer = new Player(i, startingUnits, tempColor, tempList);
            Players.add(tempPlayer);
            }   
            }
        
    } 
    public ArrayList<Territories> getAvailableTerritories(Territories Alaska, Territories Alberta, Territories Greenland, Territories NorthWestTerritory, Territories WesternUnitedStates, Territories Quebec, Territories Mexico, Territories EasternUnitedStates, Territories Ontario, Territories Venezuela, Territories Peru, Territories Brazil, Territories Argentina, Territories NorthAfrica, Territories SouthAfrica, Territories EastAfrica, Territories Egypt, Territories Madagascar, Territories Congo, Territories NorthernEurope, Territories SouthernEurope, Territories WesternEurope, Territories Scandinavia, Territories Ukraine, Territories GreatBritain, Territories Iceland, Territories Afghanistan, Territories China, Territories India, Territories Irkutsk, Territories Japan, Territories Kamchatka, Territories MiddleEast, Territories Mongolia, Territories Siam, Territories Siberia, Territories Ural, Territories Yakutsk, Territories EasternAustralia, Territories Indonesia, Territories NewGuinea, Territories WesternAustralia)
    {
        list = new ArrayList<Territories>();
        list.add(Alaska); list.add(Alberta); list.add(Greenland); list.add(NorthWestTerritory); list.add(WesternUnitedStates); list.add(Quebec); list.add(Mexico); list.add(EasternUnitedStates); list.add(Ontario); list.add(Venezuela); list.add(Peru); list.add(Brazil); list.add(Argentina); list.add(NorthAfrica); list.add(SouthAfrica); list.add(EastAfrica); list.add(Egypt); list.add(Madagascar); list.add(Congo); list.add(NorthernEurope); list.add(SouthernEurope); list.add(WesternEurope); list.add(Scandinavia); list.add(Ukraine); list.add(GreatBritain); list.add(Iceland); list.add(Afghanistan); list.add(China); list.add(India); list.add(Irkutsk); list.add(Japan); list.add(Kamchatka); list.add(MiddleEast); list.add(Mongolia); list.add(Siam); list.add(Siberia); list.add(Ural); list.add(Yakutsk); list.add(EasternAustralia); list.add(Indonesia); list.add(NewGuinea); list.add(WesternAustralia);
        return list;
    }
    public void dispenseAvailableTerritories(ArrayList<Territories>list){
        ArrayList<Territories> availableTerritories = list;
        int z = 0;
        for (int i = availableTerritories.size()-1; i>=0; i--)
        {
            int q = (int)(Math.random()*i);
            Players.get(z).getTerritories().add(availableTerritories.get(q));
            availableTerritories.remove(q);
            z++;
            if (z==Players.size())
                z = 0;
            }
        for (int i = 0; i <Players.size(); i++)
        {
            Players.get(i).setNumUnits(Players.get(i).getNumUnits()-Players.get(i).getTerritories().size());
        }
    }
    public void setOccupyingPlayer(){
        for (int i = 0; i < Players.size(); i++)
            for (int j = 0; j < Players.get(i).getTerritories().size();j++)
                Players.get(i).getTerritories().get(j).setOccupyingPlayer(Players.get(i));
    }
    public void changeTerritoryColor(){
        for (int i = 0; i < Players.size(); i++)
        {
            for (int j = 0; j < Players.get(i).getTerritories().size(); j++)
            {
            Players.get(i).getTerritories().get(j).setCurrentColor(Players.get(i).getColor());
            }
        }
    }
    //Random turn order. Need to make it fixed to check bug
    /*public ArrayList<Player> getTurnOrder(){
        ArrayList<Player>turnOrder = new ArrayList<Player>();
        ArrayList<Player>tempList = Players;
        int z = tempList.size();
        for (int i = 0; i < z; i++)
        {
            int q = (int)(Math.random()*tempList.size());
            turnOrder.add(tempList.get(q));
            tempList.remove(q);
        }
        return turnOrder;
    }*/
    public ArrayList<Player> getTurnOrder(){
        ArrayList<Player>turnOrder = new ArrayList<Player>();
        ArrayList<Player>tempList = Players;
        int z = tempList.size();
        for (int i = 0; i < z; i++)
        {
            turnOrder.add(tempList.get(i));
        }
        return turnOrder;
    }
    
    public ArrayList<Player> getPlayers(){
        return Players;
    }
    public void setGameStart(){
        gameStart=true;
    }
    public boolean getGameStart(){
        return gameStart;
    }
}
