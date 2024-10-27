package Taller_16_2;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Celular", 30, "Tecnologia");
        Producto productoClonado = (Producto)producto.clone();

        productoClonado.setNombre("Tablet");
        
        System.out.println("Original: " + producto);
        System.out.println("Clonado: " + productoClonado);
    }
    
}
