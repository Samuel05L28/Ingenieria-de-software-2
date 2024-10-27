package Taller_15_2;

public class Main {
    public static void main(String[] args) {
        FabricaMuebles fabricaModerna = new FabricaMueblesModernos();
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mesa mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear();
        mesaModerna.crear();

        FabricaMuebles fabricaClasica = new FabricaMueblesClasicos();
        Silla sillaClasicca = fabricaClasica.crearSilla();
        Mesa mesaClasica = fabricaClasica.crearMesa();
        sillaClasicca.crear();
        mesaClasica.crear();
    }
    
}
