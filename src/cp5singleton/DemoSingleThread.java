package cp5singleton;

/*
 * giải thích :
 * Cho phép bạn đảm bảo rằng một lớp chỉ có một phiên bản, 
 * đồng thời cung cấp một điểm truy cập toàn cầu cho phiên bản này.
 * ----------------------------------------------------------------
 *  sử dụng với luồng
 *  ---------------------------------------------------------------
 *  class Singleton được đặt là final
 *  tức là class này khởi tạo 1 giá trị 
 *  và giá trị này sẽ không thể cập nhật hoặc thay đổi lại được.
 *  ----------------------------------------------------------------
 *  nếu tạo 1 đối Singleton tượng giống nó
 *  thì sẽ chỉ truy cập 1 phiên bản duy nhất
 */

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
