package SampleMavenWithSellenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMaven {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ProgramFiles\\Selenium\\ChromeDriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
