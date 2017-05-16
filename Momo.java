/* Momo the Monkey monster
   implements the monster interface
   does 20hp of damage to the player
   takes 3 hits to kill
*/
public class Momo implements Monster {
   public int Damage() {
      int damage = 20;
      return damage;
   }
   public int Death() {
      int hp = 3;
      return hp;
   }
}