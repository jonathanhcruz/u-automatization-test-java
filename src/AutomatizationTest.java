import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class AutomatizationTest {

  public void automatizationTest() {

    final GetInputInfo getInputInfo = new GetInputInfo();

    final  String user = GetInputInfo.getInputInfo("Please enter the user id for mercadolibre: ");
    final String password = GetInputInfo.getInputInfo("Please Enter the password for mercadolibre");


    final String protocol = "https://";
    final String prefix = "";
    final String params = "/";
    final WebDriver driver = new ChromeDriver();
    final ScreenshotClass screenshot = new ScreenshotClass();

    driver.get(protocol + prefix + "mercadolibre.com.co" + params);
    screenshot.createScreenshot(driver, "step1", "");

    testlogin(driver, screenshot, user, password);

    testAddToCar(driver, screenshot);

    driver.quit();
  }

    public void testlogin(WebDriver driver, ScreenshotClass screenshot, String user, String password) {
      try {
        final String path = "login";

        // Find the button 'iniciar session' on the page
        final WebElement buttonGetInto = driver.findElement(By.xpath("/html/body/header/div/div[6]/nav/ul/li/a[2]"));
        buttonGetInto.click();

        //wait for 2 second
        Thread.sleep(3000);

        // Take a screenshot of the login page
        screenshot.createScreenshot(driver, "step2", path);

        // Find the input field for the user
        final WebElement input = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[3]/div/div[1]/form/div[1]/div/div/div[1]/input"));
        input.click();

        // inject the user on the input field
        input.sendKeys(user);

        // take Screenshot of the user input
        screenshot.createScreenshot(driver, "step3", path);

        // Find the input field for the user
        final WebElement buttonUser = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[3]/div/div[1]/form/div[2]/button/span"));
        buttonUser.click();

        //wait for 3 seconds
        Thread.sleep(3000);

        screenshot.createScreenshot(driver, "step4", path);

       // Find the input field for the password
       final WebElement inputPass = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div/div[1]/input[1]"));
        inputPass.click();

       //inject the password on the input field
        inputPass.sendKeys(password);

        screenshot.createScreenshot(driver, "step5", path);

        final WebElement buttonPass = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[4]/div/div[1]/form/div[2]/button[1]"));
        buttonPass.click();

        Thread.sleep(3000);



      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    public void testAddToCar(WebDriver driver, ScreenshotClass screenshot){
      try {
        final String path = "addToCar";

        // take Screenshot of home page logged
        screenshot.createScreenshot(driver, "step6", path);

        //wait for 2 seconds
        Thread.sleep(3000);

        final WebElement offerElement = driver.findElement(By.xpath("/html/body/header/div/div[5]/div/ul/li[2]/a"));
        offerElement.click();

        //wait for 2 seconds
        Thread.sleep(3000);

        screenshot.createScreenshot(driver, "step7", path);

        final WebElement product = driver.findElement(By.xpath("/html/body/main/div/section/div[2]/div/div/div[1]/div[2]/a"));
        product.click();

        //wait for 2 seconds
        Thread.sleep(3000);

        screenshot.createScreenshot(driver, "step8", path);

        final WebElement buttonAddToCar = driver.findElement(By.xpath("/html/body/main/div[2]/div[4]/div[2]/div[2]/div/div[1]/form/div[5]/div/button[2]"));
        buttonAddToCar.click();

        //wait for 2 seconds
        Thread.sleep(3000);

        screenshot.createScreenshot(driver, "step9", path);

        final WebElement buttonDeleteToCar = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section[1]/article/div/section/article/div/div/div/button[1]"));
        buttonDeleteToCar.click();

        //wait for 4 seconds
        Thread.sleep(4000);

        screenshot.createScreenshot(driver, "step11", path);

        //wait for 2 seconds
        Thread.sleep(2000);

      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
}
