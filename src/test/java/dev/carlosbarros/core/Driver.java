package dev.carlosbarros.core;

import dev.carlosbarros.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String nomeCenario;
    private static File diretorio;
    private static int numPrint;

    public static File getDiretorio() {
        return diretorio;
    }

    public static String getNomeCenario() {
        return nomeCenario;
    }

    public static void setNomeCenario(String nomeCenario) {
        Driver.nomeCenario = nomeCenario;
    }

    public static void criaDiretorio(){
        String caminho = "src/test/resources/evidencias";
        diretorio = new File(caminho+"/"+nomeCenario);
        diretorio.mkdir();
        numPrint = 0;
    }

    public static void printScreen(String passo) throws IOException {
        numPrint++;
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath()+"/"+numPrint+" - "+passo+".png";
        FileUtils.copyFile(file, new File(caminho));

    }

    public Driver(Browser navegador){

        switch (navegador){
            case CHROME:
                startChrome();
                break;
            case FIREFOX:
                startFirefox();
                break;
            case EDGE:
                startEdge();
                break;
            case IE:
                startIE();
                break;
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    private void startIE() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    private void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private void startSafari(){
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
    }
    private void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
    }

    private void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        chromeOptions.setHeadless(headless);

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void attributeChange(WebElement element, String attribute, String value){
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }

    public static void aguardaOptions(Select select){
        for (int i =0; i < 6; i++){
            if(select.getOptions().size() > 1){
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }


        }
    }

}
