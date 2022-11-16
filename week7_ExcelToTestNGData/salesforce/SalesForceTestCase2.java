package marathon_3_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTestCase2 extends ParentClassSalesForce {

	@Test(dataProvider="sendData")
	public void opporunities(String name, String amount) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@class,'filterIcon slds-button')]")).click();
		driver.findElement(By.xpath("//a[text()='All Opportunities']")).click();
		driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Needs Analysis']/ancestor::lightning-base-combobox-item")).click();
		driver.findElement(By.xpath("//label[text()='Primary Campaign Source']/following::input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='slds-listbox__item'])[2]")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='Next Month']/parent::button")).click();
		driver.findElement(By.xpath("//span[text()='20']/parent::td")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		String alert = driver.findElement(By.xpath("//div[@role='alertdialog']//span")).getText();
		if(alert.contains("success")) {
			System.out.println("Oppurunity is saved");
		}else {
			System.out.println("Oppurunity is not saved");
		}
	}
	@BeforeTest
	public void input() throws IOException{
		filename="salesforce";
		sheetindex=1;
		
	}
		
		
		
		
		/*
		 * act.moveToElement(dateColumn);
		 * act.click(driver.findElement(By.xpath("//span[text()='Next Month']")));
		 * act.click(driver.findElement(By.xpath("//span[text()='20']")));
		 */
		
		


}
