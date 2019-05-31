
public class Giant extends Enemy {

	public String attMethod() {
		return "Kick";
	}
	
	public String defMethod() {
		return "Guard";
	}
	
	public Giant(int iD, int health, int attack, int defence) {
		super(iD, health, attack, defence);
	}

	public String toString() {
		return "iD: " + this.iD + "    Health: " + this.health + "    Attack: " + this.attack + "    Defence: " + this.defence + 
				"    Attack Method: " + this.attMethod() + "    Defence Method: " + this.defMethod();
	}
}
