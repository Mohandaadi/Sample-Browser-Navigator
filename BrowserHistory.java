package SimpleBrowserNavigator;
import java.util.Stack;

public class BrowserHistory {
	
	private Stack<WebPage> backHistory;
	private Stack<WebPage> forwardHistory;
	private WebPage currentWebPage;
	
	public BrowserHistory() {
		backHistory = new Stack<>();
		forwardHistory = new Stack<>();
		currentWebPage = null;
	}
	
	public void visitWebPage(String url) {
		if(currentWebPage != null) {
			backHistory.push(currentWebPage);
		}
		
		currentWebPage = new WebPage(url);
		forwardHistory.clear();
		
		System.out.println("Visited: " + url);
	}
	
	public void goBack() {
		if(!backHistory.isEmpty()) {
			forwardHistory.push(currentWebPage);
			currentWebPage = backHistory.pop();
			System.out.println("Back to: "+currentWebPage.getUrl());;
		}else {
			System.out.println("No more back history.");
		}
	}
	public void goForward() {
		if(!forwardHistory.isEmpty()) {
			backHistory.push(currentWebPage);
			currentWebPage = forwardHistory.pop();
			System.out.println("Forward to: "+currentWebPage.getUrl());
		}else {
			System.out.println("No more forward history.");
		}
	}
}
