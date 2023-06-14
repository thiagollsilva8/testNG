package class01;

import org.testng.annotations.*;

public class annotations {

    @Test
    public void AFirstTestCase() {
        System.out.println("Hello I am the first test case");
    }

    @Test
    public void BSecondTestCase() {
        System.out.println("I am the second test case");
    }

    @Test
    public void CThirdTestCase() {
        System.out.println("I am the third test case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method");
    }
}
