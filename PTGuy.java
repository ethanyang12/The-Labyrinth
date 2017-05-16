/* Primitive Technology Guy monster
   implements the monster interface
   does 10hp of damage to the player
   takes 1 hits to kill
*/
public class PTGuy implements Monster {
   public int Damage() {
      int damage = 10;
      return damage;
   }
   public int Death() {
      int hp = 1;
      return hp;
   }
}