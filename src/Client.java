public class Client {
	public static void main(String[] args) {
		String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0";
		String URL        = "http://m.nhaccuatui.com/bai-hat/nhac-tre-moi.html";
		String PATH       = "index.html";
		FileDownloaderProxy proxy = new FileDownloaderProxy();
		proxy.setAgent(USER_AGENT);
		proxy.setURL(URL);
		proxy.setPath(PATH);
		proxy.download();
	}
}
