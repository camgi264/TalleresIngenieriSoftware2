// Clase PaqueteGrande hereda de Paquete e implementa la interfaz IPaquete.
class PaqueteGrande extends Paquete implements IPaquete {
    private double volumen;            // Volumen del paquete grande.
    private String medioTransporte;    // Medio de transporte utilizado para enviar el paquete.

    // Constructor que inicializa los atributos de la clase PaqueteGrande, utilizando el constructor de la superclase Paquete.
    public PaqueteGrande(double peso, String dimension, double volumen, String medioTransporte) {
        super(peso, dimension);        // Llamada al constructor de la clase base Paquete.
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    // Métodos getter y setter para el atributo volumen.
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Métodos getter y setter para el atributo medioTransporte.
    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    // Implementación del método calcularCosto de la interfaz IPaquete.
    @Override
    public void calcularCosto() {
        double costoBase = 10.0;                       // Costo base fijo.
        double costoPorPeso = getPeso() * 3.0;         // Costo basado en el peso del paquete.
        double costoPorVolumen = volumen * 5.0;        // Costo basado en el volumen del paquete.
        double costoPorTransporte;                     // Costo basado en el medio de transporte.

        // Cálculo del costo basado en el medio de transporte.
        switch (medioTransporte.toLowerCase()) {
            case "terrestre":
                costoPorTransporte = 50.0;
                break;
            case "aéreo":
                costoPorTransporte = 100.0;
                break;
            case "marítimo":
                costoPorTransporte = 80.0;
                break;
            default:
                costoPorTransporte = 60.0; // Valor predeterminado si el medio de transporte no coincide con ninguno de los casos anteriores.
        }

        // Cálculo del costo total sumando todos los factores.
        double costoTotal = costoBase + costoPorPeso + costoPorVolumen + costoPorTransporte;
        System.out.println("El costo de envío del paquete grande es: $" + costoTotal);
    }
}

// Clase base Paquete que define los atributos y métodos comunes para cualquier tipo de paquete.
class Paquete {
    private double peso;          // Peso del paquete.
    private String dimension;     // Dimensiones del paquete.

    // Constructor para inicializar los atributos de la clase Paquete.
    public Paquete(double peso, String dimension) {
        this.peso = peso;
        this.dimension = dimension;
    }

    // Métodos getter y setter para el atributo peso.
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos getter y setter para el atributo dimensión.
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}

// Interfaz que define métodos específicos para paquetes peligrosos.
interface IPaquetePeligroso {
    void verificarContenido();    // Método para verificar el contenido del paquete.
    void asegurarPaquete();       // Método para asegurar el paquete.
}

// Interfaz que define el método calcularCosto para cualquier paquete.
interface IPaquete {
    void calcularCosto();
}

// Clase PaquetePequeño que hereda de Paquete e implementa la interfaz IPaquete.
class PaquetePequeño extends Paquete implements IPaquete {
    private double valorDeclarado;   // Valor declarado del paquete pequeño.

    // Constructor que inicializa los atributos de la clase PaquetePequeño.
    public PaquetePequeño(double peso, String dimension, double valorDeclarado) {
        super(peso, dimension);      // Llamada al constructor de la clase base Paquete.
        this.valorDeclarado = valorDeclarado;
    }

    // Métodos getter y setter para el atributo valorDeclarado.
    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    // Implementación del método calcularCosto de la interfaz IPaquete.
    @Override
    public void calcularCosto() {
        double costoBase = 5.0;                           // Costo base fijo.
        double costoPorPeso = getPeso() * 2.0;            // Costo basado en el peso del paquete.
        double costoPorValor = valorDeclarado * 0.01;     // Costo basado en el valor declarado del paquete.
        double costoTotal = costoBase + costoPorPeso + costoPorValor;
        
        System.out.println("El costo de envío del paquete pequeño es: $" + costoTotal);
    }
}

// Clase PaquetePeligroso que hereda de Paquete e implementa la interfaz IPaquetePeligroso.
class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private String etiqueta;            // Etiqueta de advertencia del paquete.
    private boolean embalajeEspecial;   // Indica si el paquete tiene embalaje especial.

    // Constructor que inicializa los atributos de la clase PaquetePeligroso.
    public PaquetePeligroso(double peso, String dimension, String etiqueta, boolean embalajeEspecial) {
        super(peso, dimension);         // Llamada al constructor de la clase base Paquete.
        this.etiqueta = etiqueta;
        this.embalajeEspecial = embalajeEspecial;
    }

    // Métodos getter y setter para el atributo etiqueta.
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    // Métodos getter y setter para el atributo embalajeEspecial.
    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }

    // Implementación del método verificarContenido de la interfaz IPaquetePeligroso.
    @Override
    public void verificarContenido() {
        System.out.println("Verificando el contenido del paquete peligroso...");
        // Condicional para verificar el tipo de contenido peligroso según la etiqueta.
        if ("Explosivo".equalsIgnoreCase(etiqueta)) {
            System.out.println("Advertencia: El paquete contiene material explosivo.");
        } else if ("Químico".equalsIgnoreCase(etiqueta)) {
            System.out.println("Advertencia: El paquete contiene material químico peligroso.");
        } else {
            System.out.println("El contenido del paquete es seguro.");
        }
    }

    // Implementación del método asegurarPaquete de la interfaz IPaquetePeligroso.
    @Override
    public void asegurarPaquete() {
        // Verifica si el paquete tiene embalaje especial y lo asegura de manera adecuada.
        if (embalajeEspecial) {
            System.out.println("El paquete ya cuenta con embalaje especial. Asegurando de manera adecuada.");
        } else {
            System.out.println("Advertencia: El paquete no tiene embalaje especial. Asegurando con materiales estándar.");
            this.embalajeEspecial = true;  // Establece embalaje especial si no lo tenía.
        }
    }
}

// Clase principal para ejecutar el programa.
public class Main1 {

    // Método para probar diferentes tipos de paquetes utilizando polimorfismo.
    public static void probarPaquete(Paquete paquete) {
        if (paquete instanceof PaquetePequeño) {
            System.out.println("Clase PaquetePequeño:");
            ((PaquetePequeño) paquete).calcularCosto();  // Llama al método calcularCosto de PaquetePequeño.
        } else if (paquete instanceof PaquetePeligroso) {
            System.out.println("\nClase PaquetePeligroso:");
            ((PaquetePeligroso) paquete).verificarContenido();  // Llama a métodos específicos de PaquetePeligroso.
            ((PaquetePeligroso) paquete).asegurarPaquete();
        } else if (paquete instanceof PaqueteGrande) {
            System.out.println("\nClase PaqueteGrande:");
            ((PaqueteGrande) paquete).calcularCosto();  // Llama al método calcularCosto de PaqueteGrande.
        } else {
            System.out.println("Tipo de paquete no soportado.");
        }
    }

    // Método principal donde se crean instancias de los diferentes tipos de paquetes y se prueban.
    public static void main(String[] args) {
        PaquetePequeño miPaquetePequeño = new PaquetePequeño(3.0, "2x16x1", 4000);  // Instancia de PaquetePequeño.
        PaquetePeligroso miPaquetePeligroso = new PaquetePeligroso(8.0, "60x20x60", "Peligro", true);  // Instancia de PaquetePeligroso.
        PaqueteGrande miPaqueteGrande = new PaqueteGrande(20.0, "50x50x50", 8.5, "Aereo");  // Instancia de PaqueteGrande.

        // Prueba de cada tipo de paquete.
        probarPaquete(miPaquetePequeño);
        probarPaquete(miPaquetePeligroso);
        probarPaquete(miPaqueteGrande);
    }
}
