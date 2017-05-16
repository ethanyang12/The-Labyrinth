// Pseudocode for Class MazeClient

import java.util.*;
class MazeClient{
        void main(String[] args){
                Scanner s = new Scanner();
                StartGame(s);
        }
        
        // Method that "starts" the game
        void StartGame(scanner s){
                intro();
                s.next();
                if(s.input = enter){ // assuming enter key starts the game
                        // Code that starts the game
                        Game g1 = new Game(); // Our game is an object. To play a game, we must create the object.
                        g1.Play(); // Object StartGame will have a method named "Play" that "starts" the game.
                }
        }
        
        // Method that prints our intro text
        void intro(){
                println("Welcome to the Labyrinth");
                println("Press \"Enter\" to Start");
        }
}
