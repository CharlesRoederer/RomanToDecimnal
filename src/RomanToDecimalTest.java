import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"),14);
        assertEquals(RomanToDecimal.romanToDecimal("Hi mom"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("IV"),4);
        assertEquals(RomanToDecimal.romanToDecimal("IX"),9);
        assertEquals(RomanToDecimal.romanToDecimal("MC"),1100);
        assertEquals(RomanToDecimal.romanToDecimal("cx"),110);


        assertNotEquals(RomanToDecimal.romanToDecimal("yourmom"),100);
        assertNotEquals(RomanToDecimal.romanToDecimal("Soccer"),50);
        assertNotEquals(RomanToDecimal.romanToDecimal("UNC"),65);
        assertNotEquals(RomanToDecimal.romanToDecimal("DA"),95);
        assertNotEquals(RomanToDecimal.romanToDecimal("baseball"),95);
    }
}