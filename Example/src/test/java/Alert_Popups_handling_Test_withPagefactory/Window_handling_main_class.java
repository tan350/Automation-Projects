package Alert_Popups_handling_Test_withPagefactory;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handling_main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://the-internet.herokuapp.com/windows");
		drive.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ids=drive.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it=ids.iterator();
		ids.iterator();
		for(String i1:ids)
		{
			System.out.println("ID= "+i1);
		}
		String p_id=it.next();
		String c_id=it.next();
		drive.switchTo().window(p_id);
		drive.switchTo().window(c_id);
		System.out.println(drive.getTitle());
		drive.quit();

	}

}
