// Se crea clase abstracta llamada Calculo
abstract class Calculo {
    protected String producto;
    protected double precio;
    protected int cantidad;

    public Calculo(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Se crea un método abstracto para calcular el impuesto
    abstract double calcularImpuesto();
}

// Se crea clase que calcula el IVA al 19%
class CalculoImpuestoIva extends Calculo {

    public CalculoImpuestoIva(String producto, double precio, int cantidad) {
        super(producto, precio, cantidad);
    }

    @Override
    double calcularImpuesto() {
        return precio * cantidad * 0.19;  // 19% de IVA
    }
}

//  Se crea clase que calcula el ICA al 10%
class CalculoImpuestoICA extends Calculo {

    public CalculoImpuestoICA(String producto, double precio, int cantidad) {
        super(producto, precio, cantidad);
    }

    @Override
    double calcularImpuesto() {
        return precio * cantidad * 0.10;  // 10% de ICA
    }
}

// Clase que calcula el IVA saludable al 5%
class CalculoImpuestoSaludable extends Calculo {

    public CalculoImpuestoSaludable(String producto, double precio, int cantidad) {
        super(producto, precio, cantidad);
    }

    @Override
    double calcularImpuesto() {
        return precio * cantidad * 0.05;  // 5% de IVA saludable
    }
}

// Se crea clase Factura que realiza el cálculo del impuesto
class Factura {
    private Calculo calculo;

    public Factura(Calculo calculo) {
        this.calculo = calculo;
    }

    public double calcularTotalConImpuesto() {
        return calculo.precio * calculo.cantidad + calculo.calcularImpuesto();
    }

    public void mostrarFactura() {
        System.out.println("Producto: " + calculo.producto);
        System.out.println("Cantidad: " + calculo.cantidad);
        System.out.println("Precio unitario: $" + calculo.precio);
        System.out.println("Impuesto aplicado: $" + calculo.calcularImpuesto());
        System.out.println("Total a pagar: $" + calcularTotalConImpuesto());
    }
}

// Se crea clase Main para ejecutar el programa
public class Main{
    public static void main(String[] args) {
        // Calcular IVA del 19%
        Factura facturaIva = new Factura(new CalculoImpuestoIva("Celular",500,4));
        facturaIva.mostrarFactura();

        // Calcular ICA del 10%
        Factura facturaIca = new Factura(new CalculoImpuestoICA("Laptop", 2000.0, 2));
        facturaIca.mostrarFactura();

        // Calcular IVA saludable del 5%
        Factura facturaSaludable = new Factura(new CalculoImpuestoSaludable("Audifonos", 1.5, 10));
        facturaSaludable.mostrarFactura();
    }
}




    

