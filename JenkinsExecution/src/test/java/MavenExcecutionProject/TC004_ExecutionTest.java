package MavenExcecutionProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC004_ExecutionTest {

	@Test

	public void test() throws InterruptedException {

		Reporter.log("-------------------<<<<<<<<<< maven 3 test >>>>>>>>>>--------------------", true);

		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.quit();

	}

}
