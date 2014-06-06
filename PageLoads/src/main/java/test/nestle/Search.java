package test.nestle;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Search {

	private static WebDriver driver;
	  public static final String USERNAME = "earlwillis1";
	  public String browser_type;
	  public String baseUrl = "http://stage.coffee-mate.com";
		public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "infoqa.xls";	
		String myTitle;
	    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
	  @Test(groups = {"search"})
		@Parameters({"browser"})
	  @BeforeClass
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
		  
		  if (browser.equals("safari")) {
			  driver=browserSafari();
			}
		  
		 if (browser.equals("Android")) {
			  driver=browserAndroid();
			}
		  
		
		 String name=""+ browser+"/Search/" + timeStamp + "_" + "Search-1.png";
		 System.out.println("This script will test the Seach Functionality. Asssertions are made on the Search Results for the first 5 pages of results");

		    driver.get(baseUrl + "/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			   driver.findElement(By.id("ctl00_ucThemeSearchMain_txtSiteSearch")).clear();
			    driver.findElement(By.id("ctl00_ucThemeSearchMain_txtSiteSearch")).sendKeys("coffee");
			    driver.findElement(By.id("ctl00_ucThemeSearchMain_btnSiteSearch")).click();
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("Page 1 of 148".equals(driver.findElement(By.cssSelector("div.restop > p")).getText())) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    Assert.assertEquals("Page 1 of 148", driver.findElement(By.cssSelector("div.restop > p")).getText());
			    driver.findElement(By.linkText("Next >>")).click();
			    System.out.println("First Page of Results loaded successfully");
			    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  	FileUtils.copyFile(scrFile, new File("Screenshots/" + timeStamp + "/" + ".png"));

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("Page 2 of 148".equals(driver.findElement(By.cssSelector("div.restop > p")).getText())) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    Assert.assertEquals("Page 2 of 148", driver.findElement(By.cssSelector("div.restop > p")).getText());
			    driver.findElement(By.linkText("Next >>")).click();
			    System.out.println("Second Page of Results loaded successfully");
			    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  	FileUtils.copyFile(scrFile1, new File("Screenshots/" + timeStamp + "/" + ".png"));
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("Page 3 of 148".equals(driver.findElement(By.cssSelector("div.restop > p")).getText())) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    Assert.assertEquals("Page 3 of 148", driver.findElement(By.cssSelector("div.restop > p")).getText());
			    driver.findElement(By.linkText("Next >>")).click();
			    System.out.println("Third Page of Results loaded successfully");
			    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  	FileUtils.copyFile(scrFile2, new File("Screenshots/" + timeStamp + "/" + ".png"));
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("Page 4 of 148".equals(driver.findElement(By.cssSelector("div.restop > p")).getText())) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    Assert.assertEquals("Page 4 of 148", driver.findElement(By.cssSelector("div.restop > p")).getText());
			    driver.findElement(By.linkText("Next >>")).click();
			    System.out.println("Fourth Page of Results loaded successfully");
			    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  	FileUtils.copyFile(scrFile3, new File("Screenshots/" + timeStamp + "/" + ".png"));
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("Page 5 of 148".equals(driver.findElement(By.cssSelector("div.restop > p")).getText())) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    Assert.assertEquals("Page 5 of 148", driver.findElement(By.cssSelector("div.restop > p")).getText());
			    System.out.println("Fifth Page of Results loaded successfully");
			    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  	FileUtils.copyFile(scrFile5, new File("Screenshots/" + timeStamp + "/" + ".png"));


		    takeScreen(name);
		    driver.quit();
		  }

		    	
			      	 
		    
		     	   
		  
	    	//Reporter.log("<a href='"+ local+"/" + name + "'> <img src='"+ local+"/"+ name + " ' height='100' width='100'/>" + "<a href='"+ urlname+"'>'"+ urlname+"'</a> " + " </a>");
	    	//Reporter.log("<a href='"+ safe+"/" + name + "'> <img src='"+ safe+"/"+ name + " ' height='100' width='100'/>" + "<a href='"+  myTitle+"'>'"+  myTitle+"'</a> " + " </a>");
	    	  
		
	  


	 public WebDriver browserFirefox() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run Firefox");
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		  caps.setCapability("browser", "FireFox");
		  caps.setCapability("browser_version", "22.0");
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

	 public WebDriver browserChrome() throws MalformedURLException  
	 {  
	  
		 browser_type="chrome";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setCapability("browser", "Chrome");
		 caps.setCapability("browser_version", "32.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Chrome");
	      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
	      
	      return driver;
	   
	    
	 }  
	 
	 public WebDriver browserIE9() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "IE");
		 caps.setCapability("browser_version", "9.0");
		 caps.setCapability("os", "Windows");
		 caps.setCapability("os_version", "7");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver browserIpad() throws MalformedURLException  
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
	 
	 public WebDriver browserAndroid() throws MalformedURLException  
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
	 
	 public WebDriver browserSafari() throws MalformedURLException  
	 {  
	  
		
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Safari");
		 caps.setCapability("browser_version", "6.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Lion");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");

		    driver = new RemoteWebDriver(new URL(URL), caps);
	     
	      
	      return driver;
	   
	    
	 }
	 
	 public WebDriver takeScreen(String name) throws IOException
	 {
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	     System.out.println("Let me take a sceenshot" +name);
		  
		    	
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		    myTitle = driver.getTitle();
		   
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	  }

	}  

