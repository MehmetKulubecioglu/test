import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AppTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test() {
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().setSize(new Dimension(1936, 1056));
        driver.findElement(By.cssSelector(".desktop-menu > .js-navigation-item:nth-child(4) > a")).click();
        {
            WebElement element = driver.findElement(By.linkText("Kadın İç Giyim"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".categories > .list-title")).click();
        driver.findElement(By.linkText("Kadın İç Giyim")).click();
        driver.findElement(By.linkText("Dizaltı Çorap")).click();
        driver.findElement(By.cssSelector(".col-md-4:nth-child(1) .lazyloaded")).click();
        driver.findElement(By.cssSelector(".is-select > .variant-colors__item-image")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".is-select > .variant-colors__item-image"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".js-add-basket")).click();
        driver.findElement(By.linkText("Sepeti Görüntüle")).click();
        driver.findElement(By.linkText("Sepeti Onayla")).click();
        driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET")).click();
        driver.findElement(By.name("user_email")).click();
        driver.findElement(By.name("user_email")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector(".button:nth-child(3)")).click();
        driver.findElement(By.linkText("Yeni adres oluştur")).click();
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).sendKeys("test");
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("last_name")).sendKeys("test");
        driver.findElement(By.name("phone_number")).sendKeys("5555555555");
        driver.findElement(By.name("city")).click();
        {
            WebElement dropdown = driver.findElement(By.name("city"));
            dropdown.findElement(By.xpath("//option[. = 'İSTANBUL']")).click();
        }
        driver.findElement(By.name("township")).click();
        {
            WebElement dropdown = driver.findElement(By.name("township"));
            dropdown.findElement(By.xpath("//option[. = 'ADALAR']")).click();
        }
        driver.findElement(By.name("district")).click();
        {
            WebElement dropdown = driver.findElement(By.name("district"));
            dropdown.findElement(By.xpath("//option[. = 'BURGAZADA MAH']")).click();
        }
        driver.findElement(By.name("line")).click();
        driver.findElement(By.name("line")).sendKeys("tttttttttttttttttttttt");
        driver.findElement(By.cssSelector(".js-set-country")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) .js-shipping-radio")).click();
        driver.findElement(By.cssSelector(".js-proceed-button")).click();
        {
            WebElement element = driver.findElement(By.linkText("Ön Bilgilendirme Koşulları"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".active > .js-tab-content .agrement label")).click();
        driver.findElement(By.cssSelector(".order-complete")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".order-complete"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
}
