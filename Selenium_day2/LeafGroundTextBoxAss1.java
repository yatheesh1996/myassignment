package week1day2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTextBoxAss1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Type your name
		driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Yatheeshwar");
		//Append Country to this City.
		driver.findElement(By.xpath("//input[contains(@class,'city ui-state-filled')]")).sendKeys(", India");
		//Verify if text box is disabled
		System.out.println(driver.findElement(By.xpath("//input[contains(@class,'ui-state-disabled')]")).isEnabled());
		//Clear the typed text.
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		//Retrieve the typed text.
		System.out.println(driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("yatheeshwar@gmail.com",Keys.TAB);
		//Type about yourself
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("My name is Saurabh Dilip Tilekar.");
		//Text Editor
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-size ql-picker']/span)[1]")).click();
		driver.findElement(By.xpath("(//span[@id='ql-picker-options-1']/span)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[1]")).sendKeys("Steps to login:",Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ql-size ql-picker']/span)[1]")).click();
		driver.findElement(By.xpath("(//span[@id='ql-picker-options-1']/span)[2]")).click();
		driver.findElement(By.xpath("//button[@value='ordered']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[1]")).sendKeys("load url",Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[1]")).sendKeys("enter username and pwd",Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[1]")).sendKeys("click login",Keys.ENTER);
		driver.findElement(By.xpath("//button[@value='ordered']")).click();
		Thread.sleep(2000);
		//Just Press Enter and confirm error message*
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String errorMsg = driver.findElement(By.xpath("//div[contains(@class,'ui-message-error')]//span[text()='Age is mandatory']")).getText();
		System.out.println(errorMsg);
		if(errorMsg.contains("mandatory")){
			System.out.println("it throws the age is mandatroy error successfully");
		}else {
			System.out.println("unsuccessful");
		}
		//Click and Confirm Label Position Changes
		Point location1=driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		Point location2=driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		if(location1!=location2) {
			System.out.println("Label is move upto the textbox ");
		}else {
			System.out.println("unchanged");
		}
		//Type your name and choose the third option
		driver.findElement(By.xpath("//input[contains(@id,'auto-complete')]")).sendKeys("yatheesh");
		driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete-items')]/li[3]")).click();
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath(" //span[contains(@class,'ui-trigger-calendar')]/input")).sendKeys("13/03/1995",Keys.TAB);
		String dob=driver.findElement(By.xpath(" //span[contains(@class,'ui-trigger-calendar')]/input")).getText();
		if(dob.contentEquals(dob)) {
			System.out.println("the given Date of birth is matched");
		}else {
			System.out.println("not a match");
		}
		//Type number and spin to confirm value changed
		WebElement givenData = driver.findElement(By.xpath("//input[contains(@class,'ui-spinner-input')]"));
		givenData.sendKeys("10",Keys.TAB);
		driver.findElement(By.xpath("//a[contains(@class,'ui-spinner-down')]")).click();
		//Type random number (1-100) and confirm slider moves correctly
		Point startLoc= driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]")).getLocation();
		driver.findElement(By.xpath("//input[contains(@name,'slider')]")).sendKeys("10");
		Point endLoc= driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]")).getLocation();
		if(startLoc!=endLoc) {
			System.out.println("slider is moved to the range given");
		}else {
			System.out.println("slider is not moved");
		}
		//Click and Confirm Keyboard appears
		WebElement keysInput = driver.findElement(By.xpath("//input[contains(@class,'ui-keyboard-input')]")); 
		keysInput.click();
		System.out.println(keysInput.isEnabled());
		keysInput.sendKeys(Keys.TAB);
		//Custom Toolbar
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-size ql-picker']/span)[3]")).click();
		driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Yatheeshwar");
		
		
		
		
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
