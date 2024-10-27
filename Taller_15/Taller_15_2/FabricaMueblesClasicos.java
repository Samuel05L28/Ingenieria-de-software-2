package Taller_15_2;

public class FabricaMueblesClasicos implements FabricaMuebles {

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }
    
}
