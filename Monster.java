/* All monsters will have the methods Damage and Death. This interface is implemented into every 
   monster class
*/
public interface Monster {
   //Damage shows how much damage a monster does to the player   
   public int Damage(); 
   //Death returns the number of hits a monster takes to beat
   public int Death();
   //Order returns when a monster appears
   public int Order();   
}