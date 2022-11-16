package marathon_3_TestNG;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTestCase1 extends ParentClassSalesForce {

	@Test(dataProvider="sendData")
	public void chatter(String ques,String ans) throws InterruptedException {
		
		WebElement chatterJsClick = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click()", chatterJsClick);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		WebElement question = driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']"));
		question.sendKeys("Define Testing?");
		String questionValue = question.getAttribute("value");
		WebElement details = driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank')]"));
		details.sendKeys("Software Testing is a method to check whether the actual software product matches expected requirements and to ensure that software product is Defect free.");
		String detailsValue = details.getText();
		//System.out.println(detailsValue);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		String questionfinal = driver.findElement(By.xpath("(//div[contains(@class,'forceChatterFeedBodyQuestionWithoutAnswer')]/span)[1]")).getText();
		String answerfinal = driver.findElement(By.xpath("(//div[@class='feedBodyInner Desktop oneApp']//span)[1]")).getText();
		if((questionValue.equals(questionfinal) && (detailsValue.equals(answerfinal))) ) {
			System.out.println("The question and answer is updated in the forum");
		}else {
			System.out.println("The question is not updated");
		}
		}
	@BeforeTest
	public void input() throws IOException{
		filename="salesforce";
		sheetindex=0;
	}
	
	
			
	
	
	
	
	
	
	

}
