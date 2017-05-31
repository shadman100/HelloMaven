package com.LearningMaven.LearningMaven.Tests;

import org.testng.annotations.Test;

import com.LearningMaven.LearningMaven.Utilities.basicFunctions;

public class AppTest {
	basicFunctions selenium;
	
	@Test
	public void openWebBrowser(){
		selenium = new basicFunctions();
		selenium.openApp("Chrome", "https://www.google.com/");
		selenium.closeApp();
	}
}
