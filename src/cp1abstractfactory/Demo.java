package cp1abstractfactory;

/**
 * giải thích mẫu:
 * Cho phép bạn tạo các họ đối tượng liên quan mà không chỉ định các lớp cụ thể của chúng.
 * 
 * cấu trúc
 * AbstractFactory: (interface) định nghĩa thao tác khởi tạo các sản phẩm(product)
 * ConcreteFactory: thực thi giao tiếp AbstracFactory để tạo ra đối tượng cụ thể
 * AbstractProduct: định nghĩa một lớp ảo cho một đối tượng cụ thể
 * Product: kế thừa từ lớp "sản phẩm" ảo AbstractProduct các lớp định nghĩa từ đối tượng cụ thể
 * Client: sử dụng AbstractFactory và AbstractProduct trong hệ thống
 * 
 * chi tiết thực hiện mẫu:
 * AbstractFactory định nghĩa là
 * GUIFactory
 * 
 * ConcreteFactory định nghĩa là
 * MacOsFactory
 * WindowsFactory
 * 
 * AbstractProduct định nghĩa là
 * Button
 * CheckBox
 * 
 * Product định nghĩa là
 * MacOSButton, MacCheckBox
 * WindowsButton, WindowsCheckBox
 * 
 * Client định nghĩa là 
 * Apllicattion
 */

public class Demo {
	
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
	}
	public static void main(String[] args) {
		Application app = configureApplication();
        app.paint();
	}
}
