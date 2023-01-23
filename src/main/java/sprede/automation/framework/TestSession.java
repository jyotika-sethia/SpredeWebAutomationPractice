package sprede.automation.framework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.Yaml;


public class TestSession extends ConfigurationRegistory{

    public WebDriver driver;
    public Map<String, Object> config;
    public static Logger logger;

    @SuppressWarnings("unchecked")
	public TestSession() {
        config = new HashMap();
        Yaml yaml = new Yaml();
        config = (Map<String, Object>) yaml
                .load(getClass().getClassLoader().getResourceAsStream("testConfiguration.yaml"));
        logger = Logger.getLogger("TestActivity");
        logger.info("Starting Test Session...");
        logger.info("Initializing Test Data...");

        try {
            driver = getDriver(config);
        } catch (MalformedURLException ex) {
            java.util.logging.Logger.getLogger(TestSession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

  
    public void quit() throws FileNotFoundException, IOException {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("No Driver Session Found!!!");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(TestSession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
