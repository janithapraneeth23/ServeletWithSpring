package servelet.org;

public class Video {
	private String name = "Janitha";
	private String URL = "Hi";
	
	public Video(String name2, String url2) {
		this.name = name2;
		this.URL = url2;
	}

	public String getName(){
		return this.name;
	}
	
	public String getURL(){
		return this.URL;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void getURL(String URL){
		this.URL = URL;
	}
}
