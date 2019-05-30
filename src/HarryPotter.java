/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */
 
		// Create a HarryRunner class with a main method that:
		// 1. makes harry potter
		// 2. become invisible
		// 3. spy on Professor Snape
		// 4. become visible again
		// 5. cast a “stupefy” spell


public class HarryPotter {

	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Arman is invisible");
		else
			System.out.println(" Arman is visible");
	}

	void spyOnSnape() {
		System.out.println("Arman sees Professor Snape doing evil things.");
	}


}






