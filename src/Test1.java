import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']"));
        fullName.sendKeys("Automation");

        WebElement email = driver.findElement(By.xpath("//*[@placeholder='name@example.com']"));
        email.sendKeys("testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@id='currentAddress-wrapper']//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id='permanentAddress-wrapper']/div[@class='col-md-9 col-sm-12']/textarea"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();

        WebElement fullNameResult = driver.findElement(By.xpath("(//p[@class='mb-1'])[1]"));
        WebElement emailResult = driver.findElement(By.xpath("(//p[@class='mb-1'])[2]"));

        System.out.println(fullNameResult.getText().contains("Automation"));
        System.out.println(emailResult.getText().contains("testing"));


        waitAndClose();
    }

}
