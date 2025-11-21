package juegos;

public abstract class Juego {
    protected String nombre;
    protected double precio;

    public Juego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void mostrarDetalles();  // método abstracto
}
