package Actividad9_5;
import java.util.Comparator;

class Socio {
    private String nombre;
    private int edad;

    public Socio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + ", edad: " + edad;
    }
}

class ComparadorPorNombre implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getNombre().compareTo(socio2.getNombre());
    }
}