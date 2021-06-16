
public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human to_heal) {
		to_heal.health = to_heal.health+this.intelligence;
	}
	public void fireball(Human to_attack) {
		to_attack.health = to_attack.health-(this.intelligence*3);
	}
}
