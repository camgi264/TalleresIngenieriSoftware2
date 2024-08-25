import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Date;

public class Sistema {
    public static void main(String[] args) {
        // Crear instancias de Factura y Cliente
        Factura factura = new Factura("F1", new Date(), "CamiGiraldo", 1234.56, "Calle 13-12");
        Cliente cliente = new Cliente("CamiGiraldo", "Calle 13-12", "3145937544", "camilagiraldo@gmail.com");

        // Instanciar las clases de gestión
        GuardarFactura guardarFactura = new GuardarFactura();
        EnviarEmailFactura enviarEmailFactura = new EnviarEmailFactura();
        GuardarCliente guardarCliente = new GuardarCliente();
        GenerarReporteFacturas generarReporteFacturas = new GenerarReporteFacturas();
        EmailFacturaDian emailFacturaDian = new EmailFacturaDian();

        // Agregar y almacenar facturas y clientes
        guardarFactura.agregarFactura(factura);
        guardarCliente.agregarCliente(cliente);

        // Enviar factura por email
        enviarEmailFactura.enviar(factura, cliente.getCorreoElectronico());

        // Enviar factura a la DIAN
        emailFacturaDian.enviar(factura);

        // Generar reporte de facturas
        generarReporteFacturas.generarReporte(guardarFactura.listarFacturas());

        // Buscar un cliente
        Cliente clienteBuscado = guardarCliente.buscarClientePorNombre("CamiGiraldo");

        if (clienteBuscado != null) {
            System.out.println("Cliente buscado: " + clienteBuscado.getNombre());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}

class Factura {
    private String numeroFactura;
    private Date fecha;
    private String cliente;
    private double montoTotal;
    private String direccion;

    // Constructor
    public Factura(String numeroFactura, Date fecha, String cliente, double montoTotal, String direccion) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.direccion = direccion;
    }

    // Getter y Setter para numeroFactura
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    // Getter y Setter para fecha
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Getter y Setter para cliente
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Getter y Setter para montoTotal
    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    // Getter y Setter para direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    // Constructor
    public Cliente(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter para telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Getter y Setter para correoElectronico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

class GuardarFactura {
    private List<Factura> facturas;

    // Constructor
    public GuardarFactura() {
        this.facturas = new ArrayList<>();
    }

    // Método para agregar una nueva factura
    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    // Método para buscar una factura por número
    public Factura buscarFacturaPorNumero(String numeroFactura) {
        Optional<Factura> factura = facturas.stream()
                .filter(f -> f.getNumeroFactura().equals(numeroFactura))
                .findFirst();
        return factura.orElse(null);
    }

    // Método para listar todas las facturas
    public List<Factura> listarFacturas() {
        return new ArrayList<>(facturas);
    }

    // Método para eliminar una factura por número
    public boolean eliminarFacturaPorNumero(String numeroFactura) {
        return facturas.removeIf(f -> f.getNumeroFactura().equals(numeroFactura));
    }
}

class EnviarEmailFactura {
    // Método para enviar un email con la factura
    public void enviar(Factura factura, String correoDestinatario) {
        // Simulación de envío de correo
        System.out.println("Enviando email a: " + correoDestinatario);
        System.out.println("Asunto: Factura " + factura.getNumeroFactura());
        System.out.println("Contenido del email:\n" +
                "Factura No: " + factura.getNumeroFactura() + "\n" +
                "Fecha: " + factura.getFecha() + "\n" +
                "Cliente: " + factura.getCliente() + "\n" +
                "Monto Total: " + factura.getMontoTotal() + "\n" +
                "Dirección: " + factura.getDireccion());
        System.out.println("Email enviado exitosamente.");
    }
}

class GuardarCliente {
    private List<Cliente> clientes;

    // Constructor
    public GuardarCliente() {
        this.clientes = new ArrayList<>();
    }

    // Método para agregar un nuevo cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para buscar un cliente por nombre
    public Cliente buscarClientePorNombre(String nombre) {
        Optional<Cliente> cliente = clientes.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        return cliente.orElse(null);
    }

    // Método para listar todos los clientes
    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }
}

class GenerarReporteFacturas {
    // Método para generar un reporte de facturas
    public void generarReporte(List<Factura> facturas) {
        System.out.println("Reporte de Facturas:");
        for (Factura factura : facturas) {
            System.out.println("Factura No: " + factura.getNumeroFactura());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Cliente: " + factura.getCliente());
            System.out.println("Monto Total: " + factura.getMontoTotal());
            System.out.println("Dirección: " + factura.getDireccion());
            System.out.println("--------------");
        }
    }
}

class EmailFacturaDian {
    // Método para enviar la factura a la DIAN
    public void enviar(Factura factura) {
        // Simulación de envío de factura a la DIAN
        System.out.println("Enviando factura a la DIAN:");
        System.out.println("Factura No: " + factura.getNumeroFactura());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Monto Total: " + factura.getMontoTotal());
        System.out.println("Dirección: " + factura.getDireccion());
        System.out.println("Factura enviada exitosamente a la DIAN.");
    }
}
//las violaciones del SRP 
//GuardarFactura: Guardar una factura en la base de datos o en un sistema de almacenamiento es una responsabilidad de persistencia de datos, no de la lógica de negocio de la factura.
//EnviarEmailFactura: El envío de correos electrónicos es una funcionalidad que está relacionada con la comunicación y no con la gestión interna de la factura. Esta responsabilidad podría delegarse a un servicio de notificaciones o de correos.
//GuardarCliente:El manejo de clientes es una responsabilidad diferente que debería estar en una clase Cliente o en un servicio dedicado a la gestión de clientes. La clase Factura debería solo asociarse a un cliente ya existente, no gestionarlos directamente.
//Generar ReportedeFacturas: La generación de reportes no debería ser responsabilidad de la clase Factura. Esto corresponde a un servicio de reportes o análisis que se encargue de recopilar y presentar datos.
//Enviar Factura a Dian:La comunicación con entidades externas, como la DIAN, para enviar facturas electrónicas, es una responsabilidad separada. Esta funcionalidad debería estar en un servicio de integración con sistemas externos.