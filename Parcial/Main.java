//INDIRECCIÓN

public class Cliente {
    private String identificacion;
    private String nombre;
    private String correo;
}

abstract class Factura {
    protected String codigo;
    protected double total;
    protected Cliente cliente;
}

class FacturaFisica extends Factura {
}

class FacturaElectronica extends Factura {
    private String numeroElectronico;
}

public class Main {
    public static void main(String[] args) {
        FacturaFisica facturaFisica = new FacturaFisica();
        FacturaElectronica facturaElectronica = new FacturaElectronica();
    }
}
