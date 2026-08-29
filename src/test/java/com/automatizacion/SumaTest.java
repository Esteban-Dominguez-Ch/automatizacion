package com.automatizacion;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {
    @Test
    public void testSuma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado);
    }
}