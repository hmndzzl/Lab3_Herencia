//
// Programación orientada a objetos
// Sección 20
// Laboratorio #3 = Herencia
// 
// Hugo Méndez - 241265
//

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Lista para almacenar vehículos
    static ArrayList<Vehiculo> inventario = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false; // Control para el ciclo while del menú

        while (salir == false) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Listar vehículos por categoría");
            System.out.println("3. Buscar vehículo por ID");
            System.out.println("4. Eliminar vehículo");
            System.out.println("5. Mostrar estado de vehículos");
            System.out.println("6. Calcular monto total por estado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Agregar vehículo
                System.out.println("\nSeleccione el tipo de vehículo:");
                System.out.println("1. Auto");
                System.out.println("2. Moto");
                System.out.println("3. Camión");
                int tipo = scanner.nextInt();
                scanner.nextLine();
                
                // Datos generales de los vehículos
                System.out.print("Ingrese la placa: ");
                int placa = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Ingrese la marca: ");
                String marca = scanner.nextLine();
                
                System.out.print("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                
                System.out.print("Ingrese el año: ");
                int anio = scanner.nextInt();
                
                System.out.print("Ingrese el color: ");
                String color = scanner.next();
                
                System.out.print("Ingrese la capacidad del motor (lts): ");
                double capacidadMotor = scanner.nextDouble();
                
                System.out.print("Ingrese la capacidad del tanque: (gal) ");
                double capacidadTanque = scanner.nextDouble();
                
                System.out.print("Ingrese la velocidad máxima: (km/h) ");
                double velocidadMax = scanner.nextDouble();
                
                System.out.print("Ingrese el tipo de transmisión (manual/automatica): ");
                String tipoTransmision = scanner.next();
                
                System.out.print("Ingrese el precio ($): ");
                double precio = scanner.nextDouble();
                
                System.out.print("Ingrese el estado (disponible/reservado/vendido): ");
                String estado = scanner.next();
        
                // Datos específicos de cada tipo de vehículo
                switch (tipo) {
                    case 1: // Auto
                        System.out.print("Ingrese el número de puertas: ");
                        int noPuertas = scanner.nextInt();
                        System.out.print("Ingrese el tamaño de las ruedas: ");
                        double tamanioRuedas = scanner.nextDouble();
                        System.out.print("Ingrese la capacidad del maletero: ");
                        double capacidadMaletero = scanner.nextDouble();
                        Auto auto = new Auto(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado, noPuertas, tamanioRuedas, capacidadMaletero);
                        inventario.add(auto);
                        System.out.println("Auto agregado correctamente.");
                        break;

                    case 2: // Moto
                        System.out.print("Ingrese el tipo de moto (deportiva, crucero, scooter, etc.): ");
                        String tipoMoto = scanner.next();
                        System.out.print("Ingrese el tamaño de las ruedas: ");
                        double tamanioRuedasMoto = scanner.nextDouble();
                        Moto moto = new Moto(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado, tipoMoto, tamanioRuedasMoto);
                        inventario.add(moto);
                        System.out.println("Moto agregada correctamente.");
                        break;

                    case 3: // Camión
                        System.out.print("Ingrese la capacidad de carga (toneladas): ");
                        double capacidadCarga = scanner.nextDouble();
                        System.out.print("Ingrese el número de ejes: ");
                        int noEjes = scanner.nextInt();
                        System.out.print("Ingrese el tamaño de las ruedas: ");
                        double tamanioRuedasCamion = scanner.nextDouble();
                        Camion camion = new Camion(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado, capacidadCarga, noEjes, tamanioRuedasCamion);
                        inventario.add(camion);
                        System.out.println("Camión agregado correctamente.");
                        break;
                    default:
                        System.out.println("Tipo de vehículo no válido."); // Salida por si el usuario ingresa una opción inválida
                }
                    break;

                case 2: // Listar vehículos por categoría
                System.out.println("\nSeleccione la categoría a listar:");
                System.out.println("1. Autos");
                System.out.println("2. Motos");
                System.out.println("3. Camiones");
                int categoria = scanner.nextInt();
        
                switch (categoria) {
                    case 1: // Autos
                        System.out.println("\n--- Listado de Autos ---");
                        for (Vehiculo v : inventario) {
                            if (v instanceof Auto) {
                                System.out.println(v.info());
                            }
                        }
                        break;
                    case 2: // Motos
                        System.out.println("\n--- Listado de Motos ---");
                        for (Vehiculo v : inventario) {
                            if (v instanceof Moto) {
                                System.out.println(v.info());
                            }
                        }
                        break;
                    case 3: // Camiones
                        System.out.println("\n--- Listado de Camiones ---");
                        for (Vehiculo v : inventario) {
                            if (v instanceof Camion) {
                                System.out.println(v.info());
                            }
                        }
                        break;
                    default:
                        System.out.println("Categoría no válida.");
                }
                    break;

                case 3: // Buscar vehículo por placa
                System.out.print("\nIngrese el número de placa a buscar: ");
                int buscarPlaca = scanner.nextInt();
                boolean encontrado = false;

                for (Vehiculo v : inventario) {
                    if (v.getPlaca() == buscarPlaca) { // Vehículo encontrado
                        System.out.println("Vehículo encontrado: " + v.info());
                        encontrado = true;
                    }
                }
                if (!encontrado) { // Vehículo no encontrado
                    System.out.println("Vehículo no encontrado.");
                }
                    break; 

                case 4: // Eliminar vehículo
                System.out.print("\nIngrese el número de placa del vehículo que quiere eliminar ");
                int eliminar = scanner.nextInt();
                boolean eliminado = false;
                
                for (Vehiculo v : inventario) {
                    if (v.getPlaca() == eliminar) { // Vehículo encontrado
                        inventario.remove(v);
                        System.out.println("Vehículo con placa " + eliminar + " eliminado.");
                        eliminado = true;
                        break;
                    }
                }
                if (eliminado == false) { // Vehículo no encontrado
                    System.out.println("Vehículo no encontrado.");
                }
                    break;

                case 5: // Mostar información del estado de los vehículos
                int disponibles = 0, reservados = 0, vendidos = 0;

                for (Vehiculo v : inventario) {
                    switch (v.getEstado().toLowerCase()) {
                        case "disponible":
                            disponibles++;
                            break;
                        case "reservado":
                            reservados++;
                            break;
                        case "vendido":
                            vendidos++;
                            break;
                    }
                }
        
                System.out.println("\n--- Estado de los Vehículos ---");
                System.out.println("Disponibles: " + disponibles);
                System.out.println("Reservados: " + reservados);
                System.out.println("Vendidos: " + vendidos);
                    break;

                case 6: // Calcular monto total por estado de vehículo
                double totalDisponibles = 0, totalReservados = 0, totalVendidos = 0;

                for (Vehiculo v : inventario) {
                    switch (v.getEstado().toLowerCase()) {
                        case "disponible":
                            totalDisponibles += v.getPrecio();
                            break;
                        case "reservado":
                            totalReservados += v.getPrecio();
                            break;
                        case "vendido":
                            totalVendidos += v.getPrecio();
                            break;
                    }
                }
        
                System.out.println("Disponibles: Q" + totalDisponibles);
                System.out.println("Reservados: Q" + totalReservados);
                System.out.println("Vendidos: Q" + totalVendidos);
                    break;

                case 7: // Salir
                    salir = true;
                    System.out.println("Terminando programa...");
                    break;

                default:
                    System.out.println("Error, por favor ingrese una opción válida."); // Salida por si el usuario ingresa una opción inválida
            }
        }
        
        scanner.close(); // Cerrar scanner
        System.out.println("Programa Terminado"); // Confirmación que el programa terminó
    }
    
}
