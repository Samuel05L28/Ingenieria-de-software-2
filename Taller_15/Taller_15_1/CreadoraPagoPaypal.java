package Taller_15_1;



public class CreadoraPagoPaypal extends Creadora{

    @Override
    public ServicioPago crearServicioPago() {
        return new PagoPaypal();
    }
    
}
