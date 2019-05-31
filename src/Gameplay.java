
public abstract class Gameplay {

	public static int northSouthCounter;
	public static int eastWestCounter;
	
	public static void intro() {
		System.out.println("If you want to quit the game at any time, type \"quit\"\n\n"
				+ "Grey foggy clouds float oppressively close to you, reflected in the murky\n"
				+ "grey water which reaches up your shins. Some black plants barely poke out\n"
				+ "of the shallow water.");
	}
	
	public static void input() {
		
	}
	
	public static void move(String userInput) {
		
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
	}
	
	public static boolean endGame() {
		if ((eastWestCounter == 5 && northSouthCounter == 5) || 
			(eastWestCounter == 5 && northSouthCounter == -5) || 
			(eastWestCounter == -5 && northSouthCounter == 5) || 
			(eastWestCounter == -5 && northSouthCounter == -5) || 
			(eastWestCounter == 3 && northSouthCounter == 3) || 				
			(eastWestCounter == 3 && northSouthCounter == -3) || 
			(eastWestCounter == -3 && northSouthCounter == 3) || 
			(eastWestCounter == -3 && northSouthCounter == -3)) {
				return true;
			}
		else {
			return false;
		}
	}
}
