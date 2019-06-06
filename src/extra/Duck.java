package extra;

public class Duck {	
	private int numberOfFriends;
	private String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = "pizza";
      	this.numberOfFriends = 0;
      	
	}

void quack() {
	System.out.println("QUACK! QUACK!");
}
void waddle() {
	System.out.println("WADDLE! WADDLE!");
}
}