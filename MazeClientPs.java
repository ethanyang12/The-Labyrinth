// Pseudocode for Class MazeClient

// import java.util.*;
class MazeClient{
	void main(String[] args){
		StartGame(scanner);
	}
	
	// Method that "starts" the game
	void StartGame(scanner){
		intro();
		if(scanner input = enter){ // assuming enter key starts the game
			// Code that starts the game
         Game s1 = new Game(); // Our game is an object. To play a game, we must create the object.
		   s1.Play(); // Object StartGame will have a method named "Play" that "starts" the game.
		}
	}
	
	// Method that prints our intro text
	void intro(){
		println("Welcome to the Labyrinth");
		println("Press \"Enter\" to Start");
	}
}   