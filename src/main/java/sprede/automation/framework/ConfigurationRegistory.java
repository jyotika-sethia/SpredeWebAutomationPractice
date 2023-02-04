package sprede.automation.framework;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.yaml.snakeyaml.Yaml;

import sprede.utils.PropFileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ConfigurationRegistory {

	Map<String, Object> config;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	
	public WebDriver getDriver(Map<String, Object> config) throws MalformedURLException {
		String testBrowser = config.get("testBrowser").toString();
		System.out.println("Test browser is " +testBrowser);
//		String testBrowser ="edge";
		WebDriver driver = null;

		ChromeOptions chromeOptions;
		FirefoxOptions ffOptions = new FirefoxOptions();
		EdgeOptions edgeOptions=new EdgeOptions();
		SafariOptions safariOptions=new SafariOptions();
		
		switch (testBrowser) {
		case ("chrome"):
		System.out.println("In Chrome configuration");
//		System.setProperty("webdriver.chrome.driver", driverPathChrome);
		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("test-type");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--disable-web-security");
		chromeOptions.addArguments("--allow-running-insecure-content");
		driver = new ChromeDriver(chromeOptions);
		driver.get(PropFileHandler.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		break;

		case ("firefox"):
		System.out.println("In firefox configuration");
		WebDriverManager.firefoxdriver().setup();
		ffOptions.addArguments("test-type");
		ffOptions.addArguments("start-maximized");
		ffOptions.addArguments("--incognito");
		ffOptions.addArguments("--disable-web-security");
		ffOptions.addArguments("--allow-running-insecure-content");
		driver = new FirefoxDriver(ffOptions);
		driver.get(PropFileHandler.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		driver.get(PropFileHandler.readProperty("url"));
		break;

		case ("edge"):
		System.out.println("In edge configuration");
		WebDriverManager.edgedriver().setup();
		edgeOptions.setCapability("mode", "--incognito");
		driver = new EdgeDriver(edgeOptions);
		driver.get(PropFileHandler.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		break;
		
		case ("safari"):
		System.out.println("In safari configuration");
		WebDriverManager.safaridriver().setup();
		safariOptions.setCapability("mode", "--incognito");
		driver = new SafariDriver(safariOptions);
		driver.get(PropFileHandler.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		break;	
		
		}

       return driver;
	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);

	}

}
