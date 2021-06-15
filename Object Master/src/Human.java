
public class Human {
	protected int strength=3;
	protected int stealth=3;
	protected int intelligence = 3;
	protected int health = 100;
	
	public int gethealth() {
		return this.health;
	}
	
	public void attack(Human to_attack) {
		to_attack.health= to_attack.health-this.strength;
	}
}
