public class Configuracion {
    // Atributos privados
    private String url;
    private String usuario;
    private String password;

    
    private static Configuracion instancia;


    private Configuracion() {
        this.url = "https://mi-servidor.com";
        this.usuario = "admin";
        this.password = "1234";
    }

    
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    
    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
}
