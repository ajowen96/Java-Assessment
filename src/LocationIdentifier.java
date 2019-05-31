
public class LocationIdentifier extends Gameplay {
	
	public static void locationIdentifier(String userInput) {
			
		if (userInput.equals("north") || userInput.equals("south") || userInput.equals("east") || userInput.equals("west")) {
			System.out.println("The device reads: North " + "(" + northSouthCounter + "), East " + "(" + eastWestCounter + ")");
		}
	}
}
