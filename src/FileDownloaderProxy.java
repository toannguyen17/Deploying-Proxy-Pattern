public class FileDownloaderProxy implements Downloader {
	private String USER_AGENT;
	private String url;
	private String path;

	public FileDownloaderProxy(){
	}

	public void setAgent(String agent){
		USER_AGENT = agent;
	}

	public void setURL(String url){
		this.url = url;
	}

	public void setPath(String path){
		this.path = path;
	}

	@Override
	public void download() {
		FileDownloader  fileDownloader = new FileDownloader();

		if (USER_AGENT != null)
			fileDownloader.setAgent(USER_AGENT);

		fileDownloader.setURL(url);
		fileDownloader.setPath(path);
		fileDownloader.download();

	}
}
