package notes;

public class Day17_Notes {
}
/*
*****What is cucumber framework?
-Cucumber is a BDD(Behavior-driven development) framework
*****Why did you use cucumber?
-Reusable feature files
-Less Java code overall because of the reusable step-definition
-Visual cucumber reports
-Understandable feature files even for non-technical people
*****What is a Feature File?
1. Feature Files are used to describe the behaviour of the application
2. It is written Gherkin language
    -Feature
    -Scenario
    -Scenario Outline
    -Example
    -Background
    -Given,When,And,Then,But,*
    -@Tag
--------------------------------
*****Step Definitions FILE
-Under stepdefinitions folder, create a class:

package stepdefinitions;
public class Day17_GoogleSearchStepDefinitions {
    /*This step definition class will have JAVA CODE
    *
}
----------------------------------
        *****Runner FILE
-Runner class is used to run the feature files
-Under runners > Create a JAVA class :
--------------------------------------
NOTE:
    IF YOU SEE io.cucumber.junit.UndefinedStepException:
        THEN YOU HAVE MISSING STEP DEFINITION
    IT MEANS YOU HAVE A STEP THAT DOES NOT HAVE A JAVA CODE
        SOLUTION: COPY THE STEP DEFINITION ANS PASTE IN THE STEP DEFINITION CLASS
 */
