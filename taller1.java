/**
 * Clase principal que agrupa las diferentes funcionalidades del sistema.
 */
public class taller1 {

    /**
     * Clase que representa a un usuario.
     */
    public class usuario {
        private String nombre;
        private String cedula;
        private String correo;
        private String salarioBase;
        private String contrasena;

        /**
         * Constructor de la clase usuario.
         * 
         * @param nombre Nombre del usuario.
         * @param cedula Cédula del usuario.
         * @param correo Correo electrónico del usuario.
         * @param salarioBase Salario base del usuario.
         * @param contrasena Contraseña del usuario.
         */
        public usuario(String nombre, String cedula, String correo, String salarioBase, String contrasena) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.correo = correo;
            this.salarioBase = salarioBase;
            this.contrasena = contrasena;
        }

        // Métodos getter y setter para los atributos de la clase usuario.

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCedula() {
            return this.cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getCorreo() {
            return this.correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getSalarioBase() {
            return this.salarioBase;
        }

        public void setSalarioBase(String salarioBase) {
            this.salarioBase = salarioBase;
        }

        public String getContrasena() {
            return this.contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
    }

    /**
     * Clase para la funcionalidad de enviar correos.
     */
    public class enviarCorreos {
        /**
         * Envía un correo electrónico (simulado con impresión en consola).
         * 
         * @param para Dirección de correo del destinatario.
         * @param titulo Título del correo.
         * @param texto Cuerpo del correo.
         */
        public void enviar(String para, String titulo, String texto) {
            System.out.println("para: " + para);
            System.out.println("titulo: " + titulo);
            System.out.println("texto: " + texto);
        }
    }

    /**
     * Clase para la validación de contraseñas.
     */
    public class validar {
        /**
         * Valida si una contraseña proporcionada coincide con la contraseña almacenada.
         * 
         * @param contrasenaUsuario Contraseña proporcionada por el usuario.
         * @param contrasenaValidar Contraseña almacenada que se debe validar.
         * @return true si las contraseñas coinciden, false en caso contrario.
         */
        public boolean validarContrasena(String contrasenaUsuario, String contrasenaValidar) {
            return contrasenaUsuario.equals(contrasenaValidar);
        }
    }

    /**
     * Clase para el cálculo del salario.
     */
    public class calcular {
        /**
         * Calcula el salario total sumando un auxilio al salario base.
         * 
         * @param salario Salario base en formato de cadena.
         * @return Salario total calculado.
         */
        public double calcularSalario(String salario) {
            double salarioBruto = Double.parseDouble(salario);
            double aux = 130000;  // Auxilio fijo
            double salarioCompleto = salarioBruto + aux;
            return salarioCompleto;
        }
    }

    /**
     * Método principal que ejecuta el código del programa.
     */
    public static void main(String[] args) {
        taller1 main = new taller1();

        // Creación de un nuevo usuario.
        usuario user = main.new usuario("Cami", "1056122715", "camilagiraldo@gmail.com", "1300000", "camgi12");
        System.out.println("Usuario creado exitosamente");

        // Envío de un correo de prueba.
        enviarCorreos correo = main.new enviarCorreos();
        correo.enviar("correoprueba@gmail.com", "test", "Buen dia bebe.");

        // Validación de la contraseña del usuario.
        validar validarContrasena = main.new validar();
        boolean valido = validarContrasena.validarContrasena("camgi12", user.getContrasena());
        if (valido) {
            System.out.println("La contraseña es válida");
        } else {
            System.out.println("La contraseña es incorrecta");
        }

        // Cálculo del salario total del usuario.
        calcular calcularSalario = main.new calcular();
        double salario = calcularSalario.calcularSalario(user.getSalarioBase());
        System.out.println("Salario total: " + salario);
    }
}
