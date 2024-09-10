package taller7;

public class SistemaEnvio {
    private IProcesarOrdenFedEx IordenFedEX;
    private IProcesarOrdenUPS IordenUPS;
    private IProcesarOrdenDHL IordenDHL;

    public SistemaEnvio(IProcesarOrdenFedEx iordenFedEX, IProcesarOrdenUPS iordenUPS, IProcesarOrdenDHL iordenDHL) {
        IordenFedEX = iordenFedEX;
        IordenUPS = iordenUPS;
        IordenDHL = iordenDHL;
    }
    
    public void EnviarOrdenFedEX(Orden orden){
        IordenFedEX.enviarOrden(orden);
    }

    public void EnviarOrdenDHL(Orden orden){
        IordenDHL.EnviarOrden(orden);
    }

    public void CancelarOrdenDHL(){
        IordenDHL.CancelarOrden();
    }

    public void EnviarOrdenUPS(Orden orden){
        IordenUPS.EnviarOrden(orden);
    }

    public void VerificarPedido(){
        IordenUPS.VerificarPedido();
    }


}


