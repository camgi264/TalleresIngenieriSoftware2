//Factory

public class EnvioRegularFactory implements EnvioFactory {
    @Override
    public ServicioEnvio crearEnvio() {
        return new ServicioEnvio() {
            @Override
            public void enviarFormaRegular(String paquete) {
                System.out.println("ENVÍO REGULAR PERSONALIZADO: " + paquete);
            }
        };
    }
}


