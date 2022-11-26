package register;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertOkPage {
    private String url = "https://demo.automationtesting.in/Alerts.html";
    private String alertBtn = "//*[@id=\"OKTab\"]/button";
    private String textoAlert = "alert.getText()";
    private String okBtn = "alert.accept()";
    private String textoInvalido = "Texto Inválido";
    private String textoValido = "I am an alert box!";

    public void preencherUrl(WebDriver driver) {
        driver.get(url);
    }
    public void clicarBotao(WebDriver driver) {
        driver.findElement(By.xpath(alertBtn)).click();
    }
    public void capturarAlert(WebDriver driver){
        Alert alert = driver.switchTo().alert();
        String textoAlert = alert.getText();
        Assert.assertEquals(textoInvalido,textoValido,textoAlert);
        alert.accept();
        driver.quit();
    }
//    public void clicarBotaoOk(WebDriver driver){
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        driver.quit();
//
//    }


}
