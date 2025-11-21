package dispositivos;

public class Laptop extends Dispositivo {

    private int ram;

    public Laptop(String marca, String modelo, double precio, int ram) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.ram = ram;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RAM: " + ram + " GB");
    }
}
