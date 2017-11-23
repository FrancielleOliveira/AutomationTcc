package stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mensagens {

    public WebDriver driver;

    @Then("^eu devo visualizar a mensagem \"([^\"]*)\" em forma de alert no topo da pagina$")
    public void eu_devo_visualizar_a_mensagem_em_forma_de_alert_no_topo_da_pagina(String msg) {

    }

    @Then("^eu devo visualizar a frase \"([^\"]*)\"$")
    public void eu_devo_visualizar_a_frase(String frase) {
    }

    @Then("^eu devo visualizar a mensagem \"([^\"]*)\"$")
    public void eu_devo_visualizar_a_mensagem(String msg) throws Throwable {
    }
}
