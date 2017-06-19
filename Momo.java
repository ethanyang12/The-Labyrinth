/* Momo the Monkey monster
   implements the monster interface
   does 20hp of damage to the player
   takes 3 hits to kill
*/
public class Momo implements Monster {
   //returns that Momo does 20 hp of damage to player
   public int Damage() {
      int damage = 20;
      return damage;
   }
   //returns Momo's health of 3
   public int Death() {
      int hp = 3;
      return hp;
   }
   //returns that Momo appears third
   public int Order() {
      int appearancenumber = 3;
      return appearancenumber;
   }
}