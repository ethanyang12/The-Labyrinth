class Player{
	public int Health(){
		int i = 100;
		
		// Assuming typing "drink"  drinks the potion
		if (input = "drink" && potions are available){
			if (i = 100){
				potion has no effect;
			} else{
				restore full health;
			}
		}
		
		if (health <= 0){
			end game;
		}
		return i;
	}
	
	method inventory(){
		array items([potions][weapons]);
		
		if (input = "INVENTORY"){
			println array items;
		}
		
		whichDirection();
	}
	
	method Attack(){
		if (input = "YEET"){
			stabbing animation;
			int healthofMonster = - damage of weapon;
		}
	}
}