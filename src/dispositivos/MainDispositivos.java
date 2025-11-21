package dispositivos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDispositivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Dispositivo> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENU DISPOSITIVOS =====");
            System.out.println("1. Registrar Laptop");
            System.out.println("2. Registrar Teléfono");
            System.out.println("3. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            try {
                switch (opcion) {

                    case 1: // Laptop
                        System.out.print("Marca: ");
                        String marcaL = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modeloL = sc.nextLine();

                        System.out.print("Precio: ");
                        double precioL = sc.nextDouble();

                        System.out.print("RAM (GB): ");
                        int ram = sc.nextInt();

                        lista.add(new Laptop(marcaL, modeloL, precioL, ram));
                        System.out.println("Laptop registrada exitosamente.");
                        break;

                    case 2: // Telefono
                        System.out.print("Marca: ");
                        String marcaT = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modeloT = sc.nextLine();

                        System.out.print("Precio: ");
                        double precioT = sc.nextDouble();

                        System.out.print("Pulgadas de pantalla: ");
                        double pulgadas = sc.nextDouble();

                        lista.add(new Telefono(marcaT, modeloT, precioT, pulgadas));
                        System.out.println("Teléfono registrado exitosamente.");
                        break;

                    case 3: // Mostrar
                        System.out.println("\n=== LISTA DE DISPOSITIVOS ===");
                        for (Dispositivo d : lista) {
                            d.mostrarInfo();
                            System.out.println("-------------------------------");
                        }
                        break;

                } // fin switch

            } catch (DatoInvalidoException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}
