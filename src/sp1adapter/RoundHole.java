package sp1adapter;

public class RoundHole {
	private double radius;
	
	public RoundHole(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public boolean fits(RoundPeg pg) {
		return this.getRadius() >= pg.getRadius();
	}
}
