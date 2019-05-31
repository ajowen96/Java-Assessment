
public class WinConditions extends Gameplay {
	
	public static void winConditions(String userInput) {
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 5 && northSouthCounter == 5) || (eastWestCounter == 5 && northSouthCounter == -5) || (eastWestCounter == -5 && northSouthCounter == 5) || (eastWestCounter == -5 && northSouthCounter == -5))) {
			System.out.println("You notice a silvery chest through the overgrown swamp grass. You open it\nand get instantly teleported out of the nightmare you had somehow found\nyourself trapped in. Congratulations! You escaped!");
		}
	}
}
