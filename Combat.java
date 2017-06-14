import java.util.*;

public class Combat {
   private int death;
   
   //constructor to hold how many hits different monsters can take before they die
   public Combat(int death) {
      this.death = death;
   }
   //an entire combat sequence between one monster and a player
   public int monsterAttack(int damage, int playerhp, int monster) {
      Scanner console = new Scanner(System.in);
      while (death > 0) {
         playerhp = playerhp - damage;
         System.out.println("You've been attacked! The monster did " + damage + " damage to you.");
         System.out.println("HEALTH: " + playerhp);
         System.out.println();
         
         System.out.println("Type attack");
         if (console.next().equals("attack")) {
            System.out.println("You've attacked the monster!");
            System.out.println();
            death--;
         }
         else {
            System.out.println("Oops! You didn't attack right....");
            System.out.println();
         }
      }
      if (monster < 4) {
         System.out.println("You've beat the monster! Time to move on...");
      }
      else {
         System.out.println("Congradulations!!! You have beat Mr. T and exited the maze");
      }
      return playerhp;      
   }   
}