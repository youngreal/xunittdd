package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test{
    List<Test> tests = new ArrayList<>();

    public void add(Test test) {
        tests.add(test);
    }

    /**
     * 이전과 같이 테스트 하나씩 반환하는게 아니라 테스트를 누적시켜서 반환해야한다. 어떻게하지?
     */
    public void run(TestResult result) {
        tests.forEach(t -> {
            t.run(result);
        });
    }
}
