import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AttackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AttackButton extends AttackScreenTemplate
{
    /**
     * Act - do whatever the AttackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int [] attack;
    private static int [] defend;
    private static int defenseWins;
    private static int attackWins;
    private static int attackRoll1;
    private static int attackRoll2;
    private static int attackRoll3;
    private static int defenseRoll1;
    private static int defenseRoll2;
    public void act() 
    {
        transparent();
        Attack();
    }    
    public AttackButton(){
        setAttack();
        setDefend();
        setAttackWins();
        setDefenseWins();
        setRolls();
    }
    public void setAttack(){
        attack = null;
    }
    public void setDefend(){
        defend = null;
    }
    public void setAttackWins(){
        attackWins = 0;
    }
    public void setDefenseWins(){
        defenseWins = 0;
    }
    public int getAttackRoll1(){
        return attackRoll1;
    }
    public int getAttackRoll2(){
        return attackRoll2;
    }
    public int getAttackRoll3(){
        return attackRoll3;
    }
    public int getDefenseRoll1(){
        return defenseRoll1;
    }
    public int getDefenseRoll2(){
        return defenseRoll2;
    }
    public void setRolls(){
        attackRoll1 = 0;
        attackRoll2 = 0;
        attackRoll3 = 0;
        defenseRoll1 = 0;
        defenseRoll2 = 0;
    }
    public void Attack(){
       MouseInfo info = Greenfoot.getMouseInfo();  
       if(info!=null) 
       {   
       if(Greenfoot.mouseClicked(this)&&getImage().getTransparency()==255)
       {
            defenseWins = 0;
            attackWins = 0;
            attack = null;
            defend = null;
            setRolls();
            attack = attackRollSort(getAttackRolls(numAttackers()));
            defend = defendRollSort(getDefendRolls(numDefenders()));
            compareRolls(attack, defend);
            
            
            detractUnits();
            winAttack();
       }
       }
    }   
    public void winAttack(){
        if(getDefendingTerritory().getOccupiedUnits()<1)
         {
            defenseWins = 0;
            attackWins = 0;
            attack = null;
            defend = null;
            setRolls();
            //setAttacking(false);
            //setAttackingUnits(1);
            //setDefendingTerritory(null);
            
            changeOwner();
            getWorld().removeObjects(getWorld().getObjects(AttackScreen.class));
            getWorld().removeObjects(getWorld().getObjects(AttackUnitsBox.class));
            getWorld().removeObjects(getWorld().getObjects(Plus.class));
            getWorld().removeObjects(getWorld().getObjects(Minus.class));
            getWorld().removeObjects(getWorld().getObjects(CancelButton.class));
            getWorld().removeObjects(getWorld().getObjects(AttackButton.class));
            
         }
    }
    public void transparent(){
        if(getCurrentlyClickedTerritory().getOccupiedUnits()<2)
        {
            getImage().setTransparency(150);
            setAttackingUnits(0);
        }
    }
    public void detractUnits(){
        getCurrentlyClickedTerritory().setOccupiedUnits(-defenseWins);
        getDefendingTerritory().setOccupiedUnits(-attackWins);
    }
    public int numDefenders(){
        if(getDefendingTerritory().getOccupiedUnits()>1)
            return 2;
        else 
            return 1;
    }
    public int numAttackers(){
        return getAttackingUnits();
    }
    public int[] getAttackRolls(int attackers){
        int[] diceRolls = new int[attackers];
        if(attackers == 3)
        {
            int roll1 = (int)(Math.random()*6)+1;
                diceRolls[0] = roll1;
            int roll2 = (int)(Math.random()*6)+1;
                diceRolls[1] = roll2;
            int roll3 = (int)(Math.random()*6)+1;
                diceRolls[2] = roll3;
        }
        else if(attackers == 2)
        {
            int roll1 = (int)(Math.random()*6)+1;
                diceRolls[0] = roll1;
            int roll2 = (int)(Math.random()*6)+1;
                diceRolls[1] = roll2;    
        }
        else if(attackers == 1)
        {
            int roll1 = (int)(Math.random()*6)+1;
                diceRolls[0] = roll1;  
        }
        return diceRolls;
    }
    public int[] getDefendRolls(int defenders){
        int[] diceRolls = new int[defenders];
        if(defenders == 2)
        {
            int roll1 = (int)(Math.random()*6)+1;
                diceRolls[0] = roll1;
            int roll2 = (int)(Math.random()*6)+1;
                diceRolls[1] = roll2;    
        }
        else if(defenders == 1)
        {
            int roll1 = (int)(Math.random()*6)+1;
                diceRolls[0] = roll1;  
        }
        return diceRolls;
    }
    public int[] attackRollSort(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max)
            max = numbers[i];
    }

    int[] sortedNumbers = new int[max+1];

    for (int i = 0; i < numbers.length; i++) {
        sortedNumbers[numbers[i]]++;
    }

    int insertPosition = 0;

    for (int i = 0; i <= max; i++) {
            for (int j = 0; j < sortedNumbers[i]; j++) {
                    numbers[insertPosition] = i;
                    insertPosition++;
            }
    }
    return numbers;
    }
    
    public int[] defendRollSort(int[] numbers) {
    if(numDefenders()==2)
    {
        if(numbers[0]>numbers[1])
            {
                int q = numbers[1];
                numbers[1]=numbers[0];
                numbers[0]=q;
                return numbers;
            }
    }
    return numbers;
    }
    public void compareRolls(int[]attack, int[]defend){
        if(numAttackers()==3&&numDefenders()==2)
        {
            int aroll1 = attack[2];
                attackRoll1 = aroll1;
            int aroll2 = attack[1];
                attackRoll2 = aroll2;
            int aroll3 = attack[0];
                attackRoll3 = aroll3;
            int droll1 = defend[1];
                defenseRoll1 = droll1;
            int droll2 = defend[0];
                defenseRoll2 = droll2;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
            if(aroll2>droll2)
                attackWins++;
            else
                defenseWins++;
        }
        else if(numAttackers()==3&&numDefenders()==1)
        {
            int aroll1 = attack[2];
                attackRoll1 = aroll1;
            int aroll2 = attack[1];
                attackRoll2 = aroll2;
            int aroll3 = attack[0];
                attackRoll3 = aroll3;
            int droll1 = defend[0];
                defenseRoll1 = droll1;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
        }
        else if(numAttackers()==2&&numDefenders()==2)
        {
            int aroll1 = attack[1];
                attackRoll1 = aroll1;
            int aroll2 = attack[0];
                attackRoll2 = aroll2;
            int droll1 = defend[1];
                defenseRoll1 = droll1;
            int droll2 = defend[0];
                defenseRoll2 = droll2;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
            if(aroll2>droll2)
                attackWins++;
            else
                defenseWins++;
        }
        else if(numAttackers()==2&&numDefenders()==1)
        {
            int aroll1 = attack[1];
                attackRoll1 = aroll1;
            int aroll2 = attack[0];
                attackRoll2 = aroll2;
            int droll1 = defend[0];
                defenseRoll1 = droll1;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
        }
        else if (numAttackers()==1&&numDefenders()==2)
        {
            int aroll1 = attack[0];
                attackRoll1 = aroll1;
            int droll1 = defend[1];
                defenseRoll1 = droll1;
            int droll2 = defend[0];
                defenseRoll2 = droll2;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
        }
        else if (numAttackers()==1&&numDefenders()==1)
        {
            int aroll1 = attack[0];
                attackRoll1 = aroll1;
            int droll1 = defend[0];
                defenseRoll1 = droll1;
            if(aroll1>droll1)
                attackWins++;
            else
                defenseWins++;
        }
    }
}
