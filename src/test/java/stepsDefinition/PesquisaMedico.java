package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaMedico {

    private WebDriver driver;

    @Given("^eu estou na tela de pesquisa de medicos$")
    public void eu_estou_na_tela_de_pesquisa_de_medicos() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/mudar/novo");
    }

    @Then("^eu devo visualizar todos os medicos com o nome pesquisado$")
    public void eu_devo_visualizar_todos_os_medicos_com_o_nome_pesquisado() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo crm$")
    public void eu_digitar_no_campo_crm(String crm) {
    }

    @Then("^eu devo visualizar o medico \"([^\"]*)\" na lista de pesquisa$")
    public void eu_devo_visualizar_o_medico_na_lista_de_pesquisa(String medico) {
    }

    @And("^eu digitar \"([^\"]*)\" no campo cpf$")
    public void eu_digitar_no_campo_cpf(String cpf) {
    }

    @And("^eu selecionar a opcao Clinico no campo especialidade$")
    public void eu_selecionar_a_opcao_Clinico_no_campo_especialidade() {
    }

    @Then("^eu devo visualizar todos os medicos que estao cadastrados com a especialidade pesquisada$")
    public void eu_devo_visualizar_todos_os_medicos_que_estao_cadastrados_com_a_especialidade_pesquisada() {
    }
}
