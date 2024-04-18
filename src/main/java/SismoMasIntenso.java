import java.util.Random;

public class SismoMasIntenso {
    public double[][] lecturas;

    public SismoMasIntenso(int dias) {
        lecturas = new double[dias][24];
        generarLecturasAleatorias();
    }

    private void generarLecturasAleatorias() {
        Random random = new Random();

        for ( int i = 0; i < lecturas.length ; i++) {
            for ( int j = 0; j < lecturas[i].length ; j++) {
                lecturas[i][j] = 1.0 + ( 9.5 - 1.0 ) * random.nextDouble();
            }
        }
    }
    public void MostrarSismoMasIntenso() {
        double max = Double.MIN_VALUE;
        int dia = 0;
        int hora = 0;

        for ( int i = 0; i < lecturas.length ; i++) {
            for ( int j = 0; j < lecturas[i].length ; j++) {
                if (lecturas[i][j] > max) {
                    max = lecturas[i][j];
                    dia = i + 1;
                    hora = j;
                }
            }
        }
        System.out.println("El día " + dia + ", a las " + hora + ":00, se registró el sismo más intenso, con un valor de " + max + " en la escala de Richter.");
    }

}
