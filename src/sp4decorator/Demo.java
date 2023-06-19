package sp4decorator;

/*
 * giải thích : 
 * Cho phép bạn đính kèm các hành vi mới vào các đối tượng 
 * bằng cách đặt các đối tượng này 
 * bên trong các đối tượng bao bọc 
 * đặc biệt chứa các hành vi đó.
 * 
 * cấu trúc mẫu:
 * Component khai báo thành phần chung cho cả trình bao bọc và đối tượng bao bọc
 * Concrete Component là đối tượng được bao bọc, nó xác định hành vi cơ bản có thể được thay đổi
 * Base Decorator có trường để tham chiếu đối tượng được bao bọc 
 * 				  loại của trường được khai báo là giao diện thành phần để nó có thể chứa thành phần cụ thể
 * Concrete Decorators xác định hành vi bổ sung có thể được thêm vào một các linh hoạt
 * 
 * áp dụng mã cụ thể
 * Component là
 * DataSource
 * 
 * Concrete Component là
 * FileDataSource
 * 
 * Base Decorator là
 * DataSourceDecorator
 * 
 * Concrete Decorators là
 * CompressionDecorator
 * EncryptionDecorator
 * 
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        // tạo CompressionDecorator lấy EncryptionDecorator làm đối số
        // tạo EncryptionDecorator lấy FileDataSource làm đối số
        // tạo đối tượng này bao bọc đối tượng khác qua sự kế thừ của mỗi lớp
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
