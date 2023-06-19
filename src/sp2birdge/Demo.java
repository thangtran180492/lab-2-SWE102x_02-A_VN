package sp2birdge;

/**
 * giải thích :
 * Cho phép bạn chia một lớp lớn hoặc một tập hợp 
 * các lớp có liên quan chặt chẽ thành hai phân cấp 
 * riêng biệt — trừu tượng hóa và triển khai — có thể được phát triển độc lập với nhau
 * ---------------------------------------------------------------------------*
 * cấu trúc                                                                   |
 * Abstraction cung cấp logic điều khiển cấp cao,                             |
 * 			   dựa vào đối tượng triển khai để thực hiện công việc cấp thấp   |
 * Implementation khai báo giao diện chung cho tất cả các triển khai cụ thể   |
 * Concrete Implementations chứa mã dành riêng cho nền tảng                   |
 * Refined Abstractions cung cấp các biến thể của logic điều khiển            |
 * ---------------------------------------------------------------------------*
 * ví dụ code
 * Abstraction là 
 * remote
 * 
 * Implementation là 
 * Device
 * 
 * Concrete Implementations là
 * AdvancedRemote
 * 
 * Refined Abstractions là 
 * TV
 * Radio
 */
public class Demo {
	public static void main(String[] args) {
		testDevice(new Radio());
		testDevice(new Tv());
	}
	
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
	}
}
