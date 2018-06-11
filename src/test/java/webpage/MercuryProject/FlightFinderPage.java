package webpage.MercuryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {
	public WebDriver driver;
	By radio=By.xpath("//input[@value='roundtrip']");
	By passenger=By.xpath("//select[@name='passCount']");
	By departing=By.xpath("//select[@name='fromPort']");
	By onmonth=By.xpath("//select[@name='fromMonth']");
	By onday=By.xpath("//select[@name='fromDay']");
	By toport=By.xpath("//select[@name='toPort']");
	By returnmth=By.xpath("//select[@name='toMonth']");
	By returnday=By.xpath("//select[@name='toDay']");
	By passclass=By.xpath("//input[@value='Business']");
	By airprefer=By.xpath("//select[@name='airline']");
	By continu=By.xpath("//input[@name='findFlights']");
	public FlightFinderPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement triptype(){
	if(driver.findElement(radio).isSelected())
	{
		driver.findElement(radio);
	}
	else
	{
	   driver.findElement(radio).click();
	}
	return driver.findElement(radio);
	}
	
	public void passenger(String x){
		
		Select nopassen=new Select(driver.findElement(passenger));
		nopassen.selectByVisibleText(x);
		}
	public void departing(String place){
		
		Select depart=new Select(driver.findElement(departing));
		depart.selectByVisibleText(place);
	}
	
	public void onmonth(String mm){
		Select depart=new Select(driver.findElement(onmonth));
		depart.selectByVisibleText(mm);
		
	}
	
	public void onday(String dd){
		Select depart=new Select(driver.findElement(onday));
		depart.selectByVisibleText(dd);
		
	}
	public void toport(String destntion){
		Select depart=new Select(driver.findElement(toport));
		depart.selectByVisibleText(destntion);
			}
	public void returnmonth(String rmm){
		Select depart=new Select(driver.findElement(returnmth));
		depart.selectByVisibleText(rmm);
			}
	public void returnday(String rdd){
		Select depart=new Select(driver.findElement(returnday));
		depart.selectByVisibleText(rdd);
			}
	public WebElement passclass(){
		if(driver.findElement(passclass).isSelected())
		{
			driver.findElement(passclass);
		}
		else
		{
		   driver.findElement(passclass).click();
		}
		return driver.findElement(passclass);
		}
	public void airprefer(String flightname){
		Select depart=new Select(driver.findElement(airprefer));
		depart.selectByVisibleText(flightname);
			}
	public WebElement submit(){
		return driver.findElement(continu);
	}
	
	
	
	}


