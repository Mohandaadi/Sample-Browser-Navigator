package SimpleBrowserNavigator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory browserHistory = new BrowserHistory();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nBrowser Menu:");
			System.out.println("1. Visit Web Page");
			System.out.println("2. Go Back");
			System.out.println("3. Go Forward");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter URL to visit: ");
				String url = scanner.nextLine();
				browserHistory.visitWebPage(url);
				break;
			case 2:
				browserHistory.goBack();
                break;
			case 3:
                browserHistory.goForward();
                break;
            case 4:
                System.out.println("Exiting the Browser. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

}
