package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class MedicoSteps {

    public WebDriver driver;

    public class Medico {

        public String nome;
        public String crm;
        public String telefone;
        public String email;

        public Medico(String name, String crM, String tel, String mail)
        {
            nome = name;
            crm = crM;
            telefone = tel;
            email = mail;
        }

    }

    @Given("^eu digitar as informações de medico completas$")
    public void eu_digitar_as_informações_de_medico_completas(DataTable table)
    {
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

    @Given("^eu digitar todas  as informacoes exceto nome$")
    public void eu_digitar_todas_as_informacoes_exceto_nome(DataTable table)
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

    @Given("^eu digitar todas  as informacoes exceto CRM$")
    public void eu_digitar_todas_as_informacoes_exceto_CRM(DataTable table)
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

    @Given("^eu digitar todas  as informacoes exceto especialidade$")
    public void eu_digitar_todas_as_informacoes_exceto_especialidade(DataTable arg1)
    {
        //TODO
    }

    @Given("^eu digitar todas  as informacoes exceto telefone$")
    public void eu_digitar_todas_as_informacoes_exceto_telefone(DataTable table)
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

    @Given("^eu digitar todas  as informacoes exceto email$")
    public void eu_digitar_todas_as_informacoes_exceto_email(DataTable table)
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
        //TODO
    }

    @Given("^eu clicar no botão Salvar$")
    public void eu_clicar_no_botão_Salvar()
    {
        driver.findElement(By.id("salvar")).submit();
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_especialidade_em_forma_de_alert_no_topo_da_página()
    {

    }

    @Then("^eu devo visualizar a mensagem “Médico salvo com sucesso”$")
    public void eu_devo_visualizar_a_mensagem_Médico_salvo_com_sucesso()
    {
    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_médico_em_forma_de_alert_no_topo_da_página()
    {
    }
}
