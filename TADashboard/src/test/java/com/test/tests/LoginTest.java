package com.test.tests;
import com.test.common.TestBase;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature/login.feature"},
        glue = {"com/test/definitions"})

public class LoginTest extends TestBase {

    @BeforeClass
    public void beforeClass() {
    }
}
