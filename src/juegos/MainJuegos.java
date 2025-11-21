package juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJuegos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENU JUEGOS =====");
            System.out.println("1. Registrar Mario Bros");
            System.out.println("2. Registrar Carrera de Vehiculos");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Filtrar por tipo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {

                    case 1:
                        System.out.print("Nombre: ");
                        String n1 = sc.nextLine();

                        System.out.print("Precio: ");
                        double p1 = sc.nextDouble();

                        System.out.print("Nivel máximo: ");
                        int nivel = sc.nextInt();

                        lista.add(new MarioBros(n1, p1, nivel));
                        break;

                    case 2:
                        System.out.print("Nombre: ");
                        String n2 = sc.nextLine();

                        System.out.print("Precio: ");
                        double p2 = sc.nextDouble();

                        System.out.print("Cantidad autos: ");
                        int autos = sc.nextInt();

                        lista.add(new CarreraVehiculos(n2, p2, autos));
                        break;

                    case 3:
                        for (Juego j : lista) {
                            j.mostrarDetalles();
                            System.out.println("-------------------");
                        }
                        break;

                    case 4:
                        System.out.print("Nombre a buscar: ");
                        String busc = sc.nextLine();

                        for (Juego j : lista) {
                            if (j.nombre.equalsIgnoreCase(busc)) {
                                j.mostrarDetalles();
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Tipo (mario/carrera): ");
                        String tipo = sc.nextLine();

                        for (Juego j : lista) {
                            if (tipo.equalsIgnoreCase("mario") && j instanceof MarioBros) {
                                j.mostrarDetalles();
                            }
                            if (tipo.equalsIgnoreCase("carrera") && j instanceof CarreraVehiculos) {
                                j.mostrarDetalles();
                            }
                        }
                        break;
                }

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 0);

        System.out.println("Fin del programa.");
    }
}
