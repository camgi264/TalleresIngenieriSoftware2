package Taller15;

public class CreadoraPagoTarjeta extends Creadora {
    @Override
    public ServicioPago crearServicioPago() {
        return new PagoTarjeta();
    }
}
