package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaPaciente {

    private WebDriver driver;

    @Given("^eu estou na tela de pesquisa de pacientes$")
    public void eu_estou_na_tela_de_pesquisa_de_pacientes() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("mudar");
    }

    @Then("^eu devo visualizar todos os pacientes com o nome pesquisado$")
    public void eu_devo_visualizar_todos_os_pacientes_com_o_nome_pesquisado() {
    }

    @Then("^eu devo visualizar o paciente \"([^\"]*)\" na lista de pesquisa$")
    public void eu_devo_visualizar_o_paciente_na_lista_de_pesquisa(String paciente) {
    }

}
