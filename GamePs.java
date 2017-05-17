import java.io.*;
import java.util.*;

class Game{
	/*
		Insert necessary fields here
	*/
	
	// constructor
	public Game(){
		Scanner direction = new Scanner();
	}
	
	method navigate(Scanner direction){
		print("Pick a direction, left or right");
		direction.next();
		
		// insert randomizer here (randomizer should use math.random)
		if (result of random >= 0.5){
			navigate(); // recursion
		} else if(result of random < 0.5){
			// bumps into monster
		} else if (all monsters killed){
			// end game
		}
	}
}