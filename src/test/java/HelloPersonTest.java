package test.java;

import main.java.HelloPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloPersonTest {
    @Test
    public void testSay() {
        String name = "Make";
        Assertions.assertEquals(new HelloPerson(name).say(),"Hello Make");
    }
}
