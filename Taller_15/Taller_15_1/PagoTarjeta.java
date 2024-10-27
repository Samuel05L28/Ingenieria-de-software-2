package Taller_15_1;

public class PagoTarjeta implements ServicioPago{

    @Override
    public void procesarPago(int cantidad) {
       System.out.println("EL PAGO SE REALIZO CON TARJETA");
    }
    
}
