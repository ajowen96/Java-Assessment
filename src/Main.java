
import java.util.*;

public class Main extends TextGame {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky\ngrey water which reaches up your shins. Some black plants barely poke out\nof the shallow water.");
		while(true) {
			System.out.println("\nTry \"north\", \"south\", \"east\" or \"west\"");
			String s = userInput.next();
			System.out.println("\nYou travel " + s + "...");
			TextGame.gameplay(s);
			if ((eastWestCounter == 5 && northSouthCounter == 5) || (eastWestCounter == 5 && northSouthCounter == -5) || (eastWestCounter == -5 && northSouthCounter == 5) || (eastWestCounter == -5 && northSouthCounter == -5) || (eastWestCounter == 3 && northSouthCounter == 3) || (eastWestCounter == 3 && northSouthCounter == -3) || (eastWestCounter == -3 && northSouthCounter == 3) || (eastWestCounter == -3 && northSouthCounter == -3)) {
				break;
			}
			System.out.println("\nDo you want to continue your adventure? type any input to continue or \"no\" or \"n\" to stop");
			String resume = userInput.next();
			if (resume.equals("no") || resume.equals("n")) {
				break;
			}
		}
	}
}
