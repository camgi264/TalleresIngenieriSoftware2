
public class AdapterExample {
    public static void main(String[] args) {
        NuevoSistemaPago nuevoPago = new NuevoSistemaPago();
        nuevoPago.setNombre("Camila Giraldo");
        nuevoPago.setCorreo("Camilagiraldom@gmail.com");
        nuevoPago.setNumeroTarjeta("1234-23-67");

        NuevoSistemaPagoOperacion operacion = new NuevoSistemaPagoOperacion();
        operacion.crearSesion(nuevoPago);
        operacion.validarCorreo(nuevoPago);
        operacion.validarAutorizacion();
        operacion.realizarPago();
    }
}
