package juegos;

public class MarioBros extends Juego {

    private int nivelMaximo;

    public MarioBros(String nombre, double precio, int nivelMaximo) {
        super(nombre, precio);
        this.nivelMaximo = nivelMaximo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("JUEGO MARIO BROS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Nivel máximo: " + nivelMaximo);
    }
}
