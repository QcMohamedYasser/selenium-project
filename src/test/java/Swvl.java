import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;

public class Swvl {
    WebDriver Mohamed;
    SoftAssert soft=new SoftAssert();
    Swvl1 swvl1=new Swvl1();
    @BeforeTest

        public void open_browser() throws InterruptedException
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\HaMo\\eclipse-workspace\\firstProject\\drivers\\chromedriver.exe");
            Mohamed=new ChromeDriver();
          Mohamed.manage().window().maximize();
            Thread.sleep(2000);


        }
        @Test
    public void click_login() throws InterruptedException {
Mohamed.navigate().to("https://swvl.com/travel?gclid=CjwKCAiAprGRBhBgEiwANJEY7EExkvqOsGaciUeZj0h1kc3DUmU35aVrwkRunRaNx8nWVU18itjpXBoC9rsQAvD_BwE&gclsrc=aw.ds");
Mohamed.findElement(By.cssSelector("button[class=\"hidden md-plus:block h-11 mx-2 text-sm font-bold  uppercase bg-transparent border-2 px-8 rounded false\"]")).click();
Thread.sleep(3000);

        }
       @Test
       public void number() throws InterruptedException {
        Mohamed.navigate().to("https://swvl.com/travel/contact/mobile_number");
           swvl1.enter_num(Mohamed).sendKeys();
           swvl1.enter_num(Mohamed).click();
               swvl1.enter_num(Mohamed).sendKeys();
           String expected="Contact Details";
           Thread.sleep(3000);
           String Actual=Mohamed.findElement(By.className("h2[class=\"px-4 text-xl font-bold\"]")).getText();
           soft.assertTrue(Actual.contains(expected),"accepted");
           Thread.sleep(500);
    soft.assertAll();



}


        @AfterTest
    public  void close_browser(){
        Mohamed.quit();
        }
}
