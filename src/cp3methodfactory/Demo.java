package cp3methodfactory;

/* giải thích mẫu :
 * Cung cấp một giao diện để tạo các đối tượng trong một lớp cha, 
 * nhưng cho phép các lớp con thay đổi loại đối tượng sẽ được tạo.
 * 
 * mẫu gồm yếu tố :
 * 1 Cretor cũng cấp giao diện cho Factory method, khi được gọi sẽ trả về Product
 * 2 ConcreteCretor cũng cấp phương thức để tạo ra product, phương thức sẽ thực thị cụ thể ở giao diện này
 * 3 Product là đồi tượng được tạo ra bởi Factory Method
 * 
 * Creator là:
 * lớp Dialog là lớp trìu tượng chứa phương thức
 * 
 * ConcreteCreator là các lớp sẽ thực thi phương thức để tạo ra Product
 * lớp WindowDialog
 * lớp HtmlDialog
 * 
 * Product là đối được được tạo ra
 * lớp giao diện Button
 * lớp HtmlButton kết thừa Button
 * lớp WindownButton kết thừa Button
 * 
 */
public class Demo {
	
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

    public static void configure() {
        if (!System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    public static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
