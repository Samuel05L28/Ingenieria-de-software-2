package Taller_15;

public class Main {
    public static void main(String[] args) {
        Creadora CreadoraPagoTarjeta = new CreadoraPagoTarjeta();
        ServicioPago pagoTarjeta = CreadoraPagoTarjeta.crearServicioPago();
        pagoTarjeta.procesarPago(2);

    }
    
}
