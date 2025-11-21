package juegos;

public class CarreraVehiculos extends Juego {

    private int cantidadAutos;

    public CarreraVehiculos(String nombre, double precio, int cantidadAutos) {
        super(nombre, precio);
        this.cantidadAutos = cantidadAutos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("JUEGO DE CARRERAS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Autos disponibles: " + cantidadAutos);
    }
}
