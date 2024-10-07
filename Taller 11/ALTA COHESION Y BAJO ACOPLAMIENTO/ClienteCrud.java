public class ClienteCrud implements CrudOperations<Cliente> {
    @Override
    public void save(Cliente cliente) {
        System.out.println("Cliente guardado: " + cliente.getNombreCliente());
    }

    @Override
    public Cliente find(int id) {
        System.out.println("Buscando cliente con ID: " + id);
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        System.out.println("Cliente actualizado: " + cliente.getNombreCliente());
    }

    @Override
    public void delete(int id) {
        System.out.println("Cliente eliminado con ID: " + id);
    }
}