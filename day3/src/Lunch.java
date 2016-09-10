/**
 * Created by fish-Xiang on 2016/9/10.
 */

class Soup1 {
    private Soup1() {}
    // (1) allow creation via static method
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    // (2) create a static object and return a reference

    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

// Only one public class allowed per file

public class Lunch {
    void testPrivate() {
        //can't do this! private constructor
        //! Soup1 soup = Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
