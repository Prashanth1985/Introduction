import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MicrosoftEdgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver microsoft = new EdgeDriver();
		microsoft.get("https://www.zivame.com");

		// System.setProperty(null, null)
	}

}
//user driver incase need to call using " System.setProperty(null, null)" method