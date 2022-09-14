package xunit;

public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    /**
     * 순서를 확인하기위해 개선하기위해 리팩토링하고싶다.
     */

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.log);
    }

//    public void testSetUp() {
//        Assert.assertEquals(false, wasRun.wasSetup);
//        wasRun.run();
//        Assert.assertEquals("setUp testMethod",wasRun.log);
//        Assert.assertEquals(true, wasRun.wasRun);
//    }
}
