//this class will contain the main method that will run everything
import java.util.*;

public class MazeClient {
   private static int health;
   //the main method here will be what runs the game
   public static void main(String[] args) throws Exception{
      Scanner console = new Scanner(System.in);
      health = 100;
      //Travels the Maze; from MazeLayout
      int progress = 0;
      int[] z = new int[2]; //holds the number of left and right turns
     /* int x = z[0];
      int y = z[1];*/
      choice(progress, z);
      
  }
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
         
         if (z[0] == 2) {        
            System.out.println("PT Guy");
            Monster ptguy = new PTGuy();  
            Combat ptguycombat = new Combat(ptguy.Death());
            health = ptguycombat.monsterAttack(ptguy.Damage(), health, ptguy.Order());                    
            progress++;            
         }
         
         if (z[0] == 3 && z[1] == 4) {
            System.out.println("L. Gates");
            Monster lgates = new LGates();
            Combat lgatescombat = new Combat(lgates.Death());
            health = lgatescombat.monsterAttack(lgates.Damage(), health, lgates.Order());        
            progress++;  
         }
         
         if (z[0] == 5 && z[1] == 6) {
            System.out.println("Momo");
            Monster momo = new Momo();
            Combat momocombat = new Combat(momo.Death());
            momocombat.monsterAttack(momo.Damage(), 100, momo.Order());         
            progress++; 
         }
         
         if (z[0] == 6 && z[1] == 7) {
            System.out.println("Mr. T");
            Monster mrT = new MrT();
            Combat mrTcombat = new Combat(mrT.Death());
            mrTcombat.monsterAttack(mrT.Damage(), 100, mrT.Order());         
            progress++; 
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
            Combat ptguycombat = new Combat(ptguy.Death());
            health = ptguycombat.monsterAttack(ptguy.Damage(), health, ptguy.Order());         
            progress++;  
         }
         
         if (z[0] == 3 && z[1] == 4) {
            System.out.println("L. Gates");
            Monster lgates = new LGates();
            Combat lgatescombat = new Combat(lgates.Death());
            health = lgatescombat.monsterAttack(lgates.Damage(), health, lgates.Order());         
            progress++;  
         }
         
         if (z[0] == 5 && z[1] == 6) {
            System.out.println("Momo");
            Monster momo = new Momo();
            Combat momocombat = new Combat(momo.Death());
            momocombat.monsterAttack(momo.Damage(), 100, momo.Order());         
            progress++;  
         }
         
         if (z[0] == 6 && z[1] == 7) {
            System.out.println("Mr. T");
            Monster mrT = new MrT();
            Combat mrTcombat = new Combat(mrT.Death());
            mrTcombat.monsterAttack(mrT.Damage(), 100, mrT.Order());         
            progress++;  
         }
      
      }
      progress++;  
   }   
}
