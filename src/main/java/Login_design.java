import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_design
{   // WebDriver driver;          wrong another driver
    public WebElement hamo(WebDriver driver)
    {
        By userEL=By.id("username");
        WebElement user=driver.findElement(userEL);
        return user;
    }
    public WebElement pass(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    public By flashpom()
    {return By.id("flash");}
    public void steps(WebDriver driver,String name, String password)
    {
        hamo(driver).clear();
        hamo(driver).sendKeys(name);
        pass(driver).clear();
        pass(driver).sendKeys(password);
        pass(driver).sendKeys(Keys.ENTER);
    }


}
