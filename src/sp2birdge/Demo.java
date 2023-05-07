package sp2birdge;

/*
 * giải thích :
 * Cho phép bạn chia một lớp lớn hoặc một tập hợp 
 * các lớp có liên quan chặt chẽ thành hai phân cấp 
 * riêng biệt — trừu tượng hóa và triển khai — có thể được phát triển độc lập với nhau
 * 
 * BasicRemote 	  : kế thừa Remote
 * AdvancedRemote : kế thừa BasicRemote
 * 
 * BasicRemote mở rộng từ Remote
 * AdvancedRemote tiếp tục mở rộng hơn nữa từ BasicRemote
 * 
 * tạo ra phân cấp:
 * AdvancedRemote -> BasicRemote -> Remote
 * AdvancedRemote kế thừa BasicRemote thì nó cũng kế thừa Remote
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
