package Taller_16_2;

public class Producto implements Prototype {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public String getCategoria() {
        return categoria;
    }

    @Override
    public Prototype clone() {
        return new Producto(this.nombre, this.precio, this.categoria);
    }

    @Override
    public String toString() {
        return "Producto: { Nombre: " + nombre + " precio: " + precio + " categoria: " + categoria +" }";
    }
    
}
