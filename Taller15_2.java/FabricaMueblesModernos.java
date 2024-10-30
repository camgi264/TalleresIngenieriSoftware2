package Taller15_2.java;
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