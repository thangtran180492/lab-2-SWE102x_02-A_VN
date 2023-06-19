package sp1adapter;

/**
 * giải thích:
 * adapter là một mẫu thiết kế cấu trúc cho phép 
 * các đối tượng có giao diện không tương thích cộng tác với nhau.
 * 
 * cấu trúc
 * Client là lớp chứa logic nghiệp vụ hiện có của chương trình
 * Client Interface giao thức mà các lớp khác phải tuân theo để có thể giao tiếp
 * Service là một số lớp hữu ích Máy khách không thể sử dụng trực tiếp lớp này vì nó có giao diện không tương thích
 * Adapter bộ điều hợp nhận cuộc gọi và chuyển thành các cuộc gọi đối tượng dịch vụ được bao bọc mà nó có thể hiểu
 * 
 * ví dụ code
 * Client là
 * RoundHole
 * 
 * Client Interface là 
 * Roundpeg
 * 
 * Service là 
 * SquarePeg
 * 
 * Adapter là
 * SquarePedAdapter
 */

public class Demo {
	
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rPeg = new RoundPeg(5);
		
		// RoundHole có thể lấy RoundPeg làm đối số để so sánh
		if(hole.fits(rPeg)) 
			System.out.println("Round peg r5 fits round hole r5.");
		
		// SquarePeg thì không bao hàm bởi RoundHole, RoundHole khồng sử dụng được SquarePeg
		SquarePeg smallPeg = new SquarePeg(2);
		SquarePeg largePeg = new SquarePeg(20);
		
		// Adapter sẽ là bộ chuyển đổi bằng cách 
		// nó kế thừa RoundPeg đồng thời dùng SquarePeg làm tham số
		SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
		SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);
		
		// RoundHole bây giờ sử dụng SquarePegAdapter để làm tham số đã chuyển đổi SquarePeg
		if(hole.fits(smallPegAdapter)) 
			System.out.println("Square peg [ "
					+ 2 +" ] fits round hole r5.");
		
		if(!hole.fits(largePegAdapter))
			System.out.println("Square peg [ "
					+ 20 +" ] does not fit into round hole r5.");
        
	}
}
