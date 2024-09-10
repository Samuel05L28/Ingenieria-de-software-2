package taller7;

public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL{

        @Override
        public void EnviarOrden(Orden orden) {
            System.out.println("-----------DHL-------------");
            System.out.println(orden.getFecha());
            System.out.println(orden.getLugarorigen());
            System.out.println(orden.getLugardestino());
        }
    
        @Override
        public void CancelarOrden() {
            System.err.println("PEDIDO CANCELADO");
        }
        
    }
