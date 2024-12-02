//Aplicar el patron Builder

class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

 
    private Hamburguesa(HamburguesaBuilder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    @Override
    public String toString() {
        return "Hamburguesa [Tomate=" + tipoTomate + ", Carne=" + tipoCarne + ", Queso=" + tipoQueso + ", Pan=" + tipoPan + "]";
    }


    public static class HamburguesaBuilder {
        private String tipoTomate;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;


        public HamburguesaBuilder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }

        public HamburguesaBuilder setTipoCarne(String tipoCarne) {
            this.tipoCarne = tipoCarne;
            return this;
        }

        public HamburguesaBuilder setTipoQueso(String tipoQueso) {
            this.tipoQueso = tipoQueso;
            return this;
        }

        public HamburguesaBuilder setTipoPan(String tipoPan) {
            this.tipoPan = tipoPan;
            return this;
        }


        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}


public class Segunda_Pregunta {
    public static void main(String[] args) {

        Hamburguesa hamburguesa = new Hamburguesa.HamburguesaBuilder()
            .setTipoTomate("Tomate")
            .setTipoCarne("Carne")
            .setTipoQueso("Queso en lonchas")
            .setTipoPan("Pan integral")
            .build();

        System.out.println(hamburguesa);
    }
}
