package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static WebDriver driver;
	public Properties prop=new Properties();
	
	public WebDriver browserIntialize() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\Nikesh\\workspace\\MercuryProject\\src\\main\\java\\resources\\object.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikesh\\Desktop\\QA Tools\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikesh\\Desktop\\QA Tools\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	return driver;
		
	}

}
