package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class initial{
	
	public static ExtentReports extent;
    public static ExtentHtmlReporter htmlreporter;
    public static ExtentTest testCase;
	

   public static WebDriver driver;


@BeforeSuite
public  void main()throws IOException {
System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_selenium.exe");
 driver = new ChromeDriver();

 driver.manage().window().maximize();
 driver.get("http://192.168.1.35:8083/#/login");
 
  //report
 
 ExtentReport();
}
@AfterSuite
  public void closeChrome(){
 //  driver.close();
      extent.flush();
}
  
  public static void ExtentReport() throws IOException {
        extent = new ExtentReports();
        htmlreporter = new ExtentHtmlReporter("C:\\Users\\hp\\eclipse-workspace\\materialsStates\\src\\test\\java\\Report\\report.html");
        
        extent.attachReporter(htmlreporter);
    }



}

