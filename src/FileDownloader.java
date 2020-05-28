import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {

	private String agent;
	private String url;
	private String path;

	public void setAgent(String agent){
		this.agent = agent;
	}

	public void setURL(String url){
		this.url = url;
	}

	public void setPath(String path){
		this.path = path;
	}

	@Override
	public void download() {
		try{
			URL url = new URL(this.url);
			URLConnection connection = url.openConnection();

			if (this.agent != null)
				connection.setRequestProperty("User-Agent", this.agent);

			BufferedInputStream  bIn  = new BufferedInputStream(connection.getInputStream());
			BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream(new File(path)));
			while (true){
				int data = bIn.read();
				if (data == -1){
					break;
				}
				bOut.write(data);
			}
			bOut.flush();
			bOut.close();
			bIn.close();
		}catch (IOException e){

		}
	}
}
