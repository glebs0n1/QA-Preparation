import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://istore.lt/?gclid=CjwKCAjwwo-WBhAMEiwAV4dybTu4hFMPevg4ap4F6bD51IqhYtN30GCNtbzN16JzKrWPIff-MIE1_BoCqFsQAvD_BwE");
        driver.manage().window().maximize();
        WebElement searchString = driver.findElement(By.xpath("//input[@id = 'j-search']"));
        searchString.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//button[@class = 'searchFieldSubmit']"));
        searchButton.click();
        driver.quit();

    }
}
