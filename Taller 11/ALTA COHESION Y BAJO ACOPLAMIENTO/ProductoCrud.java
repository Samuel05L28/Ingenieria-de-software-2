public class ProductoCrud implements CrudOperations<Producto> {
    @Override
    public void save(Producto producto) {
        System.out.println("Producto guardado: " + producto.getNombreProducto());
    }

    @Override
    public Producto find(int id) {
        System.out.println("Buscando producto con ID: " + id);
        return null;
    }

    @Override
    public void update(Producto producto) {
        System.out.println("Producto actualizado: " + producto.getNombreProducto());
    }

    @Override
    public void delete(int id) {
        System.out.println("Producto eliminado con ID: " + id);
    }
}