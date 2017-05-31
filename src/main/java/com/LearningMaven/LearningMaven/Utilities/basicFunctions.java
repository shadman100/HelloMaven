package com.LearningMaven.LearningMaven.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicFunctions {
static WebDriver driver = null;
	
	public void openApp(String bName, String url){
		
		if(bName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	
	public void enterData(String oName, String value){
		driver.findElement(By.xpath(oName)).sendKeys(value);
	}
	
	public void click(String oName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(oName)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean validate(String oName, String expectedResult){
		boolean rtype = false;
		String actualResult = driver.findElement(By.xpath(oName)).getText();
		
		if(actualResult.contains(expectedResult)){
			rtype = true;
		}	
		
		return rtype;
	}
	
	public void closeApp(){
		driver.quit();
	}


}
