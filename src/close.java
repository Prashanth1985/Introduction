import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.zivame.com");
		chrome.getTitle();
		System.out.println(chrome.getTitle());
		chrome.close();
		
		//The close method will close the current scope window i.e working url or current URL 
		//the quit method will close all the window associated with that window eg from one tab it redirected to another url ,it will close all url 
		
		
	}

}
