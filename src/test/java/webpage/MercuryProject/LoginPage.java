package webpage.MercuryProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Baseclass;

public class LoginPage extends Baseclass {
	@BeforeTest
	public void browserinitialize() throws IOException{
		driver=browserIntialize();
		driver.get(prop.getProperty("url"));
		WebElement usernme=driver.findElement(By.xpath("//input[@name='userName']"));
		usernme.sendKeys(prop.getProperty("username"));
		WebElement passwrd=driver.findElement(By.xpath("//input[@name='password']"));
		passwrd.sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
	}
	@Test(dataProvider="test1")
	public void flightreservation(String x,String place,String mm,String dd,String destntion,String rmm,String rdd,String flightname){
		FlightFinderPage ffp=new FlightFinderPage( driver);
		
			ffp.triptype();
			ffp.passenger(x);
			ffp.departing(place);
			ffp.onmonth(mm);
			ffp.onday(dd);
			ffp.toport(destntion);
			ffp.returnmonth(rmm);
			ffp.returnday(rdd);
			ffp.passclass();
			ffp.airprefer(flightname);
			ffp.submit().click();
		
	
	}
	@Test(dependsOnMethods={"flightreservation"},dataProvider="test2")
	public void selectflight(String flightnamedept,String flightnameretu){
		SelectFlight sf=new SelectFlight(driver);
		sf.deprtflight(flightnamedept,flightnameretu);		
		sf.submit1().click();
		
	}
	@Test(dependsOnMethods={"selectflight"},dataProvider="test3")
	public void finalbooking(String firstnme, String lastnme,String food,String type,String cardnumber,String mth,String year,String ccfirstname,String cclastname){
		BookFlight bf=new BookFlight(driver);
		bf.firstname().sendKeys(firstnme);
		bf.lastname().sendKeys(lastnme);
		bf.meal(food);
		bf.cardtype(type);
		bf.cardno().sendKeys(cardnumber);
		bf.cardexp(mth, year);
		bf.ccfirstname().sendKeys(ccfirstname);
		bf.cclastname().sendKeys(cclastname);
		bf.buyflights().click();
	}
	@DataProvider(name="test1")
	public Object[][] getdata(){
		Object[][]data=new Object[1][8];
		data[0][0]="2";
		data[0][1]="London";
		data[0][2]="June";
		data[0][3]="10";
		data[0][4]="New York";
		data[0][5]="July";
		data[0][6]="11";
		data[0][7]="Unified Airlines";
		
		
		return data;
	}
@DataProvider(name="test2")
public Object[][] getflightdata(){
	Object[][] data1=new Object[1][2];
	data1[0][0]="Unified Airlines 363";
	data1[0][1]="Pangea Airlines 632";
	return data1;
	
}
@DataProvider(name="test3")
public Object[][] bookflightdata(){
	Object[][]data2=new Object[1][9];
	data2 [0][0]="brian";
	data2 [0][1]="johnson";
	data2 [0][2]="Low Calorie";
	data2 [0][3]="Discover";
	data2 [0][4]="1223-4335-1234";
	data2 [0][5]="09";
	data2 [0][6]="2010";
	data2 [0][7]="brian";
	data2 [0][8]="johnson";
	return data2;
	
	
	
	
	
}
}
