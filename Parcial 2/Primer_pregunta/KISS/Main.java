package Primer_pregunta.KISS;

public class Main {
    public static void main(String[] args) {

        OrdenEstado ordenEstado = new OrdenEstado();

        System.out.println("Estado de orden -1: " + ordenEstado.obtenerEstado(-1));
        System.out.println("Estado de orden 25: " + ordenEstado.obtenerEstado(25));
        System.out.println("Estado de orden 75: " + ordenEstado.obtenerEstado(75));
        System.out.println("Estado de orden 150: " + ordenEstado.obtenerEstado(150));
        
    }
    
}
