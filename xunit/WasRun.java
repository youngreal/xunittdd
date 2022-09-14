package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public String log;

    @Override
    public void setUp() {
        log = "setUp";
    }

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        log += " testMethod";
    }

    public void testBrokenMethod() {
        throw new AssertionError();
    }

    @Override
    public void tearDown() {
        log += " tearDown";
    }
}
