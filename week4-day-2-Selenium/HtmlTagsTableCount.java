package week4day2assignments;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTagsTableCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> colsize = driver.findElements(By.xpath("//div[@class='render']/table/thead/tr/th"));
		int csize = colsize.size();
		System.out.println(csize);
		List<WebElement> rowsize = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		int rsize = rowsize.size();
		System.out.println(rsize);
		Thread.sleep(3000);
		for(int i=1;i<=rsize;i++) { 
			for(int j=1;j<=csize;j++){
				String names = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td["+j+"]")).getText(); 
				System.out.println(names);
			}
			
			}
		 

	}

}
