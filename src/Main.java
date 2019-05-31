
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Player p1 = new Player(10, 10, 10);
		System.out.println(p1);
		
		WildDog e1 = new WildDog(1, 5, 2, 2);
		System.out.println(e1);
		
		Giant e2 = new Giant(2, 20, 5, 5);
		System.out.println(e2);
		
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
