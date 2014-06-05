package test.nestle;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount   
{  
  private static WebDriver driver;
  public static final String USERNAME = "earlwillis1";
  public String browser_type;
  public  String name="Screenshot/" + timeStamp + "_" + "Successful-Contact-Submit.png";
	public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
	public String browser = System.getProperty("browser");
	static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	 public int stop=1;
  @Test(groups = "newaccount")
	@Parameters("browser")
 
  public void beforeClass(String browser) throws IOException, InterruptedException
  {	   
	  
	  
	  
	  if (browser.equals("firefox")) {
		  driver=browserFirefox();
		  
		}
	  

	 if (browser.equals("chrome")) {
		  driver=browserChrome();
		}
	  
	 if (browser.equals("ie9")) {
		 driver=browserIE9();
		}
	  

	if (browser.equals("iPad")) {
		  driver=browserIpad();
		}
	  
	  if (browser.equals("Android")) {
		  driver=browserAndroid();
		}
	  
	  
	  
	 
	  System.out.println("I'm about to create new account in  " +browser);

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
   	driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
   	

   	   
   	   
   	   
   	 new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl0_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
   	 driver.findElement(By.cssSelector("option[value=\"1E4C6A78-1980-459F-BE01-049AB4CB432C\"]")).click();
   	 new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_lvQuestions_ctrl1_ucSurveyQuestion_ddlAnswers"))).selectByVisibleText("0");
   	 driver.findElement(By.cssSelector("option[value=\"138A6025-F98D-4A64-B36C-4A08DAB4F075\"]")).click();
   	Thread.sleep(4000);
   	 driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSubmit")).click();
   	Thread.sleep(4000);
   		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
       	Thread.sleep(4000);
       	
       	
       	
       	takeScreen();
   		  driver.quit();
   		if (stop==1) {
            return;
        }
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Let me run beforeTest");
  }  
  @Test
  public void f()
  {
       //your test code here
	  System.out.println("I'm out here print f");
  }
 @AfterTest
 public void afterTest()
 {
 }
 @AfterClass
 public void afterClass()
 {
     driver.quit();
 }

 public WebDriver browserFirefox() throws IOException  
 {  
  
	 System.out.println("Let me run Firefox");
	 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 DesiredCapabilities caps = DesiredCapabilities.firefox();
	  caps.setCapability("browser", "FireFox");
	  caps.setCapability("browser_version", "29.0");
	  caps.setCapability("os", "Windows");
	  caps.setCapability("os_version", "7");
	  caps.setCapability("browserstack.debug", "true");

	    driver = new RemoteWebDriver(new URL(URL), caps);
      System.out.println("Let me run Firefox");
      browser_type="firefox";
      System.out.println("Let me see which one get tested" +browser_type);
      System.out.println("Let me see which one get tested" +driver);
      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
      return driver;
   
    
 }  

 public WebDriver browserChrome() throws IOException  
 {  
  
	 browser_type="chrome";
	 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 DesiredCapabilities caps = DesiredCapabilities.firefox();
	 caps.setCapability("browser", "Chrome");
	 caps.setCapability("browser_version", "32.0");
	 caps.setCapability("os", "Windows");
	 caps.setCapability("os_version", "7");
	 caps.setCapability("resolution", "1024x768");

	    driver = new RemoteWebDriver(new URL(URL), caps);
      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
      
      return driver;
   
    
 }  
 
 
 
 public WebDriver browserIpad() throws IOException   
 {  
  

	 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("browserName", "iPad");
	 caps.setCapability("platform", "MAC");
	 caps.setCapability("device", "iPad 3rd (7.0)");

	    driver = new RemoteWebDriver(new URL(URL), caps);
      System.out.println("Let me run Ipad");
      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
      
      return driver;
   
    
 }
 
 public WebDriver browserAndroid() throws IOException  
 {  
  
	
	 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("browserName", "android");
	 caps.setCapability("platform", "ANDROID");
	 caps.setCapability("device", "Samsung Galaxy Note 10.1");

	    driver = new RemoteWebDriver(new URL(URL), caps);
      System.out.println("Let me run Android");
      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
      
      return driver;
   
    
 }
 
 public WebDriver browserIE9() throws IOException 
 {  
  
	
	 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("browser", "IE");
	 caps.setCapability("browser_version", "9.0");
	 caps.setCapability("os", "Windows");
	 caps.setCapability("os_version", "7");
	 caps.setCapability("resolution", "1024x768");

	    driver = new RemoteWebDriver(new URL(URL), caps);
    
      
      return driver;
   
    
 }
 
 public void takeScreen() throws IOException
 {
	 WebDriver augmentedDriver = new Augmenter().augment(driver);
	    System.out.println("Take a screenshot for  " +driver);
	    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	    String myTitle = driver.getTitle();
	     System.out.println("Looking at the page " +myTitle);
	    FileUtils.copyFile(screenshot, new File(name));
 
 }

}  
