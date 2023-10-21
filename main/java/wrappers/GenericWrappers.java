package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			prop = new Properties();
			
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unLoadnObjects() {
		prop=null;
	}
	
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEdriver.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//	System.out.println("The browser " +browser+" is launched with the given url "+url);	
			reportStep("The browser " +browser+" is launched with the given url "+url, "Pass");
		} catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched as the url doesnt contain http/https");
			reportStep("The browser "+browser+" is not launched as the url doesnt contain http/https", "fail");
			
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The browse "+browser+" is not launched due to unknow error");
			reportStep("The browse "+browser+" is not launched due to unknow error", "fail");
		}
		
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the applecation");
			reportStep("The element with id "+idValue+" is not visible in the applecation", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not interactable in the applecation");
			reportStep("The element with the id "+idValue+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not stable in the applecation");
			reportStep("The element with the id "+idValue+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" as unexpected alert got opened");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" due to unknow error");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" due to unknow error", "fail");
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the applecation");
			reportStep("The element with name "+nameValue+" is not visible in the applecation", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the applecation");
			reportStep("The element with name "+nameValue+" is not interactable in the applecation","fail");
		
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the applecation");
			reportStep("The element with name "+nameValue+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with the data "+data+" as unexpected alert got opened");
			reportStep("The element with name "+nameValue+" is not entered with the data "+data+" as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with the data "+data+" due to unknow error");
			reportStep("The element with name "+nameValue+" is not entered with the data "+data+" due to unknow error", "fail");
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the applecation");
			reportStep("The element with xpath "+xpathValue+" is not visible in the applecation", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath "+xpathValue+" is not interactable in the applecation");
			reportStep("The element with the xpath "+xpathValue+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not stable in the applecation");
			reportStep("The element with the xpath "+xpathValue+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" as unexpected alert got opened");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" due to unknow error");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" due to unknow error", "fail");
		}
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with elpected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with elpected title "+title, "pass");
			}else {
				//System.err.println("The title of the page "+actualTitle+" is not matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the expected title "+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified dute to unknown error");
			reportStep("The title of the page "+title+" is not verified dute to unknown error", "fail");
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualTextID = driver.findElementById(id).getText();
			if(actualTextID.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualTextID+" is matched with the expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualTextID+" is matched with the expected text "+text, "passa");
			}else {
				//System.err.println("The element with id "+id+" is holding the text "+actualTextID+"is not matched with the given text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualTextID+"is not matched with the given text "+text, "pass");
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not matched with the text "+text+" dute to unexpected alert got opend");
			reportStep("The element with id "+id+" is not matched with the text "+text+" dute to unexpected alert got opend", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not matched with the text "+text+" due to unknown error");
			reportStep("The element with id "+id+" is not matched with the text "+text+" due to unknown error", "fail");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualTextXpath = driver.findElementByXPath(xpath).getText();
			if(actualTextXpath.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualTextXpath+" is matched with the expected given "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualTextXpath+" is matched with the expected given "+text, "Pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualTextXpath+" is not matched with the given text"+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualTextXpath+" is not matched with the given text"+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not matched with the text "+text+" dute to unexpected alert got opend");
			reportStep("The element with xpath "+xpath+" is not matched with the text "+text+" dute to unexpected alert got opend", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not matched with the text "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" is not matched with the text "+text+" due to unknown error", "fail");
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpath).getText();
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" matched with the expected text "+text, "Pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the given text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the given text "+text, "Passs");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not contain the expected text "+ text+" due to unexpected alert found");
			reportStep("The element with xpath "+xpath+" is not contain the expected text "+ text+" due to unexpected alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not contain the expected text "+ text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" is not contain the expected text "+ text+" due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the applecation");
			reportStep("The element with id "+id+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked");
			reportStep("The element with id "+id+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not interactable in the applecation");
			reportStep("The element with the id "+id+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the applecation");
			reportStep("The element with the id "+id+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not able to click as unexpected alert got opened");
			reportStep("The element with the id "+id+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not able ro click due to unknow eror");
			reportStep("The element with the id "+id+" is not able ro click due to unknow eror", "fail");
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is able to click");
			reportStep("The element with classname "+classVal+" is able to click", "Pass");
		}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with classname "+classVal+" is not found in the DOM");
			reportStep("The element with classname "+classVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the applecation");
			reportStep("The element with classname "+classVal+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicked");
			reportStep("The element with classname "+classVal+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not interactable in the applecation");
			reportStep("The element with the classname "+classVal+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not stable in the applecation");
			reportStep("The element with the classname "+classVal+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not able to click as unexpected alert got opened");
			reportStep("The element with the classname "+classVal+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not able ro click due to unknow error");
			reportStep("The element with the classname "+classVal+" is not able ro click due to unknow error", "fail");
		}
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is able to click");
			reportStep("The element with name "+name+" is able to click", "pass");
		}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the applecation");
			reportStep("The element with name "+name+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked");
			reportStep("The element with name "+name+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not interactable in the applecation");
			reportStep("The element with the name "+name+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not stable in the applecation");
			reportStep("The element with the name "+name+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not able to click as unexpected alert got opened");
			reportStep("The element with the name "+name+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not able ro click due to unknow error");
			reportStep("The element with the name "+name+" is not able ro click due to unknow error", "fail");
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linkText "+name+" is able to click");
			reportStep("The element with linkText "+name+" is able to click", "pass");
		}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with linkText "+name+" is not found in the DOM");
			reportStep("The element with linkText "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not visible in the applecation");
			reportStep("The element with linkText "+name+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not clicked");
			reportStep("The element with linkText "+name+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with the linkText "+name+" is not interactable in the applecation");
			reportStep("The element with the linkText "+name+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with the linkText "+name+" is not stable in the applecation");
			reportStep("The element with the linkText "+name+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with the linkText "+name+" is not able to click as unexpected alert got opened");
			reportStep("The element with the linkText "+name+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with the linkText "+name+" is not able ro click due to unknow error");
			reportStep("The element with the linkText "+name+" is not able ro click due to unknow error", "fail");
		}		
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linkText "+name+" is able to click");
			reportStep("The element with linkText "+name+" is able to click", "pass");
		} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with linkText "+name+" is not found in the DOM");
			reportStep("The element with linkText "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not visible in the applecation");
			reportStep("The element with linkText "+name+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not clicked");
			reportStep("The element with linkText "+name+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not interactable in the applecation");
			reportStep("The element with linkText "+name+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not stable in the applecation");
			reportStep("The element with linkText "+name+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not able to click as unexpected alert got opened");
			reportStep("The element with linkText "+name+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with linkText "+name+" is not able ro click due to unknow error");
			reportStep("The element with linkText "+name+" is not able ro click due to unknow error", "fail");
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is able to click");
			reportStep("The element with xpath "+xpathVal+" is able to click", "pass");
		}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the applecation");
			reportStep("The element with xpath "+xpathVal+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked");
			reportStep("The element with xpath "+xpathVal+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not interactable in the applecation");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not stable in the applecation");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not able to click as unexpected alert got opened");
			reportStep("The element with the xpath "+xpathVal+" is not able to click as unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not able to click due to unknow error");
			reportStep("The element with the xpath "+xpathVal+" is not able to click due to unknow error", "fail");
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is able to click");
			reportStep("The element with xpath "+xpathVal+" is able to click", "pass");
		}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
		// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the applecation");
			reportStep("The element with xpath "+xpathVal+" is not visible in the applecation", "fail");
		}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked");
			reportStep("The element with xpath "+xpathVal+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not interactable in the applecation");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the applecation", "fail");
		}catch (StaleElementReferenceException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is stable in the applecation");
			reportStep("The element with the xpath "+xpathVal+" is stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not able to click as unexpected alert got opend");
			reportStep("The element with the xpath "+xpathVal+" is not able to click as unexpected alert got opend", "fail");
		}catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not able to click due to unknow error");
			reportStep("The element with the xpath "+xpathVal+" is not able to click due to unknow error", "fail");
		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			actualText = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is able to get the text");
			reportStep("The element with id "+idVal+" is able to get the text", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in DOM");
			reportStep("The element with id "+idVal+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not found in application");
			reportStep("The element with id "+idVal+" is not found in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not is not intaractable in the application");
			reportStep("The element with id "+idVal+" is not is not intaractable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not found due to unexpected alert got opend");
			reportStep("The element with id "+idVal+" is not found due to unexpected alert got opend", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not found due to unknown error");
			reportStep("The element with id "+idVal+" is not found due to unknown error", "fail");
		}
		return actualText;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String name = driver.findElementByXPath(xpathVal).getText();
		try {
			//String name = driver.findElementById(idVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is able to get the text");
			reportStep("The element with xpath "+xpathVal+" is able to get the text", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in application");
			reportStep("The element with xpath "+xpathVal+" is not found in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not intaractable in the application");
			reportStep("The element with xpath "+xpathVal+" is not intaractable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found due to unexpected alert got opend");
			reportStep("The element with xpath "+xpathVal+" is not found due to unexpected alert got opend", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not found due to unknown error", "fail");
		}
		return name;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement name = driver.findElementById(id);
			Select nameVal = new Select(name);
			nameVal.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" holding the value "+value+" is selected");
			reportStep("The element with id "+id+" holding the value "+value+" is selected", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not found in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not found in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not able to select the text");
			reportStep("The element with id "+id+" holding the value "+value+" is not able to select the text", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not intaractable in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not intaractable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not stable in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not selected due to unexpected alert");
			reportStep("The element with id "+id+" holding the value "+value+" is not selected due to unexpected alert", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not selected due to unknown error");
			reportStep("The element with id "+id+" holding the value "+value+" is not selected due to unknown error", "fail");
		}
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement name = driver.findElementById("id");
			Select nameVal = new Select(name);
			nameVal.selectByIndex(value);
			//System.out.println("The element with id "+id+" holding the value "+value+" is selected");
			reportStep("The element with id "+id+" holding the value "+value+" is selected", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" holding the value "+value+" is not found in the DOM");
			reportStep("The element with id "+id+" holding the value "+value+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not found in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not found in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not able to select the text");
			reportStep("The element with id "+id+" holding the value "+value+" is not able to select the text", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not intaractable in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not intaractable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not stable in the application");
			reportStep("The element with id "+id+" holding the value "+value+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not selected due to unexpected alert");
			reportStep("The element with id "+id+" holding the value "+value+" is not selected due to unexpected alert", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" holding the value "+value+" is not selected due to unknown error");
			reportStep("The element with id "+id+" holding the value "+value+" is not selected due to unknown error", "fail");
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			for(String eachId : allWindowHandles) {	
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("Switched to the parent window");
			reportStep("Switched to the parent window", "Pass");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The selected window is not able to open due to unexpected alert found");
			reportStep("The selected window is not able to open due to unexpected alert found", "fail");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The required window is not be able to switch due to window name is not found");
			reportStep("The required window is not be able to switch due to window name is not found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			reportStep("The required window is not able to switch due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String Lastwindow : allWindowHandles) {
			    driver.switchTo().window(Lastwindow);
			}
			//System.out.println("Switched to Lastwindow");
			reportStep("Switched to Lastwindow", "Pass");
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("SwitchtoLastWindow is not successfull as no such window found");
			reportStep("SwitchtoLastWindow is not successfull as no such window found", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("SwitchtoLastWindow is not successfull as unkown alert");
			reportStep("SwitchtoLastWindow is not successfull as unkown alert", "fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("SwitchtoLastWindow is not successfull as Window ID is not created");
			reportStep("SwitchtoLastWindow is not successfull as Window ID is not created", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("SwitchtoLastWindow is not successfull due to unknown error");
			reportStep("SwitchtoLastWindow is not successfull due to unknown error", "fail");
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert got accepted successfully");
			reportStep("Alert got accepted successfully", "Pass");
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.out.println("Alert did not get acceped due to no alert found");
			reportStep("Alert did not get acceped due to no alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Accept alert is not found due to unknown error");
			reportStep("Accept alert is not found due to unknown error", "fail");
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert got dismissed");
			reportStep("Alert got dismissed", "Pass");
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.out.println("Alert did not get dismissed as there is no such alert found");
			reportStep("Alert did not get dismissed as there is no such alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Dismiss alert is not found due to unknown error");
			reportStep("Dismiss alert is not found due to unknown error", "fail");
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			//System.out.println("Got the text from the alert"+alertText);
			reportStep("Got the text from the alert"+alertText, "Pass");
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.out.println("Text is not found due to no such alert found");
			reportStep("Text is not found due to no such alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Text is not found due to unknown error");
			reportStep("Text is not found due to unknown error", "fail");
		}
		return alertText;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		
		try {
			
			
			number = (long)(Math.floor(Math.random()*100000000)+1000000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
			//System.out.println("Screenshot captured successfully");
			//reportStep("Screenshot captured successfully", "Pass");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to capture the screenshot because the browse/WebDriver session is not launched due to unknow error");
			//reportStep("Unable to capture the screenshot because the browse/WebDriver session is not launched due to unknow error", "fail");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return number;

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("Successfully closed the current browser window");
			reportStep("Successfully closed the current browser window", "Pass", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("window has already been closed/it was never opened in the first place");
			reportStep("window has already been closed/it was never opened in the first place", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browse/WebDriver session is not launched due to unknow error");
			reportStep("The browse/WebDriver session is not launched due to unknow error", "fail");
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("Successfully closed the current browser window and end the WebDriver session");
			reportStep("Successfully closed the current browser window and end the WebDriver session", "Pass", false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("WebDriver session has already been closed");
			reportStep("WebDriver session has already been closed", "fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browse/WebDriver session is not launched due to unknow error");
			reportStep("The browse/WebDriver session is not launched due to unknow error", "fail", false);
		}
	}

	@Override
	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	
		}
	}

	@Override
	public void selectVisibleTextByName(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement object = driver.findElementByName(id);
			Select sel = new Select(object);
			sel.selectByVisibleText(value);
			System.out.println("Selected the visible text");
			reportStep("Selected the visible text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not selected");
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not selected", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not visible in the applecation");
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not visible in the applecation", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not intaractable in the applection");
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not intaractable in the applection", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is selected with the visible text "+value+" is not stable in the applecation");
			reportStep("The element with id "+id+" is selected with the visible text "+value+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select due to unexpected alert found");
			reportStep("The element with id "+id+" is not able to select due to unexpected alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			///System.err.println("The element with id "+id+" is not select due to unknown error");
			reportStep("The element with id "+id+" is not select due to unknown error", "fail");
		}
	}

	@Override
	public void selectVisibileTextByXpath(String xpathval, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement object = driver.findElementByXPath(xpathval);
			Select sel = new Select(object);
			sel.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpathval "+xpathval+" is not found in the DOM");
			reportStep("The element with xpathval "+xpathval+" is not found in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not selected");
			reportStep("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not selected", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not visible in the applecation");
			reportStep("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not visible in the applecation", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not intaractable in the applection");
			reportStep("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not intaractable in the applection", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not stable in the applecation");
			reportStep("The element with xpathval "+xpathval+" is selected with the visible text "+value+" is not stable in the applecation", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is not able to select due to unexpected alert found");
			reportStep("The element with xpathval "+xpathval+" is not able to select due to unexpected alert found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathval "+xpathval+" is not select due to unknown error");
			reportStep("The element with xpathval "+xpathval+" is not select due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to refresh the window due to unknown error");
			reportStep("Unable to refresh the window due to unknown error", "pass");
		}
	}

	@Override
	public void sendkeys(String Value) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(Value);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.out.println("Alert did not get acceped due to no alert found");
			reportStep("Alert did not get acceped due to no alert found", "Pass");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Accept alert is not found due to unknown error");
			reportStep("Accept alert is not found due to unknown error", "fail");
		}
	}

	@Override
	public void switchToFrameByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementByXPath(xpath);
			
			driver.switchTo().frame(myframe);
			//System.out.println("switched to frame");
			reportStep("switched to frame", "Pass");
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			reportStep("The required window is not able to switch due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void switchToFrameById(String id) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementById(id);
			
			driver.switchTo().frame(myframe);
			//System.out.println("switched to frame");
			reportStep("switched to frame", "Pass");
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The required window is not able to switch due to unknown error");
			reportStep("The required window is not able to switch due to unknown error", "fail");
		}
		
	}

	@Override
	public void defaultcontent() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//System.out.println("Switch to default content");
		reportStep("Switch to default content", "Pass");
	}

	/*
	 * @Override public void mouseHover() { // TODO Auto-generated method stub try {
	 * Actions builder = new Actions(driver);
	 * 
	 * WebElement holidays = driver.findElementByLinkText();
	 * 
	 * builder.moveToElement(holidays).perform(); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */

	@Override
	public void mouseHoverByXpath(String xpathValue) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			
			WebElement holidays =  driver.findElementByXPath(xpathValue);
			
			builder.moveToElement(holidays).perform();
			
			reportStep("The Element with value Holidays has performed click", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
	
		}
	}



	
	
}
