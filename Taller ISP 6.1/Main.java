// Definición de la interfaz Libreria con métodos para prestar, devolver, renovar portada, etc.
interface Libreria {
    void prestar();
    void devolver();
    void renovarPortada();
    void mantenimientoHojas();
    void solicitarNuevaVersion();
}

// Definición de la interfaz LibreriaLibro con métodos relacionados específicamente con libros.
interface LibreriaLibro {
    void prestar();
    void devolver();
    void renovarPortada();
    void mantenimientoHojas();
    void solicitarVersion();
}

// Clase que implementa la interfaz LibreriaLibro, representando un libro con atributos como título, portada, etc.
class Libro implements LibreriaLibro {
    private String titulo;
    private String portada;
    private int cantidadHojas;
    private int version;
    private int cantidadDvd;

    // Constructor de la clase Libro para inicializar los atributos.
    public Libro(String titulo, String portada, int cantidadHojas, int version, int cantidadDvd) {
        this.titulo = titulo;
        this.portada = portada;
        this.cantidadHojas = cantidadHojas;
        this.version = version;
        this.cantidadDvd = cantidadDvd;
    }

    // Métodos getter y setter para cada atributo del libro.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getcantidadDvd() {
        return cantidadDvd;
    }

    public void setcantidadDvd(int cantidadDvd) {
        this.cantidadDvd = cantidadDvd;
    }

    // Implementación del método prestar de la interfaz LibreriaLibro.
    @Override
    public void prestar() {
        if (cantidadDvd > 0) {
            cantidadDvd--;
            System.out.println("Libro prestado. Libros restantes: " + cantidadDvd);
        } else {
            System.out.println("No hay libros disponibles para prestar.");
        }
    }

    // Implementación del método devolver de la interfaz LibreriaLibro.
    @Override
    public void devolver() {
        cantidadDvd++;
        System.out.println("Libro devuelto. Libros actuales: " + cantidadDvd);
    }

    // Implementación del método renovarPortada de la interfaz LibreriaLibro.
    @Override
    public void renovarPortada() {
        this.portada = "Nueva imagen de portada";
        System.out.println("Portada del libro renovada.");
    }

    // Implementación del método mantenimientoHojas de la interfaz LibreriaLibro.
    @Override
    public void mantenimientoHojas() {
        System.out.println("Realizando mantenimiento de las hojas del libro.");
    }

    // Implementación del método solicitarVersion de la interfaz LibreriaLibro.
    @Override
    public void solicitarVersion() {
        System.out.println("Nueva versión del libro solicitada. Versión actual: " + version);
    }
}

// Definición de la interfaz LibreriaDvd con métodos relacionados con los DVDs.
interface LibreriaDvd {
    void prestar();
    void devolver();  
}

// Clase que implementa la interfaz LibreriaDvd, representando un DVD con atributos como título y cantidad de copias.
class Dvd implements LibreriaDvd {
    private String titulo;
    private int cantidadDvd;

    // Constructor de la clase Dvd para inicializar los atributos.
    public Dvd(String titulo, int cantidadDvd) {
        this.titulo = titulo;
        this.cantidadDvd = cantidadDvd;
    }

    // Métodos getter y setter para cada atributo del DVD.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getcantidadDvd() {
        return cantidadDvd;
    }

    public void setcantidadDvd(int cantidadDvd) {
        this.cantidadDvd = cantidadDvd;
    }

    // Implementación del método prestar de la interfaz LibreriaDvd.
    @Override
    public void prestar() {
        if (cantidadDvd > 0) {
            cantidadDvd--;
            System.out.println("DVD prestado. DVDs restantes: " + cantidadDvd);
        } else {
            System.out.println("No hay DVDs disponibles para prestar.");
        }
    }

    // Implementación del método devolver de la interfaz LibreriaDvd.
    @Override
    public void devolver() {
        cantidadDvd++;
        System.out.println("DVD devuelto. DVDs actuales: " + cantidadDvd);
    }
}

// Definición de la interfaz LibreriaCartilla con métodos relacionados con las cartillas.
interface LibreriaCartilla {
    void prestar();
    void devolver();
    void mantenimientoHojas();
}

// Clase que implementa la interfaz LibreriaCartilla, representando una cartilla con atributos como título y cantidad.
class Cartilla implements LibreriaCartilla {
    private String titulo;
    private int cantidadHojas;
    private int cantidadCartilla;

    // Constructor de la clase Cartilla para inicializar los atributos.
    public Cartilla(String titulo, int cantidadHojas, int cantidadCartilla) {
        this.titulo = titulo;
        this.cantidadHojas = cantidadHojas;
        this.cantidadCartilla = cantidadCartilla;
    }

    // Métodos getter y setter para cada atributo de la cartilla.
    public void setcantidadCartilla(int cantidadCartilla) {
        this.cantidadCartilla = cantidadCartilla;
    }

    public int getcantidadCartilla() {
        return cantidadCartilla;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    // Implementación del método prestar de la interfaz LibreriaCartilla.
    @Override
    public void prestar() {
        if (cantidadCartilla > 0) {
            cantidadCartilla--;
            System.out.println("Cartilla prestada. Cartillas restantes: " + cantidadCartilla);
        } else {
            System.out.println("No hay cartillas disponibles para prestar.");
        }
    }

    // Implementación del método devolver de la interfaz LibreriaCartilla.
    @Override
    public void devolver() {
        cantidadCartilla++;
        System.out.println("Cartilla devuelta. Cartillas actuales: " + cantidadCartilla);
    }

    // Implementación del método mantenimientoHojas de la interfaz LibreriaCartilla.
    @Override
    public void mantenimientoHojas() {
        System.out.println("Realizando mantenimiento de las hojas de la cartilla.");
    }
}

// Clase principal para ejecutar el programa.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Libro y realizar acciones sobre ella.
        Libro miLibro = new Libro("Caperucita roja", "Imagen/jpg", 200, 2, 20);

        System.out.println("Clase libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        miLibro.prestar();
        miLibro.devolver();
        miLibro.renovarPortada();
        miLibro.mantenimientoHojas();
        miLibro.solicitarVersion();

        // Crear una instancia de la clase Dvd y realizar acciones sobre ella.
        Dvd miDVD = new Dvd("Dvd4", 10);

        System.out.println("\nClase dvd:");
        System.out.println("Título: " + miDVD.getTitulo());
        miDVD.prestar();
        miDVD.devolver();

        // Crear una instancia de la clase Cartilla y realizar acciones sobre ella.
        Cartilla miCartilla = new Cartilla("Ingles2", 200, 5);

        System.out.println("\nClase cartilla:");
        System.out.println("Título: " + miCartilla.getTitulo());
        miCartilla.prestar();
        miCartilla.devolver();
        miCartilla.mantenimientoHojas();
    }
}
