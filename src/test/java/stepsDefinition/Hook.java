package stepsDefinition;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil
{
    public static WebDriver driver;


    @Before
    public void initializedTest()
    {
        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("entrar")).submit();
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();

    }

    /*
    @After
    public void quitTest()
    {
        driver.quit();
    }*/

}
