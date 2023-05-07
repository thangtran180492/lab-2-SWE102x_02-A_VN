package sp1adapter;

/**
 * Adapter allows fitting square pegs into round holes.
 */

public class SquarePegAdapter extends RoundPeg {
	private SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}

	@Override
	public double getRadius() {

        // Calculate a minimum circle radius, which can fit this peg.
		// Tính bán kính vòng tròn tối thiểu, có thể phù hợp với Peg này
        double result = (Math.sqrt(Math.pow((this.peg.getWidth() / 2), 2) * 2));
        
        return result;
	}
	
}
