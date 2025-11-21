package dispositivos;

public class Telefono extends Dispositivo {

    private double pulgadas;

    public Telefono(String marca, String modelo, double precio, double pulgadas) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pantalla: " + pulgadas + " pulgadas");
    }
}
