
public class Human {
	private int strength=3;
	private int stealth=3;
	private int intelligence = 3;
	private int health = 100;
	
	public int gethealth() {
		return this.health;
	}
	
	public void attack(Human to_attack) {
		to_attack.health= to_attack.health-this.strength;
	}
}
