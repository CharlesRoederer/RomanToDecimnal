import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"),14);
        assertEquals(RomanToDecimal.romanToDecimal("Hi mom"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("IV"),4);
        assertEquals(RomanToDecimal.romanToDecimal("IX"),9);
        assertEquals(RomanToDecimal.romanToDecimal("`IVIVIVIV`"),16);


        assertNotEquals(RomanToDecimal.romanToDecimal("yourmom"),100);
    }
}