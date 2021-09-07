package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="E:\\SELENIUM NEW\\BDDWITHDATATABLE\\src\\test\\resources\\FeatureFILE"
,glue="stepDefination"
,monochrome=true
,publish=true)

public class Runner {

}
