package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 4)
    public void Atest() {
        System.out.println("I am A test");
    }

    @Test(priority = 3)
    public void Btest() {
        System.out.println("I am B test");
    }

    @Test(priority = 2)
    public void Ctest() {
        System.out.println("I am C test");
    }

    @Test(priority = 1)
    public void Dtest() {
        System.out.println("I am D test");
    }

    // NO priority mentioned means 0, highest priority
    @Test
    public void ABtest() {
        System.out.println("I am AB test");
    }
}
