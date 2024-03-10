package SimpleBrowserNavigator;

public class WebPage {
	
	private String url;
	
	public WebPage(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	
	@Override
	public String toString() {
		return "WebPage{"+
				"url='"+ url + '\'' +
				'}';
	}
}
