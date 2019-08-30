package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\10WD\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\10WD\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://rediff.com");
		driver1.manage().window().maximize();
		driver1.close();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\10WD\\Jars\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.get("http://facebook.com");
		driver2.manage().window().maximize();
		
		//These are all changes
		// Kindly proceed
		
		//sdfhsudfhsdilfsdf
		//sdfsdfsdf
		

	}

}
