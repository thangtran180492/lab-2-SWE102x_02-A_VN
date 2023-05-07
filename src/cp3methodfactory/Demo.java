package cp3methodfactory;

/* giải thích mẫu :
 * Cung cấp một giao diện để tạo các đối tượng trong một lớp cha, 
 * nhưng cho phép các lớp con thay đổi loại đối tượng sẽ được tạo.
 * 
 * WindowDialog : kế thừa Dialog
 * HtmlDialog   : kế thừa Dialog
 * 
 * lớp Dialog tạo ra function createButton nhưng
 * việc thay đổi hành động của createButton nằm ở lớp WindowDialog và HtmlDialog
 * 
 */
public class Demo {
	
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    public static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
