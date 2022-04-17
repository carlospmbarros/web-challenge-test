package dev.carlosbarros.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@allTests",
        glue = "dev.carlosbarros.steps",
        plugin = {"json:target/reports/CucumberReports.json",
                "html:src/test/resources/reports/report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {

}
