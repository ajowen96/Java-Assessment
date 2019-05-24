
public class TextGame {
	
	public static int northSouthCounter;
	public static int eastWestCounter;
	
	public static void gameplay(String userInput) {

// Update location identifier
		
		if (userInput.equals("north")) {
			northSouthCounter += 1;
		}
		if (userInput.equals("south")) {
			northSouthCounter -= 1;
		}
		if (userInput.equals("east")) {
			eastWestCounter += 1;
		}
		if (userInput.equals("west")) {
			eastWestCounter -= 1;
		}
		
		
		
// Beginning sequence
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 0 && northSouthCounter == 1) || (eastWestCounter == 0 && northSouthCounter == -1) || (eastWestCounter == 1 && northSouthCounter == 0) || (eastWestCounter == -1 && northSouthCounter == 0))) {
			System.out.println("You notice a small watch-like device in your left hand. It has hands like\na watch, but the hands don't seem to tell time.");
		}
		
		
		
// Points of interest
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 0 && northSouthCounter == 5) {
			System.out.println("You come across a mysterious blade and decide to pick it up for protection.");
		}
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 0 && northSouthCounter == -5) {
			System.out.println("You come across an enchanted tree that glows bright and decide to break off\na branch to help light your way.");
		}
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 5 && northSouthCounter == 0) {
			System.out.println("You find a sheltered cave and decide to rest in it for a short while before\ncontinuing on your adventure.");
		}
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == -5 && northSouthCounter == 0) {
			System.out.println("You see a dark silhouette to the west in the distance. Could further danger\nawait?");
		}
		
		
		
// Game lost
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 3 && northSouthCounter == 3) || (eastWestCounter == 3 && northSouthCounter == -3) || (eastWestCounter == -3 && northSouthCounter == 3) || (eastWestCounter == -3 && northSouthCounter == -3))) {
			System.out.println("Oh no! In the complete darkness you accidentally fell into the void!\nYou fall forever until the end of time itself. Game Over!");
		}
		
		
		
// Game won
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 5 && northSouthCounter == 5) || (eastWestCounter == 5 && northSouthCounter == -5) || (eastWestCounter == -5 && northSouthCounter == 5) || (eastWestCounter == -5 && northSouthCounter == -5))) {
			System.out.println("You notice a silvery chest through the overgrown swamp grass. You open it\nand get instantly teleported out of the nightmare you had somehow found\nyourself trapped in. Congratulations! You escaped!");
		}
		
		
		
// Location identifier
		
		if (userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) {
			System.out.println("The device reads: North " + "(" + northSouthCounter + "), East " + "(" + eastWestCounter + ")");
		}
	}
}
