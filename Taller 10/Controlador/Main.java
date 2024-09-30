import java.util.ArrayList;
import java.util.List;

class Entrada {
    private String tipo;
    private double precio;
    private boolean disponible;

    public Entrada(String tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void comprarEntrada(String tipoEntrada) {
        Entrada entrada = encontrarEntrada(tipoEntrada);

        if(entrada == null) {
            System.out.println("Entrada no encontrada");
            return;
        }
        if(entrada.getDisponible()) {
            entrada.setDisponible(false);
            System.out.println("Entrada comprada");
        }else {
            System.out.println("Entrada no disponible");
        }
    }
    private Entrada encontrarEntrada(String tipoEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equals(tipoEntrada)) {
                return entrada;
            }
        }
        return null;
    }
}

class Usuario {
    private ControladorVenta controlador = new ControladorVenta();

    public void comprar(String tipoEntrada) {
        controlador.comprarEntrada(tipoEntrada);
    }
    public void agregarEntrada(Entrada entrada) {
        controlador.agregarEntrada(entrada);
    }
}



public class Main{
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("ESTANDAR", 30, true);

        Usuario usuario = new Usuario();
        usuario.agregarEntrada(entrada1);
        usuario.comprar("ESTANDAR");
    }
}