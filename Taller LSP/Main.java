import java.util.ArrayList;
import java.util.List;

abstract class Producto{
    private String nombre;
    private int precio; 
    private int cantidad;
    
    public abstract double CalcularCosto();

    public Producto(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int gertPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
}
class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.CalcularCosto();
        }
        return total;
    }

    public void enviarProductosPorCorreo() {
        for (Producto producto : productos) {
            if (producto instanceof EnviarCorreo) {
                ((EnviarCorreo) producto).enviarPorCorreo();
            }
        }
    }
}
interface EnviarCorreo{
    void enviarPorCorreo();
}
class ProductoDigital extends Producto {
    private int tamañoArchivo;

    public ProductoDigital(String nombre, int precio, int cantidad, int tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    public int getTamañoArchivo() {
        return tamañoArchivo;
    }

    @Override
    public double CalcularCosto() {
        return gertPrecio() * getCantidad();
    }
}
class ProductoFisico extends Producto implements EnviarCorreo {
    private double peso;

    public ProductoFisico(String nombre, int precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double CalcularCosto() {
        double costoEnvio = peso * 10;
        return gertPrecio() * getCantidad() + costoEnvio;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("El producto físico " + getNombre() + " ha sido enviado por correo.");
    }
}
class ProductoMixto extends Producto implements EnviarCorreo {
    private ProductoFisico productoFisico;
    private ProductoDigital productoDigital;

    public ProductoMixto(String nombre, int precio, int cantidad, double peso, int tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.productoFisico = new ProductoFisico(nombre, precio, cantidad, peso);
        this.productoDigital = new ProductoDigital(nombre, precio, cantidad, tamañoArchivo);
    }

    @Override
    public double CalcularCosto() {
        return productoFisico.CalcularCosto() + productoDigital.CalcularCosto() - gertPrecio() * getCantidad();
    }

    @Override
    public void enviarPorCorreo() {
        productoFisico.enviarPorCorreo();
    }
}

public class Main{

    public static void main(String[] args) {
                ProductoDigital productoDigital = new ProductoDigital("Ebook", 2000, 4, 100);
                ProductoFisico productoFisico = new ProductoFisico("Lapicero", 500, 3, 2.0);
                ProductoMixto productoMixto = new ProductoMixto("Combo", 2500, 3, 2.5, 700);
        
                Inventario inventario = new Inventario();
                inventario.agregarProducto(productoDigital);
                inventario.agregarProducto(productoFisico);
                inventario.agregarProducto(productoMixto);
        
                System.out.println("Valor total del inventario: " + inventario.calcularValorInventario());
        
          
                inventario.enviarProductosPorCorreo();
            }

}