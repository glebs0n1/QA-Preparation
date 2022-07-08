import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://istore.lt");
        driver.manage().window().maximize();
        WebElement searchString = driver.findElement(By.xpath("//input[@id = 'j-search']"));
        searchString.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//button[@class = 'searchFieldSubmit']"));
        searchButton.click();
        driver.quit();

    }
}

