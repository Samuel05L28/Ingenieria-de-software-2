package taller6_1;

public class Main {

    public static void probarPaquete(Paquete paquete) {
        if (paquete instanceof PaquetePequeño) {
            System.out.println("Clase PaquetePequeño:");
            ((PaquetePequeño) paquete).calcularCosto();
        } else if (paquete instanceof PaquetePeligroso) {
            System.out.println("\nClase PaquetePeligroso:");
            ((PaquetePeligroso) paquete).verificarContenido();
            ((PaquetePeligroso) paquete).asegurarPaquete();
        } else if (paquete instanceof PaqueteGrande) {
            System.out.println("\nClase PaqueteGrande:");
            ((PaqueteGrande) paquete).calcularCosto();
        } else {
            System.out.println("Tipo de paquete no soportado.");
        }
    }

    public static void main(String[] args) {
        PaquetePequeño miPaquetePequeño = new PaquetePequeño(1.0, "2x15x1", 1000.0);
        PaquetePeligroso miPaquetePeligroso = new PaquetePeligroso(5.0, "50x40x30", "Fragil", false);
        PaqueteGrande miPaqueteGrande = new PaqueteGrande(15.0, "100x50x50", 4.5, "Terrestre");

        probarPaquete(miPaquetePequeño);
        probarPaquete(miPaquetePeligroso);
        probarPaquete(miPaqueteGrande);
    }
}