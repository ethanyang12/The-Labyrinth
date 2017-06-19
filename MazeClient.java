//this class will contain the main method that will run everything
import java.util.*;

public class MazeClient {
   //this field holds the player's health throughout the program
   private static int health;
   
   /* the main method here will be what runs the game
    * currently there are two main bugs 
      1. if the array's number of lefts and rights don't match up to the 
    *    numbers, the program will not work and you won't run into certain monster
    * 2. The game will not end when the player health reaches 0.
    *    A problem connecting to this is that potions and healing is not yet integrated
    *    so it is not possible to beat the game as of now.
   */
   
   public static void main(String[] args) throws Exception{
      Scanner console = new Scanner(System.in);
      health = 100;
      while (health > 0) {
         //Travels the Maze; from MazeLayout
         int progress = 0;
         int[] z = new int[2]; //holds the number of left and right turns
         /* int x = z[0];
         int y = z[1];*/
         Welcome();
         choice(progress, z);
      }
      System.out.println("You died!");       
  }
  //first step that sends you to either left or right
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
   // if the first step is right, these are the options that will appear
   public static void right(int progress, Scanner console, int[] z) throws Exception {
      while (progress < 6) {
         System.out.println("Would you like to go right or left?");
         String ok = console.next();
         //when index 0 and 1 of the array equal certain numbers, different monsters will appear  
         if (ok.equals("right")) {
            z[0]++;
         }
         
         else if (ok.equals("left")) {
            z[1]++;
         }
         
         if (z[0] == 2) {        
            System.out.println("The Primitive Technology Guy appeared!");
            Monster ptguy = new PTGuy();  
            Combat ptguycombat = new Combat(ptguy.Death());
             
            health = ptguycombat.monsterAttack(ptguy.Damage(), health, ptguy.Order());                    
            progress++;            
         }
         
         if (z[0] == 3 && z[1] == 4) {
            System.out.println("L. Gates came with the bars!");
            Monster lgates = new LGates();
            Combat lgatescombat = new Combat(lgates.Death());
            health = lgatescombat.monsterAttack(lgates.Damage(), health, lgates.Order());        
            progress++;  
         }
         
         if (z[0] == 5 && z[1] == 6) {
            System.out.println("Momo the Monkey suddenly jumped out!");
            Monster momo = new Momo();
            Combat momocombat = new Combat(momo.Death());
            momocombat.monsterAttack(momo.Damage(), health, momo.Order());         
            progress++; 
         }
         
         if (z[0] == 6 && z[1] == 7) {
            System.out.println("You have finally reached Mr.T! He is the final boss...");
            Monster mrT = new MrT();
            Combat mrTcombat = new Combat(mrT.Death());
            mrTcombat.monsterAttack(mrT.Damage(), health, mrT.Order());
            break;         
         }
      
      }
      progress++;    
      
   }
   // if the first step is left, these are the options that will appear
   public static void left(int progress, Scanner console, int[] z) throws Exception {
      while (progress < 6) {
         System.out.println("Would you like to go right or left?");
         String ok = console.next();
         //when index 0 and 1 of the array equal certain numbers, different monsters will appear  
         if (ok.equals("right")) {
            z[0]++;
         }
         
         else if (ok.equals("left")) {
            z[1]++;
         }
         
         if (z[1] == 1) {
            System.out.println("The Primitive Technology Guy appeared!");
            Monster ptguy = new PTGuy();
            Combat ptguycombat = new Combat(ptguy.Death());
            health = ptguycombat.monsterAttack(ptguy.Damage(), health, ptguy.Order());         
            progress++;  
         }
         
         if (z[0] == 3 && z[1] == 4) {
            System.out.println("L. Gates came with the bars!");
            Monster lgates = new LGates();
            Combat lgatescombat = new Combat(lgates.Death());
            health = lgatescombat.monsterAttack(lgates.Damage(), health, lgates.Order());         
            progress++;  
         }
         
         if (z[0] == 5 && z[1] == 6) {
            System.out.println("Momo the Monkey suddenly jumped out!");
            Monster momo = new Momo();
            Combat momocombat = new Combat(momo.Death());
            momocombat.monsterAttack(momo.Damage(), health, momo.Order());         
            progress++;  
         }
         
         if (z[0] == 6 && z[1] == 7) {
            System.out.println("You have finally reached Mr.T! He is the final boss...");
            Monster mrT = new MrT();
            Combat mrTcombat = new Combat(mrT.Death());
            mrTcombat.monsterAttack(mrT.Damage(), health, mrT.Order());     
            break;      
         }
      
      }
      progress++;  
   } 
   //Welcome message
   public static void Welcome() {
      System.out.println("Welcome to the Labyrinth!");
      System.out.println("Will you live or will you die? For all who enter, I TERRIFY!");
      System.out.println();
   }
}