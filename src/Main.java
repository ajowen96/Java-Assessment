
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		Gameplay.intro();
		
		while(true) {
			System.out.println("\nTry \"north\", \"south\", \"east\" or \"west\"");
			String s = userInput.next().toLowerCase();
			if (s.equalsIgnoreCase("quit")) {
				break;
			}
			if (s.equals("north") || s.equals("south") || s.equals("east") || s.equals("west")) {
			System.out.println("\nYou travel " + s + "...");
			}
			else {
				System.out.println("\nInvalid direction, try again");
			}
			Gameplay.move(s);
			LocationIdentifier.locationIdentifier(s);
			PointsOfInterest.pointsOfInterest(s);
			LoseConditions.loseConditions(s);
			WinConditions.winConditions(s);
			if (Gameplay.endGame() == true) {
				break;
			}
		}
	}
}
