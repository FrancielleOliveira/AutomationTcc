package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroConsultaSteps {

    private WebDriver driver;

    @Given("^eu estou na tela de cadastro de consultas$")
    public void eu_estou_na_tela_de_cadastro_de_consultas() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/consultas/novo");
    }

    @And("^eu clicar na lupa do campo Paciente$")
    public void eu_clicar_na_lupa_do_campo_Paciente() {

        driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div[1]/div/div/span/button")).click();

    }

    @And("^eu digitar \"([^\"]*)\" no campo nome da modal de pesquisa de pacientes$")
    public void eu_digitar_no_campo_nome_da_modal_de_pesquisa_de_pacientes(String paciente) {

        driver.findElement(By.id("nomePacienteModal")).sendKeys(paciente);

    }

    @And("^eu clicar no nome do paciente que sera retornado na lista$")
    public void eu_clicar_no_nome_do_paciente_que_sera_retornado_na_lista() {

        driver.findElement(By.xpath("//*[@id=\"containerTabelaPesquisaPacientes\"]/div/table/tbody/tr[1]/td[1]")).click();
    }

    @And("^eu clicar na lupa do campo Medico$")
    public void eu_clicar_na_lupa_do_campo_Medico() {

        driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div[2]/div/div/span/button")).click();
    }

    @And("^eu digitar \"([^\"]*)\" no campo nome da modal de pesquisa de medicos$")
    public void eu_digitar_no_campo_nome_da_modal_de_pesquisa_de_medicos(String medico) {

        driver.findElement(By.id("nomeMedico")).sendKeys(medico);
    }

    @And("^eu clicar no nome do medico que sera retornado na lista$")
    public void eu_clicar_no_nome_do_medico_que_sera_retornado_na_lista() {

        driver.findElement(By.xpath("//*[@id=\"containerTabelaPesquisaMedicos\"]/div/table/tbody/tr/td[1]")).click();
    }

    @And("^eu digitar \"([^\"]*)\" no campo descricao$")
    public void eu_digitar_no_campo_descricao(String descricao) {

        driver.findElement(By.id("descricao")).sendKeys(descricao);
    }

    @And("^eu clicar no botao pesquisar paciente$")
    public void eu_clicar_no_botao_pesquisar_paciente() {

        driver.findElement(By.className("btn  btn-primary js-pesquisa-rapida-paciente-btn")).click();

    }

    @And("^eu clicar no botao pesquisar medico")
    public void eu_clicar_no_botao_pesquisar_medico() {

        driver.findElement(By.className("btn  btn-primary js-pesquisa-rapida-medico-btn")).click();
    }
}
