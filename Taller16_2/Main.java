package Taller16_2;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("AirPods", 100, "Tecnologia");
        Producto productoClonado = (Producto)producto.clone();

        productoClonado.setNombre("Inpods");
        
        System.out.println("Original: " + producto);
        System.out.println("Clonado: " + productoClonado);
    }
    
}