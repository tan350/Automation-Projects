package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_Test {
	
	@Test
	public void youtube_prop() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://www.youtube.com/");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement s=drive.findElement(By.xpath("//input[@id='search']"));
		s.sendKeys("Bollywood songs");
		
		s.sendKeys(Keys.ARROW_DOWN);
		s.sendKeys(Keys.ENTER);
		drive.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		drive.findElement(By.id("expand")).click();
		
		//WebElement ds =drive.findElement(By.xpath("//*[@id='description-inline-expander']"));
		//System.out.println(ds.getText());
		
		WebElement mute=drive.findElement(By.xpath("//button[@class='ytp-mute-button ytp-button']"));
		mute.click();
		System.out.println("Video muted successfully!");
		
		WebElement pause=drive.findElement(By.xpath("//button[@data-title-no-tooltip='Pause']"));
		pause.click();
		System.out.println("Video paused successfully!");
		
		WebElement subtitle=drive.findElement(By.xpath("//button[@class='ytp-subtitles-button ytp-button']"));
		subtitle.click();
		System.out.println("Subtitle on successfully!");
		
		WebElement nextvideo=drive.findElement(By.xpath("//a[@title='Next (SHIFT+n)']"));
		nextvideo.click();
		System.out.println("Next video played successfully!");
		
		WebElement fullscreen=drive.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
		fullscreen.click();
		System.out.println("video on fullscreen!");
		
	}
}
