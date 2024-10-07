package POLIMORFISMO;

public class Bicicleta implements Transporte {
    private String marca;
    private String tipo;

    public Bicicleta(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta: " + marca + " " + tipo);
    }
}