package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaUsuario {

    private WebDriver driver;

    @Given("^eu estou na tela de pesquisa de usuario$")
    public void eu_estou_na_tela_de_pesquisa_de_usuario() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("mudar user");
    }

    @Then("^eu devo visualizar todos os usuarios com o nome pesquisado$")
    public void eu_devo_visualizar_todos_os_usuarios_com_o_nome_pesquisado() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo Email$")
    public void eu_digitar_no_campo_Email(String email) {
    }

    @Then("^eu devo visualizar o usuario \"([^\"]*)\" na lista de pesquisa$")
    public void eu_devo_visualizar_o_usuario_na_lista_de_pesquisa(String user) {
    }

    @And("^eu clicar na opcao Administrador na secao Grupos$")
    public void eu_clicar_na_opcao_Administrador_na_secao_Grupos() {
    }

    @Then("^eu devo visualizar todos os usuarios que fazem parte do grupo Administrador$")
    public void eu_devo_visualizar_todos_os_usuarios_que_fazem_parte_do_grupo_Administrador() {
    }

    @And("^eu clicar na opcao Medico na secao Grupos$")
    public void eu_clicar_na_opcao_Medico_na_secao_Grupos() {
        
    }

    @Then("^eu devo visualizar todos os usuarios que fazem parte do grupo Medico$")
    public void eu_devo_visualizar_todos_os_usuarios_que_fazem_parte_do_grupo_Medico() {
    }

    @And("^eu clicar na opcao Colaborador na secao Grupos$")
    public void eu_clicar_na_opcao_Colaborador_na_secao_Grupos() {
    }

    @Then("^eu devo visualizar todos os usuarios que fazem parte do grupo Colaborador$")
    public void eu_devo_visualizar_todos_os_usuarios_que_fazem_parte_do_grupo_Colaborador() {
    }
}
