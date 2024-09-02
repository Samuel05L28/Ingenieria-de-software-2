package taller;

abstract class Producto{
    private String nombre;
    private int precio;
    private int cantidad;

   
    public abstract double CalcularCosto();

    public Producto(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int gertPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
}

