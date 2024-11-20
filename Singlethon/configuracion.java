    package Singlethon;
    public class configuracion {
    public static void main(String[] args) {
        Settings configuracion = Settings.getInstancia();
        
        System.out.println("Configuración inicial:");
        System.out.println("Theme: " + configuracion.getConfiguracion("theme"));
        System.out.println("Language: " + configuracion.getConfiguracion("language"));

        configuracion.setConfiguracion("theme", "dark");
        configuracion.setConfiguracion("language", "es");

        System.out.println("\nConfiguración actualizada:");
        System.out.println("Theme: " + configuracion.getConfiguracion("theme"));
        System.out.println("Language: " + configuracion.getConfiguracion("language"));

        Settings otraConfiguracion = Settings.getInstancia();
        System.out.println("\nComprobando la misma instancia:");
        System.out.println("Theme desde otraConfiguracion: " + otraConfiguracion.getConfiguracion("theme"));
        System.out.println("Language desde otraConfiguracion: " + otraConfiguracion.getConfiguracion("language"));
    }
}
