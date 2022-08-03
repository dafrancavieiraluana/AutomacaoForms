
package com.demo.tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty","html:target/cucumber"},
		features={"src/tests/resource"},
		glue = {"path/to/steps"},
		tags = {"@test"}
		)

public class FormularioRunner {

}

