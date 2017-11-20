package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class CadastroColaboradorSteps {

    private WebDriver driver;

    private class Colaborador {

        private String nome;
        private String cpf;
        private String rg;
        private String dataNascimento;
        private String telefone;

        private Colaborador(String name, String CPF, String RG, String nasc, String tel)
        {
            nome = name;
            cpf = CPF;
            rg = RG;
            dataNascimento = nasc;
            telefone = tel;
        }

    }

    @Given("^eu estou na tela de cadastro de colaborador$")
    public void euEstouNaTelaDeCadastroDeColaborador() {
        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/colaboradores/novo");

    }

    @Given("^eu digitar as informacoes do colaborador completas$")
    public void eu_digitar_as_informacoes_do_colaborador_completas(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("nome")).sendKeys(colaborador.nome);
            driver.findElement(By.id("cpf")).sendKeys(colaborador.cpf);
            driver.findElement(By.id("rg")).sendKeys(colaborador.rg);
            driver.findElement(By.id("dataNascimento")).sendKeys(colaborador.dataNascimento);
            driver.findElement(By.id("telefone")).sendKeys(colaborador.telefone);
        }

    }

    @And("^eu digitar todas  as informacoes do colaborador exceto nome$")
    public void eu_digitar_todas_as_informacoes_do_colaborador_exceto_nome(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("cpf")).sendKeys(colaborador.cpf);
            driver.findElement(By.id("rg")).sendKeys(colaborador.rg);
            driver.findElement(By.id("dataNascimento")).sendKeys(colaborador.dataNascimento);
            driver.findElement(By.id("telefone")).sendKeys(colaborador.telefone);
        }
    }

    @And("^eu digitar todas  as informacoes do colaborador exceto CPF$")
    public void eu_digitar_todas_as_informacoes_do_colaborador_exceto_CPF(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("nome")).sendKeys(colaborador.nome);
            driver.findElement(By.id("rg")).sendKeys(colaborador.rg);
            driver.findElement(By.id("dataNascimento")).sendKeys(colaborador.dataNascimento);
            driver.findElement(By.id("telefone")).sendKeys(colaborador.telefone);
        }

    }

    @And("^eu digitar todas  as informacoes do colaborador exceto rg$")
    public void eu_digitar_todas_as_informacoes_do_colaborador_exceto_rg(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("nome")).sendKeys(colaborador.nome);
            driver.findElement(By.id("cpf")).sendKeys(colaborador.cpf);
            driver.findElement(By.id("dataNascimento")).sendKeys(colaborador.dataNascimento);
            driver.findElement(By.id("telefone")).sendKeys(colaborador.telefone);
        }

    }

    @And("^eu digitar todas  as informacoes do colaborador exceto data de nascimento$")
    public void eu_digitar_todas_as_informacoes_do_colaborador_exceto_data_de_nascimento(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("nome")).sendKeys(colaborador.nome);
            driver.findElement(By.id("cpf")).sendKeys(colaborador.cpf);
            driver.findElement(By.id("rg")).sendKeys(colaborador.rg);
            driver.findElement(By.id("telefone")).sendKeys(colaborador.telefone);
        }
    }

    @And("^eu digitar todas  as informacoes do colaborador exceto telefone$")
    public void euDigitarTodasAsInformacoesDoColaboradorExcetoTelefone(DataTable table) {

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores = table.asList(Colaborador.class);

        for(Colaborador colaborador : colaboradores)
        {
            driver.findElement(By.id("nome")).sendKeys(colaborador.nome);
            driver.findElement(By.id("cpf")).sendKeys(colaborador.cpf);
            driver.findElement(By.id("rg")).sendKeys(colaborador.rg);
            driver.findElement(By.id("dataNascimento")).sendKeys(colaborador.dataNascimento);
        }
    }

    @And("^eu escolher a atividade exercida$")
    public void eu_escolher_a_atividade_exercida() {

    }

}
