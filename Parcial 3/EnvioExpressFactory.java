//Factory
public class EnvioExpressFactory implements EnvioFactory {
    @Override
    public ServicioEnvio crearEnvio() {
        return new ServicioEnvio() {
            @Override
            public void enviarFormaExpress(String paquete) {
                System.out.println("ENVÍO EXPRESS PERSONALIZADO: " + paquete);
            }
        };
    }
}


