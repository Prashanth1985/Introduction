import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acceessurl_geturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.zivame.com");
		chrome.close();
		
		
	}

}
