package sp4decorator;

/*
 * giải thích : 
 * Cho phép bạn đính kèm các hành vi mới vào các đối tượng 
 * bằng cách đặt các đối tượng này 
 * bên trong các đối tượng bao bọc 
 * đặc biệt chứa các hành vi đó.
 * 
 * lớp giao diên
 * DataSource
 * 
 * DataSourceDecorator  : kế thừa DataSource
 * FileDataSource       : kế thừa DataSource
 * 
 * CompressionDecorator : kế thừa DataSourceDecorator
 * EncryptionDecorator  : kế thừa DataSourceDecorator
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
