package Actividad9_5;
import java.util.Comparator;

class Socio {
    //Atributos
    private String nombre;
    private int edad;
    //Constructor
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
    //para que salga en pantalla
    @Override
    public String toString() {
        return " Nombre: " + nombre + ", edad: " + edad;
    }

//Lo que me pide el enunciado
public static class ComparadorNombre implements Comparator {
    @Override
    public int compare(Object socio1, Object socio2) {
        String nombreSocio1 = ((Socio) socio1).getNombre();
        String nombreSocio2 = ((Socio) socio2).getNombre();
        return nombreSocio1.compareTo(nombreSocio2);
        //No he visto otra forma, en el libro te explica con int.
    }
}
}

