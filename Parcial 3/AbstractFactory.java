
public class AbstractFactory {
    public static void main(String[] args) {
        EnvioFactory envioExpressFactory = new EnvioExpressFactory();
        ServicioEnvio envioExpress = envioExpressFactory.crearEnvio();
        envioExpress.enviarFormaExpress("Paquete 1");

        EnvioFactory envioRegularFactory = new EnvioRegularFactory();
        ServicioEnvio envioRegular = envioRegularFactory.crearEnvio();
        envioRegular.enviarFormaRegular("Paquete 2");
    }
}

