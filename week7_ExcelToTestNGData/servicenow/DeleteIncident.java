package serviceNowAppAssignmentUsingParameters;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClassForServiceNow {

	
	@Test(dataProvider="sendData")
	public void deleteinc(String text) throws InterruptedException {
		
		Shadow shadow = new Shadow(driver);
        shadow.setImplicitWait(10);
        Thread.sleep(3000);
        shadow.findElementByXPath("//div[text()='All']").click();
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//input[@id='filter']").sendKeys(text); 
        shadow.findElementByXPath("//span[text()='All']").click();
        driver.switchTo().frame(shadow.findElementByXPath("//iframe[@id='gsft_main']"));
        shadow.setImplicitWait(5);
        shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
        String idName = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
		System.out.println(idName);
        shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").click();
        shadow.findElementByXPath("//button[text()='Delete']").click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div/button[text()='Delete'])[2]")).click();
        shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
        WebElement dropdown = shadow.findElementByXPath("//select[@role='listbox']");
		Select option=new Select(dropdown);
		option.selectByVisibleText("Number");
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(idName,Keys.ENTER);
		String result = shadow.findElementByXPath("//div[@class='list2_empty-state-list']").getText();
		if(result.contains("No records")) {
			System.out.println("The incident is deleted");
		}else {
			System.out.println("The incident is not deleted");
		}
	}
	
	
	@BeforeTest
	public void input() throws IOException{
		filename="serivcenow";
		sheetindex=0;
	}
        
        
        
        
        
        
        
        
        
        
        

	

}
