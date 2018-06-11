package webpage.MercuryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlight {
	WebDriver driver;
	By outflight=By.xpath("//input[@name='outFlight']");
    By text=By.xpath("//td[@class='data_left']");
    By inflight=By.xpath("//input[@name='inFlight']");
    By table2=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]");
    By submit1=By.xpath("//input[@name='reserveFlights']");
    public SelectFlight(WebDriver driver){
    	this.driver=driver;
    }
    public void deprtflight(String flightnamedept,String flightnameretu){
    	int count=driver.findElements(text).size();
    	System.out.println(count);
    	for(int i=0;i<count;i++){
    		String name=driver.findElements(text).get(i).getText();
    		if (name.equals(flightnamedept)){
    			driver.findElements(outflight).get(i).click();
    		}
    		else if (name.equals(flightnameretu)){
        		driver.findElements(inflight).get(i-4).click();
    	}
    }
    }
   
   public WebElement submit1(){
	   return driver.findElement(submit1);
   }
    
}
