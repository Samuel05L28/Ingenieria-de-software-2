public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla");
        Avion avion = new Avion("Delta", "Boeing 737");
        Bicicleta bicicleta = new Bicicleta("Giant", "Montaña");

        Garaje garaje = new Garaje();

        garaje.estacionar(coche);
        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
    }
}