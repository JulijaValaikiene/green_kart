package lt.techin.greenkart.julijav;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasePageTest {

    protected WebDriver driver;
    String givenUrl ="https://rahulshettyacademy.com/seleniumPractise/#/offers";
    @BeforeEach
    void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(givenUrl);
    }
    @AfterEach
    void tearDown(){

        driver.quit();
    }
//    public static void stepWait() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//    }
}

