package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports reports;
	public static ExtentTest extTest;
	
	public static ExtentReports exRepGen() {
		
		String path = System.getProperty ("user.dir")+("\\ExtReports\\Extindex.html");
		
		ExtentSparkReporter sparkrep = new ExtentSparkReporter(path);
				
		sparkrep.config().setDocumentTitle("Google Test Results");	
		sparkrep.config().setTheme(Theme.DARK);
			
		reports = new ExtentReports();
		reports.attachReporter(sparkrep);
			
		reports.setSystemInfo("Tester", "Lavanya");
		return reports;

}}
