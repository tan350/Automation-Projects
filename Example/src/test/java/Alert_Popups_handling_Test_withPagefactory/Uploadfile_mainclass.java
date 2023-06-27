package Alert_Popups_handling_Test_withPagefactory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile_mainclass {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_SER_Monster_Brand_Phrase_10Feb-GSN-Monster_Resume-foundit%20foundit-Both-Brand---647735385595---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_IN_SER_Monster_Brand_Phrase_10Feb-GSN-Monster_Resume-foundit%20foundit-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_foundit%20foundit&gclid=EAIaIQobChMI6ZGqiM6P_gIViwVyCh3x7AllEAAYASAAEgIGsfD_BwE");
		//drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement upload=drive.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\tasharma\\Desktop\\DBAssignment\\SolutionAssignment31.pdf");
		System.out.println("File uploaded successfully!");
		drive.close();
		
		
	}

}
