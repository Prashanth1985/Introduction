import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfoxbrowser_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver gekodriver = new FirefoxDriver();
		gekodriver.get("https://www.zivame.com");
		gekodriver.getTitle();
		System.out.println(gekodriver.getTitle());
		gekodriver.close();
	}

}
