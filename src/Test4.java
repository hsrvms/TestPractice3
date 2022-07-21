import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class Test4 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink = driver.findElement(By.xpath("//a[text()='Calculate']"));
        calculateLink.click();

        WebElement calculateSelect = driver.findElement(By.xpath("//form[@action='calculate.php']/select"));
        Select calculateMenu = new Select(calculateSelect);
        calculateMenu.selectByVisibleText("times");

        WebElement firstInput = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        firstInput.sendKeys("5");

        WebElement secondInput = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        secondInput.sendKeys("8");

        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        WebElement result = driver.findElement(By.xpath("//form[@method='post']/following::span"));
        System.out.println(result.getText());

        Assert.assertTrue(Integer.parseInt(result.getText()) == 40);

        waitAndClose();
    }


}
