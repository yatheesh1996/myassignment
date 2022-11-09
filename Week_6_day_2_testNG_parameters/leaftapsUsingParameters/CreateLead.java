package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	
	@Test(dataProvider="sendData")
	public void runCreateLead(String cName,String fName, String lName) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
}
	
	@DataProvider
	public String[][] sendData(){
		String[][] data = new String[2][3];
		data[0][0] = "abc";
		data[0][1] = "yatheesh";
		data[0][2] = "S";
		
		
		data[1][0] = "def";
		data[1][1] = "sekar";
		data[1][2] = "A";
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}






