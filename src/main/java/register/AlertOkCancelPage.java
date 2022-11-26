//package register;
//
//import org.junit.Assert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class AlertOkCancelPage {
//    private String Url = "https://demo.automationtesting.in/Alerts.html";
//    private String LinkOkCancel = "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a";
//    private String BotaoConfirmBox = "//*[@id=\"CancelTab\"]/button";
//    private String BotaoCancelar = "//*[@id=\"demo\"]";
//
//    public void preencherUrl(WebDriver driver) {
//        driver.get(Url);
//    }
//    public void clicarLinkOkCancel(WebDriver driver){
//        driver.findElement(By.xpath(LinkOkCancel)).click();
//    }
//    public void clicarBotaoConfirmacao (WebDriver driver){
//        Alert alert = driver.switchTo().alert();
//        String textoAlert = alert.getText();
//        Assert.assertEquals("Texto alert inválido", "Press a Button !", textoAlert);
//        alert.dismiss();
//    }
//    public void clicarCancelar (WebDriver driver){
//        String textoAlert2 = driver.findElement(By.xpath(BotaoCancelar).
//        Assert.assertEquals("Texto alert inválido", "You Pressed Cancel", textoAlert2);
//        Thread.sleep(5000);
//        driver.quit();
//    }
//
//
//}
