package Primer_pregunta.DRY;

public class Orden {

    public  double calcularImpuesto(double precio){
        double impuesto = precio  * 0.1;
        return precio + impuesto;
    }

    public  double calcularDescuentoTotal(double precio ,double descuento){
        double descuentoPrecio = precio - descuento;
        double impuesto = descuentoPrecio * 0.1;
        return descuentoPrecio + impuesto;
    }
    
}
    

