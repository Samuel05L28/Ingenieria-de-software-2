package taller7;

public class Main {
    public static void main(String[] args) {
        IProcesarOrdenFedEx FedEX = new ProcesarOrdenFedExImp();
        IProcesarOrdenDHL DHL = new ProcesarOrdenDHLImpl();
        IProcesarOrdenUPS UPS = new ProcesarOrdenUSPImpl();
        
        SistemaEnvio sistema = new SistemaEnvio(FedEX, UPS, DHL);

        Orden orden = new Orden(null, "Manizales", "Cali");

        sistema.EnviarOrdenFedEX(orden);

        sistema.EnviarOrdenDHL(orden);
        sistema.CancelarOrdenDHL();

        sistema.EnviarOrdenUPS(orden);
        sistema.VerificarPedido();


    }
}