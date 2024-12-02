public class SingletonExample {
    public static void main(String[] args) {
        // Obtener la única instancia de Configuracion
        Configuracion configuracion1 = Configuracion.getInstancia();
        Configuracion configuracion2 = Configuracion.getInstancia();

        
        System.out.println("URL: " + configuracion1.getUrl());
        System.out.println("Usuario: " + configuracion1.getUsuario());
        System.out.println("Password: " + configuracion1.getPassword());

        
        if (configuracion1 == configuracion2) {
            System.out.println("Ambas referencias apuntan a la misma instancia (Singleton).");
        } else {
            System.out.println("Las referencias apuntan a instancias diferentes.");
        }
    }
}

