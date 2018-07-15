package TestRunner1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",glue="TestCode")
public class TestRunner {

}
