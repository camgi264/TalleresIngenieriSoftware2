package Taller15;

public class Main {
    public static void main(String[] args) {
        // Crear un pago con tarjeta
        Creadora creadoraPagoTarjeta = new CreadoraPagoTarjeta();
        ServicioPago pagoTarjeta = creadoraPagoTarjeta.crearServicioPago();
        pagoTarjeta.procesarPago(300);

        // Crear un pago con PayPal
        Creadora creadoraPagoPaypal = new CreadoraPagoPaypal();
        ServicioPago pagoPaypal = creadoraPagoPaypal.crearServicioPago();
        pagoPaypal.procesarPago(100);
    }
}
