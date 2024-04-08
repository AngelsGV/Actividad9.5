package Actividad9_5;
public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Eriòs", 29);
        Socio socio2 = new Socio("Angels", 24);
        Socio socio3 = new Socio("Javi", 30);
        Socio socio4 = new Socio("Lara", 27);

        Socio[] socios = {socio1, socio2, socio3,socio4};

        System.out.println("Socios antes de ordenar:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }

        // Ordenar los socios por nombre usando ComparadorPorNombre
        Comparator<Socio> comparador = new ComparadorPorNombre();
        java.util.Arrays.sort(socios, comparador);

        System.out.println("\nSocios después de ordenar:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}