public class Avion implements Transporte {
    private String aerolinea;
    private String tipo;

    public Avion(String aerolinea, String tipo) {
        this.aerolinea = aerolinea;
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println("El avión está despegando.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión está aterrizando.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión: " + aerolinea + " " + tipo);
    }
}