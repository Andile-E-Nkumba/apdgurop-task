package LargerInteger.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import LargerInteger.main.LargerInteger;

public class LargerIntegerTest {
    @Test
    public void testLargerInteger() {
        String input = "5\n10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        LargerInteger.main(new String[0]);
        String output = out.toString();
        assertEquals("Enter the first integer: \nEnter the second integer: \nThe larger integer is: 10\n", output);
    }
}
