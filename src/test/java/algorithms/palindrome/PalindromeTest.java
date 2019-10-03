package algorithms.palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setup() {
        palindrome = new Palindrome();
    }

    @Test
    public void simple() {
        boolean expected = true;
        boolean result = palindrome.simple("dad");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.simple("mum");
        assertEquals(expected, result);

        expected = false;
        result = palindrome.simple("mums");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.simple("A man a plan a canal panama");
        assertEquals(expected, result);
    }

    @Test
    public void reverseTheString() {
        boolean expected = true;
        boolean result = palindrome.reverseTheString("dad");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.reverseTheString("mum");
        assertEquals(expected, result);

        expected = false;
        result = palindrome.reverseTheString("mums");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.reverseTheString("A man a plan a canal panama");
        assertEquals(expected, result);
    }

    @Test
    public void streams() {
        boolean expected = true;
        boolean result = palindrome.streams("dad");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.streams("mum");
        assertEquals(expected, result);

        expected = false;
        result = palindrome.streams("mums");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.streams("A man a plan a canal panama");
        assertEquals(expected, result);
    }

    @Test
    public void recursive() {
        boolean expected = true;
        boolean result = palindrome.recursive("dad");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.recursive("mum");
        assertEquals(expected, result);

        expected = false;
        result = palindrome.recursive("mums");
        assertEquals(expected, result);

        expected = true;
        result = palindrome.recursive("A man a plan a canal panama");
        assertEquals(expected, result);
    }
}