package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.utils.KillBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddRule;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.*;

import static java.lang.Thread.sleep;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class EvalartStepDefinitions {

    //WebDriver driver = new ChromeDriver();


    @Before
    public void initialConfigurationDektop(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = getDriver();
        //driver.get("http://www.google.com");
        //Set<Cookie> cookies = driver.manage().getCookies();
        //System.out.println("Numero de cookies: " + cookies.size());
        //System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        //System.out.println(driver.manage().getCookies().size());
        //driver.get("http://www.google.com");
        OnStage.setTheStage(new OnlineCast());


    }


    @After
    public static <list> void CloseDriver() throws IOException, InterruptedException {
        System.out.println("entramos al after");
        int numerodrivers=SerenityWebdriverManager.inThisTestThread().getActiveWebdriverCount();
        System.out.println("cantidad de driver activos: "+numerodrivers);

        //driveractivos
        Map<String, WebDriver> drivers = SerenityWebdriverManager.inThisTestThread().getActiveDriverMap();
        for (Map.Entry<String, WebDriver>  driver : drivers.entrySet()) {
            System.out.println("key = " + driver.getKey() + ", Value = " + driver.getValue());
            driver.getValue();
        }


        //driver actual
        List<String> browser_abiertos = Collections.singletonList(SerenityWebdriverManager.inThisTestThread().getCurrentDriverName());
        for (String browser:browser_abiertos) {
            System.out.println(""+browser);
        }

        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Given("i enter to evalart test")
    public void iEnterToEvalartTest() {
        OnStage.theActorCalled("cristian").wasAbleTo(
                Open.url("https://questionnaire.evalart.com/user/login/")
        );
        //System.out.println(driver.manage().getCookies().size());
        /*System.out.println("entramos al give");
        WebDriver driver = new ChromeDriver();
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Numero de cookies: " + cookies.size());*/
    }


    @When("resolve the automation")
    public void resolveTheAutomation() {
        System.out.println("\n \n \n \n \n \n \n \n caso 0\n \n \n \n \n \n \n \n" );
        //
    }
    @When("resolve the automationuno")
    public void resolveTheAutomationuno() {

        System.out.println("\n \n \n \n \n \n \n \n caso 1 \n \n \n \n \n \n \n \n" );
        //
    }

    @When("resolve the automationcuatro")
    public void resolveTheAutomationcuatro() {

        System.out.println("\n \n \n \n \n \n \n \n caso 4 \n \n \n \n \n \n \n \n" );
        //
    }


    @When("resolve the automationdos")
    public void resolveTheAutomationdos()  {

        System.out.println("\n \n \n \n \n \n \n \n caso 2 \n \n \n \n \n \n \n \n" );
  /*      try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

   */
        //
    }


    @Then("i get the hash code")
    public void iGetTheHashCode() {
        //
    }
}
