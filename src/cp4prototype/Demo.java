package cp4prototype;

import java.util.ArrayList;
import java.util.List;
/*
 * giải thích :
 * Cho phép bạn sao chép các đối tượng hiện có 
 * mà không làm cho mã của bạn phụ thuộc vào các lớp của chúng.
 * 
 * lớp trừu tượng
 * Shape : chức năng(equals) của nó sử dụng Object là đối tượng chưa rõ
 * 
 * Circle    : kế thừa Shape
 * Rectangle : kế thừa Shape
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        // gọi hàm cloneAndCompare để sao chép
        cloneAndCompare(shapes, shapesCopy);
    }
    
    /*
     * sao chép shapes sang shapesCopy
     */
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
        	// sao chép và sao gọi hàm từ đối tượng(shape) cha của chúng
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                // equals sẽ so sáng kiểu instanceof so sánh kiểu đối tượng
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
