package week4day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittogarhAss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[contains(@class,'table-condensed table-striped')]/tbody/tr"));
		int rsize = rowsize.size();
		System.out.println(rsize);
		List<WebElement> colsize = driver.findElements(By.xpath("//table[contains(@class,'table-condensed table-striped')]/thead/tr/th"));
		int csize = colsize.size();
		System.out.println(csize);
		List<String> securityNames = new ArrayList<String>();
		for(int i=1;i<=rsize;i++) {
			String names = driver.findElement(By.xpath("//table[contains(@class,'table-condensed table-striped')]/tbody/tr["+i+"]/td[3]")).getText();
			securityNames.add(names);
		}
		System.out.println(securityNames);
		Set<String> securityNamesSet= new LinkedHashSet<String>(securityNames);
		System.out.println(securityNamesSet);

	}

}
