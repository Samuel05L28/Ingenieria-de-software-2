package taller;



public class Main{

    public static void main(String[] args) {
                ProductoDigital productoDigital = new ProductoDigital("Ebook", 1000, 3, 1000);
                ProductoFisico productoFisico = new ProductoFisico("Lapiz", 500, 3, 2.0);
                ProductoMixto productoMixto = new ProductoMixto("Combo", 1500, 2, 2.5, 700);
        
                Inventario inventario = new Inventario();
                inventario.agregarProducto(productoDigital);
                inventario.agregarProducto(productoFisico);
                inventario.agregarProducto(productoMixto);
        
                System.out.println("Valor total del inventario: " + inventario.calcularValorInventario());
        
          
                inventario.enviarProductosPorCorreo();
            }

}
