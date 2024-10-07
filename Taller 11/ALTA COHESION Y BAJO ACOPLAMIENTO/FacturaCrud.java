public class FacturaCrud implements CrudOperations<Factura> {
    @Override
    public void save(Factura factura) {
        System.out.println("Factura guardada para el cliente: " + factura.getCliente().getNombreCliente());
    }

    @Override
    public Factura find(int id) {
        System.out.println("Buscando factura con ID: " + id);
        return null;
    }

    @Override
    public void update(Factura factura) {
        System.out.println("Factura actualizada para el cliente: " + factura.getCliente().getNombreCliente());
    }

    @Override
    public void delete(int id) {
        System.out.println("Factura eliminada con ID: " + id);
    }
}