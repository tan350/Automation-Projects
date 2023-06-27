package Alert_Popups_handling_Test_withPagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_handling_main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://jqueryui.com/droppable/");
		Actions act=new Actions(drive);
		drive.switchTo().frame(0);
		WebElement from=drive.findElement(By.id("draggable"));
		WebElement to=drive.findElement(By.id("droppable"));
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		act.dragAndDrop(from, to).build().perform();
		drive.quit();
	}

}
