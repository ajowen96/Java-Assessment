
public abstract class Enemy {

	int iD;
	int health;
	int attack;
	int defence;
	String attackMethod;
	String defenceMethod;
	
	public String attMethod() {
		return attackMethod;
	}
	
	public String defMethod() {
		return defenceMethod;
	}
	
	public Enemy(int iD, int health, int attack, int defence) {
		this.iD = iD;
		this.health = health;
		this.attack = attack;
		this.defence = defence;
	}
}
