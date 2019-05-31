
public class LoseConditions extends Gameplay {

	public static void loseConditions(String userInput) {
	
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 3 && northSouthCounter == 3) || (eastWestCounter == 3 && northSouthCounter == -3) || (eastWestCounter == -3 && northSouthCounter == 3) || (eastWestCounter == -3 && northSouthCounter == -3))) {
			System.out.println("Oh no! In the complete darkness you accidentally fell into the void!\nYou fall forever until the end of time itself. Game Over!");
		}
	}
}
