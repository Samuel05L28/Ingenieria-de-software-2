package HOla;
import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException("La calificación tiene que estar entre 0 y 10.");
        }
        calificaciones.add(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public double obtenerPromedio() {
        return calificaciones.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public int getNumeroDeCalificaciones() {
        return calificaciones.size();
    }
}
