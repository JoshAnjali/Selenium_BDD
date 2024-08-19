import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Test1
    {

        public static void main(String[] args) throws InterruptedException
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("Log in")).click();
            driver.findElement(By.id("Email")).sendKeys("anish.M@abc.com");
            driver.findElement(By.id("Password")).sendKeys("AnishMehata");
            driver.findElement(By.id("RememberMe")).click();
            driver.findElement(By.cssSelector("button.button-1.login-button")).click();
            driver.findElement(By.linkText("Electronics")).click();
            driver.findElement(By.linkText("Cell phones")).click();
            driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
            driver.findElement(By.cssSelector("button.button-1.add-to-cart-button")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Shopping cart")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("button.button-2.continue-shopping-button")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Log out")).click();
            Thread.sleep(3000);
             driver.quit();

        }
    }


