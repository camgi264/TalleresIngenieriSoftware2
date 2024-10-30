package Taller15_2.java;

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