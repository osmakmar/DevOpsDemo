package ch.zhaw.iwi.devops.stringconcatenator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringConcatenatorTest {
    @Test
    public void testConcatenateStrings() {
        StringConcatenator concatenator = new StringConcatenator();
        String str1 = "Hello, ";
        String str2 = "World!";
        String expected = "Hello, World!";
        
        String result = concatenator.concatenateStrings(str1, str2);
        
        Assertions.assertEquals(expected, result);
    }
}
