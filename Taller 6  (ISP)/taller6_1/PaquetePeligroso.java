package taller6_1;

public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {

    private String etiqueta;
    private boolean embalajeEspecial;

    public PaquetePeligroso(double peso, String dimension, String etiqueta, boolean embalajeEspecial) {
        super(peso, dimension);
        this.etiqueta = etiqueta;
        this.embalajeEspecial = embalajeEspecial;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenido() {
        System.out.println("Verificando el contenido del paquete peligroso...");
        if ("Explosivo".equalsIgnoreCase(etiqueta)) {
            System.out.println("Advertencia: El paquete contiene material explosivo.");
        } else if ("Químico".equalsIgnoreCase(etiqueta)) {
            System.out.println("Advertencia: El paquete contiene material químico peligroso.");
        } else {
            System.out.println("El contenido del paquete es seguro.");
        }
    }

    @Override
    public void asegurarPaquete() {
        if (embalajeEspecial) {
            System.out.println("El paquete ya cuenta con embalaje especial. Asegurando de manera adecuada.");
        } else {
            System.out.println("Advertencia: El paquete no tiene embalaje especial. Asegurando con materiales estándar.");
            this.embalajeEspecial = true;
        }
    }
}