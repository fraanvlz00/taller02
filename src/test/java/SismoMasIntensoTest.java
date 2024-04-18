import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class SismoMasIntensoTest {

    @Test
    public void testMostrarSismoMasIntenso() {
        // Crear una instancia de SismoMasIntenso con un arreglo para las pruebas unitarias
        double[][] lecturas = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        SismoMasIntenso sismo = new SismoMasIntenso(lecturas.length);
        sismo.lecturas = lecturas;

        // Llamar al método MostrarSismoMasIntenso
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        sismo.MostrarSismoMasIntenso();
        String expectedOutput = "El día 3, a las 2:00, se registró el sismo más intenso, con un valor de 9.0 en la escala de Richter.\n";

        // Ve si la salida coincide con la salida esperadaa
        assertEquals(expectedOutput, outContent.toString());
    }
}
