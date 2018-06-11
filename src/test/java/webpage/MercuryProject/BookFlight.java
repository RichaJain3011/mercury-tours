package webpage.MercuryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	WebDriver driver;
	By firstname=By.xpath("//input[@name='passFirst0']");
	By lastname=By.xpath("//input[@name='passLast0']");
	By mealpref=By.xpath("//select[@name='pass.0.meal']");
	By creditcard=By.xpath("//select[@name='creditCard']");
	By creditno=By.xpath("//input[@name='creditnumber']");
	By expmth=By.cssSelector("select[name='cc_exp_dt_mn']");
	By expyr=By.cssSelector("select[name='cc_exp_dt_yr']");
	By ccFirstName=By.cssSelector("input[name='cc_frst_name']");
	By ccLastName=By.cssSelector("input[name='cc_last_name']");
	By buyFlights=By.cssSelector("input[name='buyFlights']");
	
	public BookFlight(WebDriver driver){
		this.driver=driver;
	}
	public WebElement firstname(){
		return driver.findElement(firstname);
	}
	public WebElement lastname(){
		return driver.findElement(lastname);
	}
	public void meal(String food){
		Select meal=new Select(driver.findElement(mealpref));
		meal.selectByVisibleText(food);
	}
	public void cardtype(String type){
		Select typ=new Select(driver.findElement(creditcard));
				typ.selectByVisibleText(type);
	}
	public WebElement cardno(){
		return driver.findElement(creditno);
	}
	public void cardexp(String mth,String year){
		Select month=new Select(driver.findElement(expmth));
				month.selectByVisibleText(mth);
				Select yar=new Select(driver.findElement(expyr));
				yar.selectByVisibleText(year);		
	}
	
	public WebElement ccfirstname(){
		return driver.findElement(ccFirstName);
	}
	public WebElement cclastname(){
		return driver.findElement(lastname);
	}
	public WebElement buyflights(){
		return driver.findElement(buyFlights);
	}
	
	
	
}
