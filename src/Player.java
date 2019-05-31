
public class Player {

	int health;
	int attack;
	int defence;
	
	public String attMethod() {
		return "Sword";
	}
	
	public String defMethod() {
		return "Shield";
	}
	
	public Player(int health, int attack, int defence) {
		this.health = health;
		this.attack = attack;
		this.defence = defence;
	}
	
	public String toString() {
		return "Health: " + this.health + "    Attack: " + this.attack + "    Defence: " + this.defence + 
				"    Attack Method: " + this.attMethod() + "    Defence Method: " + this.defMethod();
	}
}
