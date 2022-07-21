import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        wait(2);
        WebElement userNameBox = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
        userNameBox.sendKeys("ttechno@gmail.com");

        wait(2);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        passwordBox.sendKeys("techno123.");

        wait(2);
        WebElement signInButton = driver.findElement(By.xpath("//a[text()='Sign in']"));
        signInButton.click();

        wait(2);
        WebElement checkResultText = driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']"));
        System.out.println(checkResultText.getText().contains("Your nearest branch closes in: 30m 5s"));


        waitAndClose();

    }

}
