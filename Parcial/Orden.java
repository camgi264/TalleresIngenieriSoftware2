public class Orden {

    private double calcularImpuesto(double precio) {
        return precio * 0.1;
    }

    public double calcularTotalConImpuesto(double precio) {
        double impuesto = calcularImpuesto(precio);
        return precio + impuesto;
    }

    public double calcularDescuentoTotal(double precio, double descuento) {
        double precioConDescuento = precio - descuento;
        double impuesto = calcularImpuesto(precioConDescuento);
        return precioConDescuento + impuesto;
    }

    public static void main(String[] args) {
        Orden orden = new Orden();
        
        double precio = 100.0;
        double descuento = 20.0;

        double totalConImpuesto = orden.calcularTotalConImpuesto(precio);
        System.out.println("Total con impuesto: " + totalConImpuesto);

        double totalConDescuento = orden.calcularDescuentoTotal(precio, descuento);
        System.out.println("Total con descuento e impuesto: " + totalConDescuento);
    }
}
