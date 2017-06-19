/* L.Gates monster
   implements the monster interface
   does 15hp of damage to the player
   takes 2 hits to kill
*/
public class LGates implements Monster {
   //returns that LGates does 15 hp of damage to player
   public int Damage() {
      int damage = 15;
      return damage;
   }
   //returns LGates' health of 2
   public int Death() {
      int hp = 2;
      return hp;
   }
   //returns that LGates appears second
   public int Order() {
      int appearancenumber = 2;
      return appearancenumber;
   }
}