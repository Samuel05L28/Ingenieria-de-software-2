package taller7;

public class ProcesarOrdenFedExImp implements IProcesarOrdenFedEx {

    @Override
    public void enviarOrden(Orden orden) {
        System.out.println("-----------FedEx-------------");
        System.out.println(orden.getFecha());
        System.out.println(orden.getLugarorigen());
        System.out.println(orden.getLugardestino());
    }
}
