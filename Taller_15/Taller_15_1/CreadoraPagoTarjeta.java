package Taller_15_1;



public class CreadoraPagoTarjeta extends Creadora {

    @Override
    public ServicioPago crearServicioPago() {
        return new PagoTarjeta();
    }
}
