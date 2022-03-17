import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login_test {
    SoftAssert soft =new SoftAssert();
    Login_design login=new Login_design();
    WebDriver driver;
    @BeforeTest
    public void open_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HaMo\\eclipse-workspace\\firstProject\\drivers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);}
    @Test
    public void valid_username_valid_password() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.steps(driver,"tomsmith","SuperSecretPassword!");
        String actual=driver.findElement(login.flashpom()).getText();
        String expected="You logged into a secure area";
        soft.assertTrue(actual.contains(expected),"result true");
        soft.assertAll();}
    @Test
    public void invalid_username_valid_password() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.steps(driver,"tcomsmith","SuperSecretPassword!");
        String expected="Your username is invalid!";
        String actual=driver.findElement(login.flashpom()).getText();
        // Assert.assertEquals(actual.contains(expected),true);
        Thread.sleep(2000);
        soft.assertTrue( actual.contains(expected),"true check ");
        soft.assertAll();}
    @Test
    public void valid_username_invalid_password() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.steps(driver,"tomsmith","SuperSecretmnPassword!");
        String expected="Your password is invalid!";
        String actual=driver.findElement(login.flashpom()).getText();
        // Assert.assertEquals(actual.contains(expected),true);
        Thread.sleep(2000);
        soft.assertTrue( actual.contains(expected),"true check ");
        soft.assertAll();}
    @Test
        public void invalid_username_invalid_password() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.steps(driver,"tomsmi th","SuperSe cretPassword!");
        String expected="Your username is invalid!";
        String actual=driver.findElement(login.flashpom()).getText();
        // Assert.assertEquals(actual.contains(expected),true);
        Thread.sleep(2000);
        soft.assertTrue( actual.contains(expected),"true check ");
        soft.assertAll();
    }@AfterTest
    public void close_browser()
    {
        driver.quit();
    }

}

