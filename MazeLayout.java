import java.util.*;

public class MazeLayout {

   public static void main(String[] args) throws Exception {
      int progress = 0;
      int[] z = new int[2]; 
      int x = z[0];
      int y = z[1];
      choice(progress, x, y);
   
   }
   //this method calls the monsters at certain points in the maze.
   public static String choice(int progress, int x, int y) throws Exception {
      Scanner console = new Scanner(System.in);
      while (progress <= 6){
         System.out.println("Would you like to go right or left?");
         String ok = console.next();  
         if (ok.equals("right")) {
            x++;
            right(progress, x, y);
         }
         else if (ok.equals("left")){
            y++;
            left(progress, x, y);
         }
         return(ok);
      }
      return(null);
   }
   
   public static void right(int progress, int x, int y) throws Exception {
            
      
      if (x == 2) {        
         System.out.print("PT Guy");
         Monster ptguy = new PTGuy();         
         progress++;            

      }
         
         
      
      
      progress++;    
      choice(progress, x, y);
   }
   
   public static void left(int progress, int x, int y) throws Exception {
      progress++;
      choice(progress, x, y);
   }
}