import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {
    @Test
    void setup()
    {

        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddevasenapathy\\drivers_new\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.fgcu.edu/canvas/");
        String title = driver.getTitle();
        System.out.println(title);

        String url_page = driver.getCurrentUrl();
        System.out.println(url_page);
        driver.close();

     }

     @Test
     void scroll_page() throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.fgcu.edu/canvas/");
         driver.manage().window().maximize();

         JavascriptExecutor exe = (JavascriptExecutor) driver;
         exe.executeScript("window.scroll(0,1000)", "");//scroll up
         Thread.sleep(3000);
         exe.executeScript("window.scroll(0,-1000)", "");//scroll down
         Thread.sleep(3000);
         driver.close();
     }
}
