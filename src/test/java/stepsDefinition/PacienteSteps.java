package stepsDefinition;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class PacienteSteps{


    public WebDriver driver;

    public PacienteSteps()
    {
        driver = Hook.driver;
    }

       public class Paciente {
        public String nome;
        public String cpf;
        public String telefone;
        public String email;
        public String logradouro;
        public String numero;
        public String complemento;
        public String cep;
        public String cidadeUF;

        //construtor
        public Paciente(String name, String cpF, String tel,
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

    @Given("^eu digitar as informações de paciente completas$")
    public void eu_digitar_as_informações_de_paciente_completas(DataTable table) {

        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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

    @And("^eu digitar as informações do paciente exceto nome$")
    public void euDigitarAsInformaçõesDoPacienteExcetoNome(DataTable table)
    {

        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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
    public void euDigitarTodasAsInformacoesDoPacienteExcetoCPF(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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
    public void euDigitarTodasAsInformacoesDoPacienteExcetoTefone(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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

    @Given("^eu digitar todas  as informacoes do paciente exceto email$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_email(DataTable table) {

        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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


    @Given("^eu digitar todas  as informacoes do paciente exceto logradouro$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_logradouro(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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

    @Given("^eu digitar todas  as informacoes do paciente exceto numero$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_numero(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

            driver.findElement(By.id("nome")).sendKeys(paciente.nome);
            driver.findElement(By.id("cpf")).sendKeys(paciente.cpf);
            driver.findElement(By.id("telefone")).sendKeys(paciente.telefone);
            driver.findElement(By.id("email")).sendKeys(paciente.email);
            driver.findElement(By.id("logradouro")).sendKeys(paciente.logradouro);
            driver.findElement(By.id("complemento")).sendKeys(paciente.complemento);
            driver.findElement(By.id("cep")).sendKeys(paciente.cep);
            driver.findElement(By.id("cidadeUf")).sendKeys(paciente.cidadeUF);
        }
    }

    @Given("^eu digitar todas  as informacoes do paciente exceto cep$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_cep(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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

    @Given("^eu digitar todas  as informacoes do paciente exceto cidadeUF$")
    public void eu_digitar_todas_as_informacoes_do_paciente_exceto_cidadeUF(DataTable table)
    {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = table.asList(Paciente.class);

        for(Paciente paciente : pacientes) {

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

    @And("^eu selecionar uma opção para dependentes$")
    public void euSelecionarUmaOpçãoParaDependentes() {
        WebElement radioBtn = driver.findElement(By.name("dependentes"));
        radioBtn.click();
    }

/*
    @Given("^eu clicar no botão Salvar$")
    public void eu_clicar_no_botão_Salvar() throws Throwable {
        driver.findElement(By.id("salvar")).submit();

    }*/

    @Then("^eu devo visualizar a mensagem “Paciente salvo com sucesso”$")
    public void eu_devo_visualizar_a_mensagem_Paciente_salvo_com_sucesso() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo cep” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_cep_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo numero” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_numero_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo logradouro” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_logradouro_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo cidadeUF” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_cidadeUF_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo CPF” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_CPF_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_email_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_nome_em_forma_de_alert_no_topo_da_página()  {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_CRM_em_forma_de_alert_no_topo_da_página() {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_telefone_em_forma_de_alert_no_topo_da_página() {
    }

}
