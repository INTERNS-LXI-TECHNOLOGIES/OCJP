package com.fintech;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    @Test
    void testGetSymbol() {
        assertEquals("$", Currency.USD.getSymbol());
        assertEquals("₹", Currency.INR.getSymbol());
        assertEquals("£", Currency.GBP.getSymbol());
		assertEquals("Fr.", Currency.CHF.getSymbol());
    }

    @Test 
    void testValueOf() {
        assertEquals(Currency.USD, Currency.valueOf("USD"));
        assertThrows(IllegalArgumentException.class, () -> Currency.valueOf("INVALID"));
    }
}