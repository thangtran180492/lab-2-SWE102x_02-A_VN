package sp1adapter;

/**
 * giải thích:
 * Cho phép các đối tượng có giao diện không tương thích cộng tác
 * 
 * Round.fits(RoundPeg)              : lấy đối số là RoundPeg
 * SquarePegAdapter extands RoundPeg : sự kế thừa phần tử cha RoundPeg
 * Round.fits(SquarePegAdapter)      : đa hình vẫn có thể lấy phần tử có kế thừa RoundPeg
 */

public class Demo {
	
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rPeg = new RoundPeg(5);
		
		if(hole.fits(rPeg)) 
			System.out.println("Round peg r5 fits round hole r5.");
		
		SquarePeg smallPeg = new SquarePeg(2);
		SquarePeg largePeg = new SquarePeg(20);
		
		// Adapter solves the problem
		SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
		SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);
		
		if(hole.fits(smallPegAdapter)) 
			System.out.println("Square peg [ "
					+ 2 +" ] fits round hole r5.");
		
		if(!hole.fits(largePegAdapter))
			System.out.println("Square peg [ "
					+ 20 +" ] does not fit into round hole r5.");
        
	}
}
