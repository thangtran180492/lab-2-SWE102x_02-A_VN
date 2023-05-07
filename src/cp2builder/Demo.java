package cp2builder;

/*
 * giải thích :
 * 
 * Cho phép bạn từng bước xây dựng các đối tượng phức tạp. 
 * Mẫu này cho phép bạn tạo ra các loại và biểu diễn khác nhau 
 * của một đối tượng bằng cách sử dụng cùng một mã xây dựng.
 * 
 * CarManualBuilder : kể thừa Builder
 * CarBuilder       : kể thừa Builder
 * Director có 3 function nhận 3 đối số là Builder
 * 
 * Director mỗi 1 function sẽ xây dựng 1 mẫu Car khác nhau hoặc giống nhau
 * một Director có thể xây dựng các mẫu Car khác nhau hoặc giống nhau tùy vào chức năng của nó
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
