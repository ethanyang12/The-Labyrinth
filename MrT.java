/* Mr. T boss
   implements the monster interface
   does 50hp of damage to the player
   takes 4 hits to kill
*/
public class MrT implements Monster {
   //returns that MrT does 24 hp of damage to player
   public int Damage() {
      int damage = 24;
      return damage;
   }
   //returns MrT's health of 4
   public int Death() {
      int hp = 4;
      return hp;
   }
   //returns that MrT appears last
   public int Order() {
      int appearancenumber = 4;
      return appearancenumber;
   }
}