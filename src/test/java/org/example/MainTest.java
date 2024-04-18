package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mostrarSismosGrado4() {
        double[][] sismos = {
                {3.5, 4.2, 3.9, 4.5, 2.8},
                {4.1, 3.7, 4.3, 3.8, 4.6},
                {3.6, 4.0, 4.2, 3.5, 4.1}
        };

        String expectedOutput = "Día 1: 3 veces\nDía 2: 4 veces\nDía 3: 3 veces\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.mostrarSismosGrado4(sismos);

        assertEquals(expectedOutput, outputStream.toString());
    }
}

