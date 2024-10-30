package Taller15;

public class PagoTarjeta implements ServicioPago {
    @Override
    public void procesarPago(int cantidad) {
        System.out.println("El pago de " + cantidad + " se realizó con tarjeta.");
    }
}
