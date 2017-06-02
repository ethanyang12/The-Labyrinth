/* The player class involves mainly the Health of the player and how many potions they hold.
   With this class the player can heal and they take damage
*/ 
public class Player {
   private int hp;
   private int numberofpotions;
   
   //constructor that allows for the fields
   public Player(int hp, int numberofpotions) {
      this.hp = hp;    
      this.numberofpotions = numberofpotions;
   }
   //takes in damage from the attack of a monster and lowers the players health 
   public int Health(int damage) {
      int currenthp = hp - damage;
      return currenthp;  
   }
   //heals the players health with a potion 
   public int Heal() {
      int hprestored = 20;
      return hprestored;
   }
   public int Potions() {
      int numberofpotions = this.numberofpotions;
      return numberofpotions;
   } 
}
