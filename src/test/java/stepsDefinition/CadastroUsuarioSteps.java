package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class CadastroUsuarioSteps {

    public WebDriver driver;

    private class Usuario {

        private String nome;
        private String email;
        private String dataNascimento;
        private String senha;
        private String confirmaSenha;

        private Usuario (String name, String mail, String nasc, String pwd, String confirmaPwd)
        {
            nome = name;
            email = mail;
            dataNascimento = nasc;
            senha = pwd;
            confirmaSenha = confirmaPwd;
        }

    }

    @Given("^eu estou na tela de cadastro de usuarios$")
    public void eu_estou_na_tela_de_cadastro_de_usuarios() {

        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/saude/login");
        driver.findElement(By.name("username")).sendKeys("admin@saude.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.id("entrar")).submit();
        driver.navigate().to("http://localhost:8080/saude/usuarios/novo");

    }

    @And("^eu digitar as informacoes de usuario completas$")
    public void eu_digitar_as_informacoes_de_usuario_completas(DataTable table)  {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("nome")).sendKeys(usuario.nome);
            driver.findElement(By.id("email")).sendKeys(usuario.email);
            driver.findElement(By.id("dataNascimento")).sendKeys(usuario.dataNascimento);
            driver.findElement(By.id("senha")).sendKeys(usuario.senha);
            driver.findElement(By.id("confirmacaoSenha")).sendKeys(usuario.confirmaSenha);
        }

    }

    @And("^eu digitar todas  as informacoes do usuario exceto nome$")
    public void eu_digitar_todas_as_informacoes_do_usuario_exceto_nome(DataTable table) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("email")).sendKeys(usuario.email);
            driver.findElement(By.id("dataNascimento")).sendKeys(usuario.dataNascimento);
            driver.findElement(By.id("senha")).sendKeys(usuario.senha);
            driver.findElement(By.id("confirmacaoSenha")).sendKeys(usuario.confirmaSenha);
        }
    }

    @And("^eu digitar todas  as informacoes do usuario exceto email$")
    public void eu_digitar_todas_as_informacoes_do_usuario_exceto_email(DataTable table) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("nome")).sendKeys(usuario.nome);
            driver.findElement(By.id("dataNascimento")).sendKeys(usuario.dataNascimento);
            driver.findElement(By.id("senha")).sendKeys(usuario.senha);
            driver.findElement(By.id("confirmacaoSenha")).sendKeys(usuario.confirmaSenha);
        }

    }

    @And("^eu digitar todas  as informacoes do usuario exceto data de nascimento$")
    public void eu_digitar_todas_as_informacoes_do_usuario_exceto_data_de_nascimento(DataTable table) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("nome")).sendKeys(usuario.nome);
            driver.findElement(By.id("email")).sendKeys(usuario.email);
            driver.findElement(By.id("senha")).sendKeys(usuario.senha);
            driver.findElement(By.id("confirmacaoSenha")).sendKeys(usuario.confirmaSenha);
        }

    }

    @And("^eu digitar todas  as informacoes do usuario exceto senha$")
    public void eu_digitar_todas_as_informacoes_do_usuario_exceto_senha(DataTable table) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("nome")).sendKeys(usuario.nome);
            driver.findElement(By.id("email")).sendKeys(usuario.email);
            driver.findElement(By.id("dataNascimento")).sendKeys(usuario.dataNascimento);
            driver.findElement(By.id("confirmacaoSenha")).sendKeys(usuario.confirmaSenha);
        }

    }

    @And("^eu digitar as informacoes do usuario exceto confirmacao de senha$")
    public void eu_digitar_as_informacoes_do_usuario_exceto_confirmacao_de_senha(DataTable table) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = table.asList(Usuario.class);

        for(Usuario usuario : usuarios)
        {
            driver.findElement(By.id("nome")).sendKeys(usuario.nome);
            driver.findElement(By.id("email")).sendKeys(usuario.email);
            driver.findElement(By.id("dataNascimento")).sendKeys(usuario.dataNascimento);
            driver.findElement(By.id("senha")).sendKeys(usuario.senha);
        }

    }

    @And("^eu clicar no botao de status$")
    public void eu_clicar_no_botao_de_status() {

        driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div[3]/div[3]/div/div/div/span[3]")).click();

    }

    @And("^eu escolher um grupo$")
    public void eu_escolher_um_grupo() {

    }
}
