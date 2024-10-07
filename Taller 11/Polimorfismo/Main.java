public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Mercedes Benz", "GLE");
        Avion avion = new Avion("Avianca", "Planeadores");
        Bicicleta bicicleta = new Bicicleta("SCOTT", "Deporte");

        Garaje garaje = new Garaje();

        garaje.estacionar(coche);
        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
    }
    
}
