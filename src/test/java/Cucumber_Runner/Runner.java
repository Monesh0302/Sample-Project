package Cucumber_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MONESH\\eclipse-workspace\\Cucumber\\src\\test\\java\\Cucumber_Feature\\Limeroad.feature",
				glue = "Step_Definition",
				
				plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

//HtML report---> plugin= {"pretty", "html:target/cucumber-reports/report.html"}

//JSON report----> plugin= {"pretty", "json:target/cucumber-reports/report1.json"}

//xml report ----> plugin= {"pretty", "junit:target/cucumber-reports/report2.xml"}

public class Runner {
	

}
 