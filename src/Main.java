import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
  public static void main(String[] args) {
    System.out.println("Hello and welcome!");

    final AutomatizationTest testProcess =  new AutomatizationTest();

    testProcess.automatizationTest();
  }
}