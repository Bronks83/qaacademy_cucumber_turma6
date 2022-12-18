package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driverParametro) {
        driver = driverParametro;

    }

    private String firstNameMap = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastNameMap = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String addressMap = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailMap = "//*[@id=\"eid\"]/input";
    private String phoneMap = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String genderMap = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobie1Map = "checkbox1";
    private String hobie2Map = "checkbox2";
    private String skillMap = "Skills";
    private String slctSkillMap = "XML";

    public void preencherUrl(String url) {
        driver.get(url);
    }

    public void preencherNome(String nome) {
        driver.findElement(By.xpath(firstNameMap)).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        driver.findElement(By.xpath(lastNameMap)).sendKeys(sobrenome);
    }

    public void preencherEndereco(String endereco) {
        driver.findElement(By.xpath(addressMap)).sendKeys(endereco);
    }

    public void preencherEmail(String endEmail) {
        driver.findElement(By.xpath(emailMap)).sendKeys(endEmail);
    }

    public void preencherTelefone(String phone) {
        driver.findElement(By.xpath(phoneMap)).sendKeys(phone);
    }

    public void preencherGenero() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", ""); //basta colocar um scroll automático antes do click
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.findElement(By.xpath(genderMap)).click();
    }

    public void preencherHobies() {
        driver.findElement(By.id(hobie1Map)).click();
        driver.findElement(By.id(hobie2Map)).click();
    }

    public void preencherHabilidade() {
        Select lstSkills = new Select(driver.findElement(By.id(skillMap)));
        lstSkills.selectByVisibleText(slctSkillMap);
    }


}
