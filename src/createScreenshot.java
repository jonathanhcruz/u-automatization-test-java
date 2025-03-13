import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


final class ScreenshotClass {

  static void createScreenshot(WebDriver driver, String screenshotName, String path) {
    try {
      TakesScreenshot screenshot = (TakesScreenshot) driver;

      File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
      File destFile = new File("./screenshot/" + path + '/' + screenshotName + "-screen.png");

      FileUtils.copyFile(srcFile, destFile);
      System.out.println("Screenshot saved successfully!");
      } catch (IOException e){
        System.out.println("An error occurred while saving the screenshot.");
        e.printStackTrace();
      }
  }
}
