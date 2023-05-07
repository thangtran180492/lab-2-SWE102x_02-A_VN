package cp1abstractfactory;

/**
 * giải thích mẫu:
 * Cho phép bạn tạo các họ đối tượng liên quan mà không chỉ định các lớp cụ thể của chúng.
 * 
 * MacOS và Windows đều kế thừa Button, CheckBox, GUIFactory
 * 
 * Application có thể sử dụng được cả MacOS và Windows làm đối số
 */

public class Demo {
	/**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
	
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
