package com.roshka.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmallerNumberSameDigitsTest {
    @Test
    public void basicTests() {
        assertEquals(12, SmallerNumberSameDigits.nextSmaller(21));
        assertEquals(790, SmallerNumberSameDigits.nextSmaller(907));
        assertEquals(513, SmallerNumberSameDigits.nextSmaller(531));
        assertEquals(-1, SmallerNumberSameDigits.nextSmaller(1027));
        assertEquals(414, SmallerNumberSameDigits.nextSmaller(441));
        assertEquals(123456789, SmallerNumberSameDigits.nextSmaller(123456798));
    }
}