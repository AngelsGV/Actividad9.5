package Actividad9_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio[] socios = new Socio[]{
                new Socio("Eriòs", 29),
                new Socio("Angels", 24),
                new Socio("Javi", 30),
                new Socio("Lara", 27)
        };


        System.out.println("Socios antes de ordenar:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }

        // Ordenar los socios por nombre usando ComparadorPorNombre
        Socio.ComparadorNombre comparador = new Socio.ComparadorNombre();
        Arrays.sort(socios, comparador);

        System.out.println("\n Socios después de ordenar:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
