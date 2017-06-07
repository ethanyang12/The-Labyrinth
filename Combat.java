import java.util.*;

public class Combat {
   private int death;
   
   //constructor to hold how many hits different monsters can take before they die
   public Combat(int death) {
      this.death = death;
   }
   //an entire combat sequence between one monster and a player
   public void monsterAttack(int damage, int playerhp, int monster) {
      Scanner console = new Scanner(System.in);
      while (death > 0) {
         playerhp = playerhp - damage;
         System.out.println("You've been attacked! The monster did " + damage + " damage to you.");
         System.out.println("HP - " + playerhp);
         System.out.println();
         
         System.out.println("Type ATTACK");
         if (console.next().equals("ATTACK")) {
            System.out.println("You've attacked the monster!");
            System.out.println();
            death--;
         }
      }
      if (monster != 4) {
         System.out.println("You've beat the monster! Time to move on...");
         System.out.println();
      }
      else {
         System.out.println("Congradulations!!! You have beat Mr. T and exited the maze");
      }      
   }   
}