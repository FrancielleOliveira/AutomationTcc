package stepsDefinition;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class CadastroPacienteSteps {

    private WebDriver driver;

    private class Paciente {
        private String nome;
        private String cpf;
        private String telefone;
        private String email;
        private String logradouro;
        private String numero;
        private String complemento;
        private String cep;
        private String cidadeUF;

        //construtor
        private Paciente(String name, String cpF, String tel,
                        String mail, String log, String num, String comp,
                        String ceP, String cidade) {

            nome = name;
            cpf = cpF;
            telefone = tel;
            email = mail;
            logradouro = log;
            numero = num;
            complemento = comp;
            cep = ceP;
            cidadeUF = cidade;
        }
    }


    @Given("^eu estou na tela de cadastro de paciente$")
    public void eu_estou_na_tela_de_cadastro_de_paciente() {
        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/pacientes/novo");

    }

    @And("^eu digitar as informacoes de paciente completas$")
    public void eu_digitar_as_informacoes_de_paciente_completas(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar as informacoes do paciente exceto nome$")
    public void eu_digitar_as_informacoes_do_paciente_exceto_nome(DataTable table) {
            List<Paciente> pacientes = new ArrayList<Paciente>();
            pacientes = table.asList(Paciente.class);

            for (Paciente paciente : pacientes) {

                driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
                driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
                driver.findElement(By.id("email")).sendKeys(paciente.email);
                driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
                driver.findElement(By.id("numero")).sendKeys(paciente.numero);
                driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
                driver.findElement(By.id("cep")).sendKeys(paciente.cep);
                driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
            }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto CPF$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_CPF(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto tefone$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_tefone(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto email$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_email(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto logradouro$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_logradouro(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }


    @And("^eu digitar todas  as informacoes do paciente exceto numero$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_numero(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("numero")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto cep$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_cep(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }

    }

    @And("^eu digitar todas  as informacoes do paciente exceto cidadeUF$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_cidadeUF(DataTable table) {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for (Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("numero")).sendKeys(paciente.numero);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
        }

    }

    @And("^eu clicar no botao Salvar$")
    public void eu_clicar_no_botao_Salvar() {

        driver.findElement(By.className("btn  btn-primary")).submit();

    }



}
