package com.roshka.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.*;


public class CuentaNumerosTest {
    @Test
    public void exampleTests() {

        assertEquals(Arrays.asList(8L, 118L, 334L),         CuentaNumeros.findAll(10, 3));
        assertEquals(Arrays.asList(1L, 999L, 999L),         CuentaNumeros.findAll(27, 3));
        assertEquals(new ArrayList<Long>(),                 CuentaNumeros.findAll(84, 4));
        assertEquals(Arrays.asList(123L, 116999L, 566666L), CuentaNumeros.findAll(35, 6));
    }
}
