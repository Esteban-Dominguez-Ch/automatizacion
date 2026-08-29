package com.automatizacion;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaTest {
    @Test
    public void testResta() {
        int resultado = 5 - 2;
        assertEquals(3, resultado);
    }
}