package sp7proxy;

/* giải thích : Proxy
 * Cho phép bạn cung cấp một vật thay thế hoặc giữ chỗ 
 * cho một đối tượng khác. 
 * Một proxy kiểm soát quyền truy cập vào đối tượng ban đầu, 
 * cho phép bạn thực hiện điều gì đó trước 
 * hoặc sau khi yêu cầu được chuyển đến đối tượng ban đầu.
 * ++
 * hiểu 1 cách khác là thay vì người dùng load toàn bộ nội dung của 1 video
 * thì người dùng sẽ load cũng 1 video nhưng "nhiều lần ngắn"
 * 
 * ThirdPartyYouTubeClass : kế thừa ThirdPartyYouTubeLib
 * Việc triển khai cụ thể trình kết nối dịch vụ.
 * 
 * Ứng dụng sẽ chậm lại nếu có nhiều 
 * yêu cầu được kích hoạt cùng một lúc.
 * ngay cả khi tất cả chúng đều yêu cầu cùng một thông tin
 */
public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
