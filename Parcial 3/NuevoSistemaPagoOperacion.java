public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("CREANDO LA SESIÓN A: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("VALIDANDO EL CORREO: " + nuevoSistemaPago.getCorreo());
    }

    public void validarAutorizacion() {
        System.out.println("VALIDANDO AUTORIZACIÓN...");
    }

    public void realizarPago() {
        System.out.println("REALIZANDO EL PAGO...");
    }
}

