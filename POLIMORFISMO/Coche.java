public class Coche implements Transporte {
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche: " + marca + " " + modelo);
    }
}