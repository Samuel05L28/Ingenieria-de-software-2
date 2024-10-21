package Taller_15;

public class PagoPaypal implements ServicioPago {

    @Override
    public void procesarPago(int cantidad) {
        System.out.println("PAGO REALIZADO CON PAYPAL");
    }
    
}
