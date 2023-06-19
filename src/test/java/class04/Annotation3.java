package class04;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotation3 {

    @BeforeTest
    public void BeforeTest() {
        System.out.println("I am before test");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("I am after test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am after suite");
    }
}
