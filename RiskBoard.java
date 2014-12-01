import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RiskBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RiskBoard extends World
{

    /**
     * Constructor for objects of class RiskBoard.
     * 
     */
    public RiskBoard(int numPlayers, String p1color, String p2color, String p3color, String p4color, String p5color, String p6color)
    {    
        super(1240, 630, 1); 
        Territories Alaska = new Alaska();
        Territories NorthWestTerritory = new NorthWestTerritory();
        Territories Greenland = new Greenland();
        Territories WesternUnitedStates = new WesternUnitedStates();
        Territories Alberta = new Alberta();
        Territories Quebec = new Quebec();
        Territories Mexico = new Mexico();
        Territories EasternUnitedStates = new EasternUnitedStates();
        Territories Ontario = new Ontario();
        
        Territories Venezuela = new Venezuela();
        Territories Peru = new Peru();
        Territories Brazil = new Brazil();
        Territories Argentina = new Argentina();
        
        Territories NorthAfrica = new NorthAfrica();
        Territories SouthAfrica = new SouthAfrica(); 
        Territories EastAfrica = new EastAfrica();
        Territories Egypt = new Egypt();
        Territories Madagascar = new Madagascar();
        Territories Congo = new Congo();
        
        Territories NorthernEurope = new NorthernEurope();
        Territories SouthernEurope = new SouthernEurope();
        Territories WesternEurope = new WesternEurope();
        Territories Scandinavia = new Scandinavia();
        Territories Ukraine = new Ukraine();
        Territories GreatBritain = new GreatBritain();
        Territories Iceland = new Iceland();
        
        Territories Afghanistan = new Afghanistan();
        Territories China = new China();
        Territories India = new India();
        Territories Irkutsk = new Irkutsk();
        Territories Japan = new Japan();
        Territories Kamchatka = new Kamchatka();
        Territories MiddleEast = new MiddleEast();
        Territories Mongolia = new Mongolia();
        Territories Siam = new Siam();
        Territories Siberia = new Siberia();
        Territories Ural = new Ural();
        Territories Yakutsk = new Yakutsk();
        
        Territories EasternAustralia = new EasternAustralia();
        Territories Indonesia = new Indonesia();
        Territories NewGuinea = new NewGuinea();
        Territories WesternAustralia = new WesternAustralia();
        
        RiskGame game = new RiskGame(numPlayers, p1color, p2color, p3color, p4color, p5color, p6color);
        game.dispenseAvailableTerritories(game.getAvailableTerritories(Alaska, Alberta, Greenland, NorthWestTerritory, WesternUnitedStates, Quebec, Mexico, EasternUnitedStates, Ontario, Venezuela, Peru, Brazil, Argentina, NorthAfrica, SouthAfrica, EastAfrica, Egypt, Madagascar, Congo, NorthernEurope, SouthernEurope, WesternEurope, Scandinavia, Ukraine, GreatBritain, Iceland, Afghanistan, China, India, Irkutsk, Japan, Kamchatka, MiddleEast, Mongolia, Siam, Siberia, Ural, Yakutsk, EasternAustralia, Indonesia, NewGuinea, WesternAustralia));
        game.changeTerritoryColor();
        game.setOccupyingPlayer();
        
        addObject(NewGuinea, 680, 306);
       
        addObject(EasternUnitedStates, 415, 244);
        addObject(NorthWestTerritory, 383, 79);
        addObject(Alaska, 235, 124);
        addObject(Greenland, 559, 93);
        addObject(WesternUnitedStates, 336, 226);
        addObject(Alberta, 330, 166);
        addObject(Quebec, 488, 175);
        addObject(Mexico, 355, 290);
        addObject(Ontario, 414, 179);
            
        addObject(Argentina, 437, 505);
        addObject(Venezuela, 413, 356);
        addObject(Brazil, 457, 425);
        addObject(Peru, 401, 416);
            
        addObject(MiddleEast, 767, 318);
            
        addObject(NorthAfrica, 621, 360);
        addObject(SouthAfrica, 682, 524);
        addObject(EastAfrica, 741, 424);
        addObject(Egypt, 688, 330);
        addObject(Madagascar, 759, 519);
        addObject(Congo, 675, 445);
            
        addObject(Ukraine, 756, 176);
        addObject(NorthernEurope, 666, 206);
        addObject(SouthernEurope, 670, 251);
        addObject(Scandinavia, 670, 127);
        addObject(WesternEurope, 601, 246);
        addObject(GreatBritain, 601, 186);
        addObject(Iceland, 600, 136);
            
        addObject(China, 939, 269);
        addObject(India, 878, 344);
        addObject(Japan, 1070, 248);
        addObject(Kamchatka, 1109, 150);
        addObject(Mongolia, 1005, 222);
        addObject(Siam, 957, 345);
        addObject(Siberia, 921, 140);
        addObject(Ural, 870, 160);
        addObject(Yakutsk, 1023, 110);
        addObject(Afghanistan, 826, 232);
        addObject(Irkutsk, 988, 171);
            
        addObject(EasternAustralia, 1080, 513);
        addObject(Indonesia, 981, 406);
        addObject(WesternAustralia, 986, 509);
            
        
            
        ArrayList<Player>turnOrder = game.getTurnOrder();
        ReinforcementDisplay display = new ReinforcementDisplay(turnOrder);
        addObject(display, 60, 344);
        addObject(new PlayerTurn(), 60, 345);
        addObject(new ReinforcementBox(), 60, 178);
        addObject(new ContinentalBonuses(), 245, 450);
        addObject(new FortifyButton(), 60, 301);
        addObject(new EndTurnButton(), 60, 432);
        addObject(new ExtraUnitsDisplay(), 57, 193);
        
        addObject(new EasternUnitedStatesUnitDisplay(), 415, 244);
        addObject(new NorthWestTerritoryUnitDisplay(), 383, 79);
        addObject(new AlaskaUnitDisplay(), 235, 124);
        addObject(new GreenlandUnitDisplay(), 559, 93);
        addObject(new WesternUnitedStatesUnitDisplay(), 336, 226);
        addObject(new AlbertaUnitDisplay(), 330, 166);
        addObject(new QuebecUnitDisplay(), 488, 175);
        addObject(new MexicoUnitDisplay(), 354, 284);
        addObject(new OntarioUnitDisplay(), 414, 176);
        
        addObject(new ArgentinaUnitDisplay(), 419, 485);
        addObject(new VenezuelaUnitDisplay(), 396, 356);
        addObject(new BrazilUnitDisplay(), 480, 422);
        addObject(new PeruUnitDisplay(), 389, 425);
        
        addObject(new NorthAfricaUnitDisplay(), 621, 360);
        addObject(new SouthAfricaUnitDisplay(), 682, 521);
        addObject(new EastAfricaUnitDisplay(), 741, 424);
        addObject(new EgyptUnitDisplay(), 688, 330);
        addObject(new MadagascarUnitDisplay(), 759, 519);
        addObject(new CongoUnitDisplay(), 675, 445);
        
        addObject(new UkraineUnitDisplay(), 756, 176);
        addObject(new NorthernEuropeUnitDisplay(), 666, 206);
        addObject(new SouthernEuropeUnitDisplay(), 670, 251);
        addObject(new ScandinaviaUnitDisplay(), 670, 127);
        addObject(new WesternEuropeUnitDisplay(), 601, 246);
        addObject(new GreatBritainUnitDisplay(), 601, 186);
        addObject(new IcelandUnitDisplay(), 600, 136);
        
        addObject(new ChinaUnitDisplay(), 939, 269);
        addObject(new IndiaUnitDisplay(), 878, 344);
        addObject(new JapanUnitDisplay(), 1070, 248);
        addObject(new KamchatkaUnitDisplay(), 1109, 150);
        addObject(new MongoliaUnitDisplay(), 1005, 222);
        addObject(new SiamUnitDisplay(), 957, 345);
        addObject(new SiberiaUnitDisplay(), 922, 138);
        addObject(new UralUnitDisplay(), 870, 160);
        addObject(new YakutskUnitDisplay(), 1023, 110);
        addObject(new AfghanistanUnitDisplay(), 826, 232);
        addObject(new IrkutskUnitDisplay(), 988, 171);
        addObject(new MiddleEastUnitDisplay(), 767, 318);
        
        addObject(new EasternAustraliaUnitDisplay(), 1080, 513);
        addObject(new NewGuineaUnitDisplay(), 1088, 427);
        addObject(new WesternAustraliaUnitDisplay(), 986, 509);
        addObject(new IndonesiaUnitDisplay(), 981, 406);
        
        addObject(new InitialDeploymentScreen(), 450, 212);
        
    }
}
