package test.nestle.CreateNewAccount;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;


public class Firefox {

	static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	Sheet s; 	
	WebDriver driver;
	public static final String USERNAME = "earlwillis1";
	public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
    public String baseUrl = "http://stage.coffee-mate.com";
	String folder = "";
	String browser_type;
	String name="" +browser_type +" / " + timeStamp + "_" + "Successful-Contact-Submit-" + browser_type+ "-1.png";
	String local=(new java.io.File("").getAbsolutePath());
	String data="" + local + "/" + "infoqa.xls";	
	String myTitle;
    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
   
  
    @Test(groups = {"Firefox"})
    @Parameters({"param"})
    public void browserFirefox(String param) throws Exception
    {
    	String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		  caps.setCapability("browser", "FireFox");
		  caps.setCapability("browser_version", "22.0");
		  caps.setCapability("os", "Windows");
		  caps.setCapability("os_version", "7");
		  caps.setCapability("browserstack.debug", "true");
		  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		  browser_type = "Firefox";
		  Thread.sleep(1000);
	}
    @Test(groups = {"Chrome"})
    @Parameters({"param"})
    public void browserChrome(String param) throws Exception
    {
    	String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
	
		 caps.setCapability("browser", "Chrome");
		 caps.setCapability("browser_version", "32.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");

		  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		  browser_type = "Chrome";
	}
    
    
    
 
    
    
    @Test
	//@Parameters({"param"})
	 public void testMe(String param) throws Exception {
    	
    	  

		    driver.get("http://trihondas.com");
		    driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtFirstName")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtFirstName")).sendKeys("PubmoTestFirst");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtLastName")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtLastName")).sendKeys("PubmoTestLast");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtPassword")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtPassword")).sendKeys("Password123");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtConfirmPassword")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtConfirmPassword")).sendKeys("Password123");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress")).sendKeys("1000 BroadwAY LANE");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress2")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtAddress2")).sendKeys("Suite 3V");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtCity")).sendKeys("New York");
		    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_ddlStates"))).selectByVisibleText("Florida");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtZipCode")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_txtZipCode")).sendKeys("10003");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_chkEmailCommunication")).click();
		   //  driver.findElement(By.name("flavorTheme")).click();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucRegisterUser_btnRegister")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile, new File("Firefox/" + timeStamp + "/" + "Successful-Registration-1.png"));
			   
			   
			   
			 new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl0_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
			 driver.findElement(By.cssSelector("option[value=\"1E4C6A78-1980-459F-BE01-049AB4CB432C\"]")).click();
			 new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl1_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
			 driver.findElement(By.cssSelector("option[value=\"138A6025-F98D-4A64-B36C-4A08DAB4F075\"]")).click();
			 driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSubmit")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	Thread.sleep(4000);
		    	
		    WebDriver augmentedDriver = new Augmenter().augment(driver);
		    System.out.println("Take a screenshot for  " + browser_type);
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		    myTitle = driver.getTitle();
		    FileUtils.copyFile(screenshot, new File(name));
	    	//Reporter.log("<a href='"+ local+"/" + name + "'> <img src='"+ local+"/"+ name + " ' height='100' width='100'/>" + "<a href='"+ urlname+"'>'"+ urlname+"'</a> " + " </a>");
	    	Reporter.log("<a href='"+ safe+"/" + name + "'> <img src='"+ safe+"/"+ name + " ' height='100' width='100'/>" + "<a href='"+  myTitle+"'>'"+  myTitle+"'</a> " + " </a>");
	    	 driver.quit();   
		

  }
  @AfterMethod
  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private void fail(String verificationErrorString) {
	// TODO Auto-generated method stub
	
}
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

  @BeforeClass
  public void beforeClass() {


  }
  @AfterClass
  public void afterClass() {
  }

  @AfterTest
  public void afterTest() {
	
  }

}
