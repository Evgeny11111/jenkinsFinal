
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ProgramTest {
    @Test
    public void testMain() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            result.add(new HelloPerson("" + i).say());
        }
        List<String> expected = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            expected.add("Hello " + i);
        }
        Assertions.assertEquals(result,expected);
    }
}
