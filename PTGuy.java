/* Primitive Technology Guy monster
   implements the monster interface
   does 10hp of damage to the player
   takes 1 hits to kill
*/
public class PTGuy implements Monster {
   //returns that PTGuy does 10 hp of damage to player
   public int Damage() {
      int damage = 10;
      return damage;
   }
   //returns PTguy's health of 1
   public int Death() {
      int hp = 1;
      return hp;
   }
   //returns that PTGuy appears first
   public int Order() {
      int appearancenumber = 1;
      return appearancenumber;
   }
}