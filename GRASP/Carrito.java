import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;  // Cambié a double para representar el precio
    private int cantidad;   // Añadí la cantidad de libros

    // Constructor
    public Libro(String titulo, String autor, String isbn, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos getter
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }

}

 public class Carrito {
    private List<Libro> libros = new ArrayList<>();

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    
    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecio() * libro.getCantidad();
        }
        return total;
    }

    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Caperucita roja", "Charles Perrault", "123456789", 18000, 2);
        Libro libro2 = new Libro("1984", "George Orwell", "987654321", 20000, 1);

        
        Carrito carrito = new Carrito();
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        
        System.out.println("El precio total del carrito es: $" + carrito.calcularPrecioTotal());
    }
}

//EXPERTO
