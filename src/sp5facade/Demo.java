package sp5facade;

import java.io.File;

/*
 * giải thích :
 * Cung cấp giao diện đơn giản hóa cho thư viện, 
 * khung hoặc bất kỳ tập hợp lớp phức tạp nào khác.
 * ++
 * mẫu này tạo ra các đối tượng phức tạp liên quan đến nhau,
 * nhưng cấu trúc riêng biệt trong chúng khá đơn giản
 * -----------------------------------------------------------
 * khởi tạo các đối tượng :
 * VideoConversionFacade : các đối tượng đơn giản khác được khởi tạo trong nó
 * 
 * giao diện đơn giản :
 * Codec : hầu như không có gì
 * 
 * các tập hợp đơn giản
 * AudioMixer : 
 * VideoFile :
 * CodecFactory :
 * OggCompressionCodec :
 * MPEG4CompressionCodec :
 * 
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
