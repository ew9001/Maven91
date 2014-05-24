package test.nestle.ContactForm;

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


public class Android {

	static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	Sheet s; 	
	WebDriver driver;
	public static final String USERNAME = "earlwillis1";
	public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
    public String baseUrl = "http://stage.coffee-mate.com";
	String folder = "";
	String name="Android/" + timeStamp + "_" + "Successful-Contact-Submit-Android-1.png";
	String local=(new java.io.File("").getAbsolutePath());
	String data="" + local + "/" + "infoqa.xls";	
	String myTitle;
    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
    
    @Test(groups = {"Android"})
	@Parameters({"param"})
	 public void testMe(String param) throws Exception {
		String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Note 10.1");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


		    driver.get("http://trihondas.com");
		    driver.get(baseUrl + "/Contact-Us.aspx");
		    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlReason"))).selectByVisibleText("General Inquiry or Question");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys("PubmoTestFirst");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).sendKeys("PubmoTestLast");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("xxxxx@yahoo.com");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress1")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress1")).sendKeys("75 W. 10th Street");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress2")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress2")).sendKeys("Apt. 3B");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity")).sendKeys("New York");
		    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlStates"))).selectByVisibleText("New York");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtZip")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtZip")).sendKeys("10003");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone1")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone1")).sendKeys("212");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone2")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone2")).sendKeys("222");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone3")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHomePhone3")).sendKeys("2222");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone1")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone1")).sendKeys("212");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone2")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone2")).sendKeys("456");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone3")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWorkPhone3")).sendKeys("7890");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtComments")).clear();
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtComments")).sendKeys("Please do not contact this test account.");
		    driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnSubmit")).click();
		    for (int second = 0;; second++) {
		    	if (second >= 60) fail("timeout");
		    	try { if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thanks for taking the time to get in touch with us[\\s\\S]*$")) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }
		    WebDriver augmentedDriver = new Augmenter().augment(driver);
		    System.out.println("Take a screenshot for  " +"Android");
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
	  driver.quit(); 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit(); 
	
  }

}
