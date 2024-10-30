package Primer_pregunta.KISS;

public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            return "Orden Invalida";
        }
        
        if (ordenId == 0 || ordenId <= 50) {
            return "Pendiente";
        }
        
        if (ordenId > 100) {
            return "Completada";
        }

        return "En Progreso";
    }
}

