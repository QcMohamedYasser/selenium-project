import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Swvl1 {



public WebElement enter_num(WebDriver Mohamed)
{

    By user1=By.cssSelector("input[class=\"styles_input__2mpPs form-control invalid-number\"]");
    WebElement user11=Mohamed.findElement(user1);

    return user11 ;



}
public WebElement click(WebDriver Mohamed){
    By user2=By.className("span[class=\"relative flex justify-center px-10\"]");
    WebElement user12=Mohamed.findElement(user2);
    return user12;

}


}
