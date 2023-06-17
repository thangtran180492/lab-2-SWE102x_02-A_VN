package cp2builder;

/*
 * Mục đích của mẫu thiết kế trình builder là tách 
 * việc xây dựng một đối tượng phức tạp khỏi biểu diễn của nó. 
 * 
 * cấu trúc bao gồm
 * builder          khai báo bước xây dựng chung cho mọi loại builder
 * Concrete builder cung câp triển khai khai khác nhau của các bước xây dựng
 * product          là đối tượng được tạo ra không nhất thiết phải cùng thuộc một hệ thống phân cấp
 * Director         xác đinh thứ tự gọi các bước xậy dựng có thể tạo và sửa dụng lại các cấu hình cụ thể của sản phẩm
 * 
 * giải thích mấu
 * builder là giao diện chứa các phương thức nhưng chưa được định nghĩa
 * 
 * Concrete builder gồm
 * CarBuilder        * đều kế thừa builder
 * CarManualBuilder  * 
 * 
 * Product gồm
 * Car     * được tạo ra bởi CarBuilder
 * Manual  * được tạo ra bởi CarManualBuilder
 * 
 * Director * có các phương thức nhận đối số chung là Builder chung và xây dựng chúng
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Director director = new Director();
		
		// Director xây dựng mẫu SportsCar từ CarBuilder
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		
		Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
		
        // Director xây dựng mẫu SportsCar từ manualBuilder
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
