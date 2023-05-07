package sp3composite;

/* giải thích :
 * Cho phép bạn kết hợp các đối tượng thành các cấu trúc dạng cây 
 * và sau đó làm việc với các cấu trúc này 
 * như thể chúng là các đối tượng riêng lẻ.
 *          [1]
 *         /  \
 *        []  [2]----.
 *      /  |   |  \   \
 *    []  []  [3] [4] [5]
 *   / |   |   | \
 * []  [] []   [] []
 * 
 * lớp giao diện:
 * 1 Shape
 * 
 * lớp đơn lẻ :
 * 2 BaseShape     : kế thừa Shape
 * 3 Cirlce        : kế thừa BaseShape
 * 4 CompoundShape : kế thừa BaseShape
 * 5 Rectangle     : kế thừa BaseShape
 */
import java.awt.*;

public class Demo {
	public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
