package HOla;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class EstudiantesTest {

    private Estudiantes estudiante;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Iniciando pruebas para la clase Estudaintes");
    }

    @BeforeEach
    public void setup() {
        estudiante = new Estudiantes("Juan", 20);
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Pruebas para la clase Estudaintes finalizadas");
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        List<Double> calificaciones = estudiante.getCalificaciones();
        assertEquals(1, calificaciones.size(), "El tamaño de la lista de calificaciones debería ser 1");
        assertEquals(8.5, calificaciones.get(0), "La calificación agregada debería ser 8.5");
    }

    @Test
    public void obtenerPromedioTest() {
        estudiante.agregarCalificacion(8.0);
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        double promedioEsperado = (8.0 + 9.0 + 7.0) / 3;
        assertEquals(promedioEsperado, estudiante.obtenerPromedio(), "El promedio calculado es incorrecto");
    }

    @Test
    public void getNumeroDeCalificacionesTest() {
        estudiante.agregarCalificacion(8.5);
        estudiante.agregarCalificacion(9.0);
        assertEquals(2, estudiante.getNumeroDeCalificaciones(), "El número de calificaciones debería ser 2");
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(12.0);
        });
        assertEquals("La calificación tiene que estar entre 0 y 10.", exception.getMessage());
    }
}
