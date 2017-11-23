package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroTriagemSteps {

    private WebDriver driver;

    @Given("^eu estou na tela de cadastro da triagem$")
    public void eu_estou_na_tela_de_cadastro_da_triagem() {
        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/triagens/novo");
    }

    @And("^eu marcar os sintomas na aba Primeira Etapa$")
    public void eu_marcar_os_sintomas_na_aba_Primeira_Etapa() {

        driver.findElement(By.xpath("//*[@id=\"calafrio\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"diabetes\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dorCabeca\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dorCorpo\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"hepatite\"]")).click();
    }

    @And("^eu clicar na aba Segunda etapa$")
    public void eu_clicar_na_aba_Segunda_etapa() {

        driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div[2]/div/ul/li[2]/a")).click();
    }

    @And("^eu marcar os sintomas na aba Segunda Etapa$")
    public void eu_marcar_os_sintomas_na_aba_Segunda_Etapa() {

        driver.findElement(By.xpath("//*[@id=\"alergia\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dst\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pressao\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"problemaCardiaco\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"problemaRespiratorio\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"medicacao\"]")).click();
    }


}
