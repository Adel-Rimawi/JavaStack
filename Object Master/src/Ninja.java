
public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Human target) {
		this.health = this.health +this.stealth;
		target.health = target.health-this.stealth;
	}
	public void runAway() {
		this.health = this.health - 10;
	}

}
