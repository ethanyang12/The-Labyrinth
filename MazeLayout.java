import java.util.*;

public class MazeLayout {

   public static void main(String[] args) throws Exception{
      choice();
   }
   //this method calls the monsters at certain points in the maze.
   public static void choice() throws Exception {
   
      int progress = 0;
      
      Scanner console = new Scanner(System.in);
      
      System.out.println("Would you like to go right or left?");
      
      String ok = console.next();
      
      //you fight pt guy
      while (progress <= 15) {
      
         if (progress == 2) {
            //call pt guy
            progress++;
         }
         
         else if (progress == 4) {
         //call LGates
         progress++;
         }
         
         else if (progress == 6) {
         //call Mr. T
            System.out.println("Filler for stuff");
         }
        progress++;
      }
      
   }
}