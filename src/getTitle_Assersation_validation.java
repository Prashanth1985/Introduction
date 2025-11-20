import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_Assersation_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.zivame.com");
		chrome.getTitle();
		System.out.println(chrome.getTitle());
		chrome.close();
	}

}
