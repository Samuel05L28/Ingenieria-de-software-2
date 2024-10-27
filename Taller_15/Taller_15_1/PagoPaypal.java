package Taller_15_1;

public class PagoPaypal implements ServicioPago {

    @Override
    public void procesarPago(int cantidad) {
        System.out.println("PAGO REALIZADO CON PAYPAL");
    }
    
}
