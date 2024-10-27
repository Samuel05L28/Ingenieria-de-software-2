package Taller_15_2;

public class FabricaMueblesModernos implements FabricaMuebles {

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }
    
}
