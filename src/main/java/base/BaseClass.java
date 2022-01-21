package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static  WebDriver driver;
	public  Properties prop;
	public  String cdpath;

	//public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public BaseClass() {
		prop = new Properties();
		
		try {
			prop.load(new FileInputStream("C:\\Users\\laven\\eclipse-workspace-new\\"
					+"JenkinsTrial\\src\\main\\java\\resources\\config.properties"
					));
			cdpath = prop.getProperty("driverpath");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", cdpath);
		driver = new ChromeDriver();
		//log.info("Driver is initialized");
		
	}
}
