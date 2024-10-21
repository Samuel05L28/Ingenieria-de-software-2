package Taller_15;

public class CreadoraPagoPaypal extends Creadora{

    @Override
    public ServicioPago crearServicioPago() {
        return new PagoPaypal();
    }
    
}
