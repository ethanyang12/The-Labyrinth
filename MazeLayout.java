import java.util.*;

public class MazeLayout {

   public static void main(String[] args) throws Exception{
      choice();
   }
   //this method asks what
   public static void choice() throws Exception {
      int progress = 0;
      Scanner console = new Scanner(System.in);
      System.out.println("Would you like to go right or left?");
      String ok = console.next();
      //you fight pt guy
      while (progress <= 15) {
         if (progress == 2) {
            System.out.println("Your wilderness survival skill are sub-par, prepare to be belittled!");
            new ImageDemo("SevereBoy.jpg");
         //call combat object
            progress++;
         }
        progress++;
      }
      
   }
}