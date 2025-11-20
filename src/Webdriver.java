import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver chrome = new ChromeDriver();
		WebDriver firefox = new FirefoxDriver();
		WebDriver safari = new SafariDriver();
		WebDriver EdgeDriver = new EdgeDriver();
		
	   chrome.get("https://www.zivame.com");
	   
	 /* Result : as we invoked chrome browser,the new browser page opened with empty URL ,because we haven't invoked chrome browser 
	    to resolve we have two different method
	    METHOD 1 : use respective brower driver using properties 
	    METHOD 2 : use selenium manager which itself download the driver of respective browser and open browser 
		
		*/
	}

}
