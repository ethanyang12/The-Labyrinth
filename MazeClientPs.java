// Pseudocode for Class MazeClient

// Option 1: StartGame as an object
// import java.util.*;
class MazeClient{	
	void main(String[] args){
		StartGame s1 = new StartGame(); // Our game is an object. To play a game, we must create the object.
		s1.Play(); // Object StartGame will have a method named "Play" that "starts" the game.
	}
}

// Option 2: StartGame as a method
// import java.util.*;
class MazeClient{
	void main(String[] args){
		StartGame(scanner);
	}
	
	// Method that "starts" the game
	void StartGame(scanner){
		intro();
		if(scanner input = enter){ // assuming enter key starts the game
		
		}
	}
	
	// Method that prints our intro text
	void intro(){
		println("Welcome to the Labyrinth");
		println("Press \"Enter\" to Start");
	}
}
