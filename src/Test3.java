import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseDriver{

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        wait(2);
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
        searchBox.sendKeys("teddy bear");

        wait(2);
        WebElement searchButton = driver.findElement(By.xpath("//button[@onclick]"));
        searchButton.click();

        wait(2);
        WebElement searchResult = driver.findElement(By.xpath("(//span[contains(text(),'results for')])[1]"));
        System.out.println(searchResult.getText().contains("results for"));

        waitAndClose();
    }

}
