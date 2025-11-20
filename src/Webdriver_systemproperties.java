import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_systemproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		//System.setProperty("WebDriver.driver.chromedriver", "/Users/prashanth.trivedi/Downloads");
		 chrome.get("https://www.zivame.com");
		
	}

}
