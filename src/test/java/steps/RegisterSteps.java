package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.RegisterPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;

    @Before("@register")
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @After("@register")
    public void fecharBrowser() {
        driver.quit();
    }

    @AfterStep("@register")
    public void print() {
        TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
        byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        InputStream printStream = new ByteArrayInputStream(printBytes);
        Allure.addAttachment("Register", printStream);
    }

    @Dado("que eu acesse o site Register")
    public void queEuAcesseOSiteRegister() {
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @Quando("preencho o campo nome com valor {string} e sobrenome com valor {string}")
    public void preenchoOCampoNomeComValorESobrenomeComValor(String nome, String sobrenome) {
        registerPage = new RegisterPage(driver);
        registerPage.preencherNome(nome);
        registerPage.preencherSobrenome(sobrenome);
    }

    @E("preencho o campo endereco com valor {string}")
    public void preenchoOCampoEnderecoComValor(String endereco) {
        registerPage.preencherEndereco(endereco);
    }

    @E("preencho o campo email com valor {string}")
    public void preenchoOCampoEmailComValor(String email) {
        registerPage.preencherEmail(email);
    }

    @E("preencho o campo telefone com valor {string}")
    public void preenchoOCampoTelefoneComValor(String telefone) {
        registerPage.preencherTelefone(telefone);
    }

    @E("clico no campo genero com valor Male")
    public void clicoNoCampoGeneroComValorMale() {
        registerPage.preencherGenero();
    }

    @E("clico no campo hobie{int} com valor Cricket e clico no campo hobie{int} com valor Movies")
    public void clicoNoCampoHobieComValorCricketEClicoNoCampoHobieComValorMovies(int hobie1, int hobie2) {
        registerPage.preencherHobies();
    }

    @E("clico no campo habilidade com valor XML")
    public void clicoNoCampoHabilidadeComValorXML() {
        registerPage.preencherHabilidade();
    }
}

