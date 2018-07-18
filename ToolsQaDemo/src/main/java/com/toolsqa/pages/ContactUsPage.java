package com.toolsqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.util.SeleniumTestBase;

import junit.framework.Assert;

public class ContactUsPage  extends SeleniumTestBase {
	
	//Page Factory
		@FindBy(xpath="//label[contains(text(),'Name')]")
		WebElement contactName;
		
		@FindBy(xpath="//label[contains(text(),'E-mail')]")
		WebElement contactEmail;
		
		@FindBy(xpath="//label[contains(text(),'Message')]")
		WebElement contactMessage;
		
		@FindBy(xpath="//span[contains(text(),'Send message')]")
		WebElement sendMessage;
		
		@FindBy(xpath="//div[text()='Feedback has been sent to the administrator']")
		WebElement feedbackMessage;
		
		@FindBy(xpath="//span[@class='form-name']//div[contains(text(),'This field is required')]")
		WebElement formNameErrorContent;
		
		@FindBy(xpath="//span[@class='form-mail']//div[contains(text(),'This field is required')]")
		WebElement formMailErrorContent;
		
		@FindBy(xpath="//span[@class='form-message']//div[contains(text(),'This field is required')]")
		WebElement formMessageErrorContent;
		
		//Initializing page objects
		public ContactUsPage(){
			PageFactory.initElements(driver, this);
		}
		
		// Enter the mandatory field values in contact us form and click on send message
		public void ContactInfo(String name, String email, String message, String feedback)
		{
			//Java script executor is used to scroll down the web page 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(200,500)");
			//Enter the contact information and send message
			// Actions class is used as elements in the form are not getting the focus
			Actions action = new Actions(driver);
			action.moveToElement(contactName);
			action.click();
			action.sendKeys(name);
			action.build().perform();
			action.moveToElement(contactEmail);
			action.click();
			action.sendKeys(email);
			action.build().perform();
			action.moveToElement(contactMessage);
			action.click();
			action.sendKeys(message);
			action.build().perform();
			action.moveToElement(sendMessage);
			action.click();
			action.build().perform();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			feedbackMessage= wait.until(ExpectedConditions.visibilityOf(feedbackMessage));
			Assert.assertEquals(feedbackMessage.getText(),feedback);
		}
		//Validate all the required fields in contact us page and check for validations
		public void validateContactUsPage(String errorMessage)
		{
			//Java script executor is used to scroll down the web page 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(200,500)");
			Actions action = new Actions(driver);
			action.moveToElement(sendMessage);
			action.click();
			action.build().perform();
			WebDriverWait wait=new WebDriverWait(driver, 10);
			formNameErrorContent= wait.until(ExpectedConditions.visibilityOf(formNameErrorContent));
			Assert.assertTrue(formNameErrorContent.getText().contains(errorMessage));
			Assert.assertTrue(formMailErrorContent.getText().contains(errorMessage));
			Assert.assertTrue(formMessageErrorContent.getText().contains(errorMessage));
		}
 }
