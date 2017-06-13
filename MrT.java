/* Mr. T boss
   implements the monster interface
   does 50hp of damage to the player
   takes 4 hits to kill
*/
public class MrT implements Monster {
   public int Damage() {
      int damage = 50;
      return damage;
   }
   public int Death() {
      int hp = 4;
      return hp;
   }
   public int Order() {
      int appearancenumber = 4;
      return appearancenumber;
   }
}