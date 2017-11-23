package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaColaborador {

    private WebDriver driver;

    @Given("^eu estou na tela de pesquisa de colaborador$")
    public void eu_estou_na_tela_de_pesquisa_de_colaborador() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/colaborador/novo");

    }

    @And("^eu digitar \"([^\"]*)\" no campo nome$")
    public void eu_digitar_no_campo_nome(String nome) {
    }

    @Then("^eu devo visualizar todos os colaboradores com o nome pesquisado$")
    public void eu_devo_visualizar_todos_os_colaboradores_com_o_nome_pesquisado() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo RG$")
    public void eu_digitar_no_campo_RG(String rg) {
    }

    @Then("^eu devo visualizar o colaborador \"([^\"]*)\" na lista de pesquisa$")
    public void eu_devo_visualizar_o_colaborador_na_lista_de_pesquisa(String nome) {
    }

    @And("^eu selecionar a opcao atendente no campo de atividade exercida$")
    public void eu_selecionar_a_opcao_atendente_no_campo_de_atividade_exercida() {
    }

    @Then("^eu devo visualizar a frase todos os colaboradores que possuem a ativadade exercida pesquisada$")
    public void eu_devo_visualizar_a_frase_todos_os_colaboradores_que_possuem_a_ativadade_exercida_pesquisada() {
    }

    @And("^eu selecionar a opcao enfermeira no campo de atividade exercida$")
    public void eu_selecionar_a_opcao_enfermeira_no_campo_de_atividade_exercida() {
    }

    @Then("^eu devo visualizar a lista com todos os colaboradores cadastrados no sistema$")
    public void eu_devo_visualizar_a_lista_com_todos_os_colaboradores_cadastrados_no_sistema() {
    }

    @Then("^eu devo visualizar o nome pesquisado na lista de resultados$")
    public void eu_devo_visualizar_o_nome_pesquisado_na_lista_de_resultados() {
    }

    @Then("^eu clicar no icone x na linha do nome pesquisado$")
    public void eu_clicar_no_icone_x_na_linha_do_nome_pesquisado() {
    }

    @Then("^eu devo visualizar uma modal com os botoes cancel e Sim exclua agora$")
    public void eu_devo_visualizar_uma_modal_com_os_botoes_cancel_e_Sim_exclua_agora() {
    }

    @Then("^eu clicar no botao Sim exclua agora$")
    public void eu_clicar_no_botao_Sim_exclua_agora() {
    }

    @Then("^eu devo ver a modal de confirmacao de exclusao$")
    public void eu_devo_ver_a_modal_de_confirmacao_de_exclusao() {
    }

    @Then("^eu devo clicar no botao ok$")
    public void eu_devo_clicar_no_botao_ok() {
    }
}
