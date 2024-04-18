package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testContarSismosGrado4() {
        double[][] sismos = {
                {3.5, 4.2, 3.9, 4.5},
                {4.1, 3.8, 4.3, 4.7},
                {3.6, 4.0, 4.2, 3.7}
        };
        int[] expected = {2, 3, 2};
        assertArrayEquals(expected, Main.contarSismosGrado4(sismos));
        int[] expected2 = {3, 3, 3};
        assertArrayEquals(expected2, Main.contarSismosGrado4(sismos));
    }


}
