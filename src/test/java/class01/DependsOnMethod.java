package class01;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void Login() {
        System.out.println("I am testing login page");
        // System.out.println(10/0); ==> if login method does not work, the depends on method will not run.
    }

    @Test(dependsOnMethods = {"Login"})
    public void TestTheDashBoardPage() {
        System.out.println("I am testing dashboard page");
    }
}
