package serviceNowAppAssignmentUsingParameters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIncident extends BaseClassForServiceNow {
	
	
	
	@Test(dataProvider="sendData")
	public void createinc(String text) throws InterruptedException {
		
		Shadow shadow = new Shadow(driver);
        shadow.setImplicitWait(10);
        Thread.sleep(3000);
        shadow.findElementByXPath("//div[text()='All']").click();
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//input[@id='filter']").sendKeys(text); 
        shadow.findElementByXPath("//span[text()='Create New']").click();
        driver.switchTo().frame(shadow.findElementByXPath("//iframe[@id='gsft_main']"));
        shadow.findElementByXPath("//button[contains(@id,'caller_id')]").click();
        Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The size of the available windows : "+windowHandles.size());
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		System.out.println( driver.getTitle());
        shadow.findElementByXPath("//a[text()='System Administrator']").click();
        driver.switchTo().window(window.get(0));
        System.out.println( driver.getTitle());
        driver.switchTo().frame(shadow.findElementByXPath("//iframe[@id='gsft_main']"));
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//input[@aria-label='Short description']").sendKeys("Nil");
        shadow.findElementByXPath("//button[text()='Submit']").click();
        shadow.setImplicitWait(5);
        shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
        String id1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
        System.out.println(id1);
        WebElement dropdown = shadow.findElementByXPath("//select[@role='listbox']");
		Select option=new Select(dropdown);
		option.selectByVisibleText("Number");
        shadow.findElementByXPath("//input[@class='form-control']").sendKeys(id1,Keys.ENTER);
        String id2 = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
        if(id1.equals(id2)) {
        	System.out.println("incident is created");
        }else{
        	System.out.println("Incident is not created");
        }
	}
      
        
        @BeforeTest
    	public void input() throws IOException{
    		filename="serivcenow";
    		sheetindex=0;
        }
        
        
        
        
        
        
        
        
        
        
        
        
		
	
}
