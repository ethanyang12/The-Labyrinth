/* L.Gates monster
   implements the monster interface
   does 15hp of damage to the player
   takes 2 hits to kill
*/
public class LGates implements Monster {
   public int Damage() {
      int damage = 15;
      return damage;
   }
   public int Death() {
      int hp = 2;
      return hp;
   }
   public int Order() {
      int appearancenumber = 2;
      return appearancenumber;
   }
}
