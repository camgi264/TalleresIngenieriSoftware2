// Clase principal del sistema de envíos
public class Envio {
    public static void main(String[] args) {
        //Instancias de los diferentes tipos de envío
        CostoEnvio envioEstandar = new EnvioEstandar();
        CostoEnvio envioExpress = new EnvioExpress();

        // Usar GestorEnvios con EnvioEstandar
        GestorEnvios gestorEnvioEstandar = new GestorEnvios(envioEstandar);
        double costoEstandar = gestorEnvioEstandar.procesarEnvio(10, 100); // Ejemplo: 10kg, 100km
        System.out.println("Costo del envío estándar: " + costoEstandar);

        // Usar GestorEnvios con EnvioExpress
        GestorEnvios gestorEnvioExpress = new GestorEnvios(envioExpress);
        double costoExpress = gestorEnvioExpress.procesarEnvio(10, 100); // Ejemplo: 10kg, 100km
        System.out.println("Costo del envío express: " + costoExpress);
    }
}

// Interfaz para el cálculo de costos de envío
interface CostoEnvio {
    double calcularCosto(double peso, double distancia);
}

// Implementación para el envío estándar
class EnvioEstandar implements CostoEnvio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        // Lógica de cálculo para envío estándar
        return 5.0 + peso * 0.5 + distancia * 0.1;
    }
}

// Implementación para el envío express
class EnvioExpress implements CostoEnvio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        // Lógica de cálculo para envío express
        return 10.0 + peso * 0.7 + distancia * 0.15;
    }
}

// Clase para manejar los envíos
class GestorEnvios {
    private CostoEnvio costoEnvio;

    // Constructor que recibe una implementación de CostoEnvio
    public GestorEnvios(CostoEnvio costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    // Método para calcular el costo de un envío
    public double procesarEnvio(double peso, double distancia) {
        return costoEnvio.calcularCosto(peso, distancia);
    }
}
//Violaciones del OCP
//Para agregar un nuevo tipo de envío,se requiere modificar el código y violaría el OCP 