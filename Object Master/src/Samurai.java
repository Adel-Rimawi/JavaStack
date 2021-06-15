
public class Samurai extends Human{
	private static int samuraiNum = 0;
	public Samurai() {
		this.health = 200;
		Samurai.samuraiNum += 1;
	}
	public static int howMany() {
        return Samurai.samuraiNum;
    }
	public void deathBlow(Human target) {
		target.health = target.health - target.health;
		this.health = this.health -(this.health/2);
	}
	public void meditate() {
		this.health = this.health +(this.health/2);
	}
}
