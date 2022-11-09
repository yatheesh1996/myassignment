package serviceNowAppAssignmentUsingParameters;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident extends BaseClassForServiceNow {

	
	@Test
	public void updateinc() {
		
		Shadow shadow = new Shadow(driver);
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//div[text()='All']").click();
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//input[@id='filter']").sendKeys("incident"); 
        shadow.findElementByXPath("//span[text()='All']").click();
        driver.switchTo().frame(shadow.findElementByXPath("//iframe[@id='gsft_main']"));
        shadow.setImplicitWait(5);
        shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
        String statetext = shadow.findElementByXPath("//table/tbody/tr[1]/td[8]").getText();
		System.out.println(statetext);
		String prioritytext = shadow.findElementByXPath("//table/tbody/tr[1]/td[7]").getText();
		System.out.println(prioritytext);
		String idName = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
		System.out.println(idName);
        shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").click();
        WebElement state = shadow.findElementByXPath("//select[@id='incident.state']");
		Select option1=new Select(state);
		option1.selectByVisibleText("In Progress");
		WebElement urgency = shadow.findElementByXPath("//select[@id='incident.urgency']");
		Select option2=new Select(urgency);
		option2.selectByVisibleText("1 - High");
		shadow.findElementByXPath("//textarea[contains(@id,'work_notes-textarea')]").sendKeys("nil");
		shadow.findElementByXPath("//button[text()='Update']").click();
		shadow.findElementByXPath("//i[@aria-label='Updated column options']").click();
        shadow.findElementByXPath("//div[text()='Sort (z to a)']").click();
		WebElement dropdown = shadow.findElementByXPath("//select[@role='listbox']");
		Select option=new Select(dropdown);
		option.selectByVisibleText("Number");
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(idName,Keys.ENTER);
		 shadow.setImplicitWait(5);
		String statetext1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[8]").getText();
		System.out.println(statetext1);
		String prioritytext1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[7]").getText();
		System.out.println(prioritytext1);
		String idName1 = shadow.findElementByXPath("//table/tbody/tr[1]/td[3]").getText();
		System.out.println(idName1);
		if((statetext.equals(statetext1)) && (prioritytext.equals(prioritytext1)) && (idName.equals(idName1))){
			System.out.println("The incident is not updated");
		}else {
			System.out.println("The incident is updated");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
