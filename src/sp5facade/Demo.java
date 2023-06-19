package sp5facade;

import java.io.File;

/*
 * giải thích :
 * Cung cấp giao diện đơn giản hóa cho thư viện, 
 * khung hoặc bất kỳ tập hợp lớp phức tạp nào khác.
 * 
 * cấu trúc:
 * Facade cung cấp khả năng truy cập vào 1 phần chức năng cụ thể của hế thống con
 * Additional Facade có thể được tạo để ngăn chặn một Facade với các tính năng không liên quan làm nó phức tạp
 * Complex Subsystem bao gồm đối tượng khác nhau, nó không nhận thức được sử tồn tại của Facade
 * 					 chúng hoạt động trong hệ thống và làm việc với nhau
 * client sử dụng Facade thay vì gọi trực tiếp các đối tượng hệ thống con(Complex Subsystem)
 * 
 * áp dụng code 
 * Facade là
 * VideoConversionFacade nó có 1 phương thức duy nhất là
 * 						 convertVideo xử lý sự phức tạp của việc định cấu hình đúng lớp
 *  
 * Complex Subsystem là
 * VideoFile
 * AudioMixer
 * BtrateReader
 * codecFactory
 * OggCompressionCodec
 * MPEG4CompressionCodec
 * 
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
