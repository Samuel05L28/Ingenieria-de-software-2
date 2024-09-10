package taller7;

public class ProcesarOrdenUSPImpl implements IProcesarOrdenUPS{
    
@Override
public void EnviarOrden(Orden orden) {
    System.out.println("-----------UPS-------------");
    System.out.println(orden.getFecha());
    System.out.println(orden.getLugarorigen());
    System.out.println(orden.getLugardestino());
}

@Override
public void VerificarPedido() {
    System.out.println("VERIFICANDO PEDIDO");
}

}