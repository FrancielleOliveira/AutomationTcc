package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CadastroMedicoSteps {

    private WebDriver driver;

    public class Medico {

        private String nome;
        private String crm;
        private String telefone;
        private String email;

        public Medico(String name, String crM, String tel, String mail)
        {
            nome = name;
            crm = crM;
            telefone = tel;
            email = mail;
        }

    }

    @Given("^eu estou na tela de cadastro de medico$")
    public void eu_estou_na_tela_de_cadastro_de_medico() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/medicos/novo");

    }

    @And("^eu digitar as informacoes de medico completas$")
    public void eu_digitar_as_informacoes_de_medico_completas(DataTable table) {
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = table.asList(Medico.class);

        for(Medico medico : medicos)
        {
            driver.findElement(By.id("nome")).sendKeys(medico.nome);
            driver.findElement(By.id("crm")).sendKeys(medico.crm);
            driver.findElement(By.id("telefone")).sendKeys(medico.telefone);
            driver.findElement(By.id("email")).sendKeys(medico.email);
        }

    }

    @And("^eu digitar todas  as informacoes do medico exceto nome$")
    public void eu_digitar_todas_as_informacoes_do_medico_exceto_nome(DataTable table)
    {
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = table.asList(Medico.class);

        for(Medico medico : medicos)
        {
            driver.findElement(By.id("crm")).sendKeys(medico.crm);
            driver.findElement(By.id("telefone")).sendKeys(medico.telefone);
            driver.findElement(By.id("email")).sendKeys(medico.email);
        }

    }

    @And("^eu digitar todas  as informacoes do medico exceto CRM$")
    public void eu_digitar_todas_as_informacoes_do_medico_exceto_CRM(DataTable table)
    {
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = table.asList(Medico.class);

        for(Medico medico : medicos)
        {
            driver.findElement(By.id("nome")).sendKeys(medico.nome);
            driver.findElement(By.id("telefone")).sendKeys(medico.telefone);
            driver.findElement(By.id("email")).sendKeys(medico.email);
        }
    }

    @And("^eu digitar todas  as informacoes do medico exceto telefone$")
    public void eu_digitar_todas_as_informacoes_do_medico_exceto_telefone(DataTable table)
    {
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = table.asList(Medico.class);

        for(Medico medico : medicos)
        {
            driver.findElement(By.id("nome")).sendKeys(medico.nome);
            driver.findElement(By.id("crm")).sendKeys(medico.crm);
            driver.findElement(By.id("email")).sendKeys(medico.email);
        }
    }

    @And("^eu digitar todas  as informacoes do medico exceto email$")
    public void eu_digitar_todas_as_informacoes_do_medico_exceto_email(DataTable table)
    {
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = table.asList(Medico.class);

        for(Medico medico : medicos)
        {
            driver.findElement(By.id("nome")).sendKeys(medico.nome);
            driver.findElement(By.id("crm")).sendKeys(medico.crm);
            driver.findElement(By.id("telefone")).sendKeys(medico.telefone);
        }
    }

     @And("^eu escolher uma especialidade$")
    public void euEscolherUmaEspecialidade()
    {
        Select dropdown = new Select(driver.findElement(By.id("tipoEspecialista")));
        dropdown.selectByVisibleText("Cardiologista");

    }

}
