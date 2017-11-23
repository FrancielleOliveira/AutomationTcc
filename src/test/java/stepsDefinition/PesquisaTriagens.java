package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PesquisaTriagens {

    private WebDriver driver;
    


    @Given("^eu estou na tela de pesquisa de triagens$")
    public void eu_estou_na_tela_de_pesquisa_de_triagens() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("mudarrrr");
    }

    @Then("^eu devo visualizar o campo Nome$")
    public void eu_devo_visualizar_o_campo_Nome() {
    }

    @Then("^eu devo visualizar o campo CPF$")
    public void eu_devo_visualizar_o_campo_CPF() {
    }

    @Then("^eu devo visualizar o campo Data de criacao$")
    public void eu_devo_visualizar_o_campo_Data_de_criacao() {
    }

    @Then("^eu devo visualizar o campo ate$")
    public void eu_devo_visualizar_o_campo_ate() {
    }

    @Then("^eu devo visualizar o botao Pesquisar$")
    public void eu_devo_visualizar_o_botao_Pesquisar() {
    }

    @Then("^eu devo visualizar uma tabela com os campos$")
    public void eu_devo_visualizar_uma_tabela_com_os_campos(DataTable table) {
    }


    @Then("^eu devo visualizar uma lista com todas as triagens cadastradas no sistema$")
    public void eu_devo_visualizar_uma_lista_com_todas_as_triagens_cadastradas_no_sistema() {
    }

    @Then("^eu devo visualizar uma lista com todos os pacientes que possui o nome pesquisado$")
    public void eu_devo_visualizar_uma_lista_com_todos_os_pacientes_que_possui_o_nome_pesquisado() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo CPF$")
    public void eu_digitar_no_campo_CPF(String cpf) {
    }

    @Then("^eu devo visualizar uma lista com todos os pacientes que possui o cpf pesquisado$")
    public void eu_devo_visualizar_uma_lista_com_todos_os_pacientes_que_possui_o_cpf_pesquisado() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo data de criacao$")
    public void eu_digitar_no_campo_data_de_criacao(String arg1) {
    }

    @Then("^eu devo visualizar uma lista com todas as triagens que foram criadas na data informada$")
    public void eu_devo_visualizar_uma_lista_com_todas_as_triagens_que_foram_criadas_na_data_informada() {
    }

    @And("^eu digitar \"([^\"]*)\" no campo ate$")
    public void eu_digitar_no_campo_ate(String ate) {
    }

    @Then("^eu devo visualizar uma lista com todas as triagens que foram criadas no periodo informado$")
    public void eu_devo_visualizar_uma_lista_com_todas_as_triagens_que_foram_criadas_no_periodo_informado() {
    }

    @And("^eu clicar no icone de pontos na linha do paciente encontrado$")
    public void eu_clicar_no_icone_de_pontos_na_linha_do_paciente_encontrado() {
    }

    @Then("^eu devo visualizar a tela com todas as informacoes da triagem do paciente$")
    public void eu_devo_visualizar_a_tela_com_todas_as_informacoes_da_triagem_do_paciente() {
    }

}
