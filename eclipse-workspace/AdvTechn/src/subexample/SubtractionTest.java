package subexample;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SubtractionTest {

	@Test
	public void testMain() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Subtraction.main(new String[0]);

	  	String output = outContent.toString().trim();
		assertEquals("POSITIVE", output);
	}
	 
    @Test
    public void testSubtrPositiveResult() {
        int a = 6;
        int b = 3;
        String result = Subtraction.subtr(a, b);
        assertEquals("POSITIVE", result);
    }

    @Test
    public void testSubtrNegativeResult() {
        int a = 3;
        int b = 6;
        String result = Subtraction.subtr(a, b);
        assertEquals("NEGATIVE", result);
    }
}
