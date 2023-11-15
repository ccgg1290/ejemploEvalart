package co.com.choucair.ejemplo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/evalart.feature",
        glue = "co.com.choucair.ejemplo.stepdefinitions",
        tags = "@testEvalart",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class EvalartRunner {
}
