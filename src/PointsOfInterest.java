
public class PointsOfInterest extends Gameplay {

	public static void pointsOfInterest(String userInput) {
		
		if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && ((eastWestCounter == 0 && northSouthCounter == 1) || (eastWestCounter == 0 && northSouthCounter == -1) || (eastWestCounter == 1 && northSouthCounter == 0) || (eastWestCounter == -1 && northSouthCounter == 0))) {
			System.out.println("You notice a small watch-like device in your left hand. It has hands like\na watch, but the hands don't seem to tell time.");
		}
		else if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 0 && northSouthCounter == 5) {
			System.out.println("You come across a mysterious blade and decide to pick it up for protection.");
		}
		else if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 0 && northSouthCounter == -5) {
			System.out.println("You come across an enchanted tree that glows bright and decide to break off\na branch to help light your way.");
		}
		else if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == 5 && northSouthCounter == 0) {
			System.out.println("You find a sheltered cave and decide to rest in it for a short while before\ncontinuing on your adventure.");
		}
		else if ((userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) && eastWestCounter == -5 && northSouthCounter == 0) {
			System.out.println("You see a dark silhouette to the west in the distance. Could further danger\nawait?");
		}
	}
}
