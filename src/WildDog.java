
public class WildDog extends Enemy {

	public String attMethod() {
		return "Bite";
	}
	
	public String defMethod() {
		return "Dive";
	}
	
	public WildDog(int iD, int health, int attack, int defence) {
		super(iD, health, attack, defence);
	}

	public String toString() {
		return "iD: " + this.iD + "    Health: " + this.health + "    Attack: " + this.attack + "    Defence: " + this.defence + 
				"    Attack Method: " + this.attMethod() + "    Defence Method: " + this.defMethod();
	}
}
