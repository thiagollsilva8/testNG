package class03;

import org.testng.annotations.*;

public class Annotation2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method");
    }

    @Test
    public void AFirstTestCase() {
        System.out.println("I am the first test case");
    }

    @Test
    public void BSecondTestCase() {
        System.out.println("I am second test case");
    }

    @Test
    public void CThirdTestCase() {
        System.out.println("I am third test case");
    }
}
