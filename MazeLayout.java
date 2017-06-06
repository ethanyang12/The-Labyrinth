import java.util.*;

public class MazeLayout {

   public static void main(String[] args) throws Exception {
      int progress = 0;
      int[] z = new int[2]; //holds the number of left and right turns
     /* int x = z[0];
      int y = z[1];*/
      choice(progress, z);
   
   }
   //this method asks for the original direction the user wants to
   public static String choice(int progress, int[] z) throws Exception {
      Scanner console = new Scanner(System.in);
      while (progress <= 6){
         System.out.println("Would you like to go right or left?");
         String ok = console.next();  
         if (ok.equals("right")) {
            z[0]++;
            right(progress, console, z);
         }
         else if (ok.equals("left")){
            z[1]++;
            left(progress, console, z);
         }
         return(ok);
      }
      return(null);
   }
   
   public static void right(int progress, Scanner console, int[] z) throws Exception {
      while (progress < 6) {
         System.out.println("Would you like to go right or left?");
         String ok = console.next();  
         if (ok.equals("right")) {
            z[0]++;
         }
         
         else if (ok.equals("left")) {
            z[1]++;
         }
         
         if (z[0] == 1) {        
            System.out.println("PT Guy");
            Monster ptguy = new PTGuy();         
            progress++;            
         }
         
         if (z[0] == 3 || z[1] == 4) {
            System.out.print("L. Gates");
         }
         
         if (z[0] == 5 || z[1] == 6) {
            System.out.print("momo");
         }
         
         if (z[0] == 6 || z[1] == 7) {
            System.out.print("Mr. T");
         }
      
      }
      progress++;    
      
   }
   
   public static void left(int progress, Scanner console, int[] z) throws Exception {
      while (progress < 6) {
         System.out.println("Would you like to go right or left?");
         String ok = console.next();  
         if (ok.equals("right")) {
            z[0]++;
         }
         
         else if (ok.equals("left")) {
            z[1]++;
         }
         
         if (z[1] == 1) {
            System.out.println("PT Guy");
            Monster ptguy = new PTGuy();         
            progress++;  
         }
         
         if (z[0] == 3 || z[1] == 4) {
            System.out.print("L. Gates");
         }
         
         if (z[0] == 5 || z[1] == 6) {
            System.out.print("momo");
         }
         
         if (z[0] == 6 || z[1] == 7) {
            System.out.print("Mr. T");
         }
      
      }
      progress++;
   
   }
}