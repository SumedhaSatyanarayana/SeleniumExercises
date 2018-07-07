package Exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();		
		//Thread.sleep(1000);
		driver.get("https://www.tutorialspoint.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/form/input[2]")).sendKeys("Selenium");
		System.out.println("search success");
		
		File f = new File("J:\\eclipse\\abcd.docx");
		XWPFDocument docum;
		if (f.exists()){
			FileInputStream fis = new FileInputStream(f);
			docum = new XWPFDocument(OPCPackage.open(fis));
			System.out.println("hi");
		}
		else
		{
			docum = new XWPFDocument();
			System.out.println("bye");
		}
		
		XWPFParagraph p = docum.createParagraph();
		XWPFRun r = p.createRun();
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("J:\\eclipse\\Screenshot\\ss1.png"));
		//String image = "ss1";
		//FileInputStream pic = new FileInputStream("J:\\eclipse\\Screenshot\\ss1.png");
		r.addBreak();
		r.setText("Search result ");
		r.addPicture(new FileInputStream("J:\\eclipse\\Screenshot\\ss1.png"), XWPFDocument.PICTURE_TYPE_PNG, "J:\\eclipse\\Screenshot\\ss1.png", Units.toEMU(200), Units.toEMU(200));
		FileOutputStream out = new FileOutputStream("images.docs");
		docum.write(out);
		docum.close();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/form/button")).click();
		System.out.println("clicked");
		

	}

}
