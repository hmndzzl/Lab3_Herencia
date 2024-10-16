//
// Programación orientada a objetos
// Sección 20
// Laboratorio #3 = Herencia
// 
// Hugo Méndez - 241265
//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI {

    // Lista para almacenar vehículos
    static ArrayList<Vehiculo> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // Crear el frame principal
        JFrame frame = new JFrame("Gestión de Vehículos");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        // Etiqueta para título
        JLabel titleLabel = new JLabel("Sistema de Gestión de Vehículos", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        // Botones de menú
        JButton agregarButton = new JButton("Agregar Vehículo");
        JButton listarButton = new JButton("Listar Vehículos");
        JButton buscarButton = new JButton("Buscar Vehículo por Placa");
        JButton eliminarButton = new JButton("Eliminar Vehículo");
        JButton mostrarEstadoButton = new JButton("Mostrar Estado de Vehículos");
        JButton calcularMontoButton = new JButton("Calcular Monto Total por Estado");
        JButton salirButton = new JButton("Salir");

        // Agregar botones al panel
        panel.add(agregarButton);
        panel.add(listarButton);
        panel.add(buscarButton);
        panel.add(eliminarButton);
        panel.add(mostrarEstadoButton);
        panel.add(calcularMontoButton);
        panel.add(salirButton);

        // Agregar el panel al frame
        frame.add(panel);
        frame.setVisible(true);

        // Acción del botón "Agregar Vehículo"
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarVehiculo();
            }
        });

        // Acción del botón "Listar Vehículos"
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarVehiculos();
            }
        });

        // Acción del botón "Buscar Vehículo"
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarVehiculo();
            }
        });

        // Acción del botón "Eliminar Vehículo"
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarVehiculo();
            }
        });

        // Acción del botón "Mostrar Estado de Vehículos" (Opción 5)
        mostrarEstadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEstadoVehiculos();
            }
        });

        // Acción del botón "Calcular Monto Total por Estado" (Opción 6)
        calcularMontoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMontoPorEstado();
            }
        });

        // Acción del botón "Salir"
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Termina el programa
            }
        });
    }

    // Método para agregar un vehículo
    public static void agregarVehiculo() {
        JFrame agregarFrame = new JFrame("Agregar Vehículo");
        agregarFrame.setSize(400, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        // Crear campos de entrada
        JTextField placaField = new JTextField();
        JTextField marcaField = new JTextField();
        JTextField modeloField = new JTextField();
        JTextField anioField = new JTextField();
        JTextField colorField = new JTextField();
        JTextField capacidadMotorField = new JTextField();
        JTextField capacidadTanqueField = new JTextField();
        JTextField velocidadMaxField = new JTextField();
        JTextField tipoTransmisionField = new JTextField();
        JTextField precioField = new JTextField();
        JTextField estadoField = new JTextField();

        // Etiquetas para cada campo
        panel.add(new JLabel("Placa:"));
        panel.add(placaField);
        panel.add(new JLabel("Marca:"));
        panel.add(marcaField);
        panel.add(new JLabel("Modelo:"));
        panel.add(modeloField);
        panel.add(new JLabel("Año:"));
        panel.add(anioField);
        panel.add(new JLabel("Color:"));
        panel.add(colorField);
        panel.add(new JLabel("Capacidad del Motor (lts):"));
        panel.add(capacidadMotorField);
        panel.add(new JLabel("Capacidad del Tanque (gal):"));
        panel.add(capacidadTanqueField);
        panel.add(new JLabel("Velocidad Máxima (km/h):"));
        panel.add(velocidadMaxField);
        panel.add(new JLabel("Tipo de Transmisión:"));
        panel.add(tipoTransmisionField);
        panel.add(new JLabel("Precio ($):"));
        panel.add(precioField);
        panel.add(new JLabel("Estado (disponible/reservado/vendido):"));
        panel.add(estadoField);

        // Botón para agregar vehículo
        JButton agregarVehiculoButton = new JButton("Agregar Vehículo");
        panel.add(agregarVehiculoButton);

        agregarVehiculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int placa = Integer.parseInt(placaField.getText());
                    String marca = marcaField.getText();
                    String modelo = modeloField.getText();
                    int anio = Integer.parseInt(anioField.getText());
                    String color = colorField.getText();
                    double capacidadMotor = Double.parseDouble(capacidadMotorField.getText());
                    double capacidadTanque = Double.parseDouble(capacidadTanqueField.getText());
                    double velocidadMax = Double.parseDouble(velocidadMaxField.getText());
                    String tipoTransmision = tipoTransmisionField.getText();
                    double precio = Double.parseDouble(precioField.getText());
                    String estado = estadoField.getText();

                    // Crear y agregar un nuevo vehículo (puedes expandir para autos, motos y camiones)
                    Vehiculo vehiculo = new Auto(placa, marca, modelo, anio, color, capacidadMotor, capacidadTanque, velocidadMax, tipoTransmision, precio, estado, 4, 15.0, 400.0); // ejemplo Auto
                    inventario.add(vehiculo);

                    JOptionPane.showMessageDialog(agregarFrame, "Vehículo agregado correctamente.");
                    agregarFrame.dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(agregarFrame, "Error en los datos ingresados.");
                }
            }
        });

        agregarFrame.add(panel);
        agregarFrame.setVisible(true);
    }

    // Método para listar vehículos
    public static void listarVehiculos() {
        JFrame listarFrame = new JFrame("Listar Vehículos");
        listarFrame.setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        if (inventario.isEmpty()) {
            panel.add(new JLabel("No hay vehículos en el inventario."));
        } else {
            for (Vehiculo v : inventario) {
                panel.add(new JLabel(v.info()));
            }
        }

        listarFrame.add(panel);
        listarFrame.setVisible(true);
    }

    // Método para buscar un vehículo por placa
    public static void buscarVehiculo() {
        String placaStr = JOptionPane.showInputDialog("Ingrese el número de placa:");
        if (placaStr != null) {
            int placa = Integer.parseInt(placaStr);
            boolean encontrado = false;

            for (Vehiculo v : inventario) {
                if (v.getPlaca() == placa) {
                    JOptionPane.showMessageDialog(null, "Vehículo encontrado: " + v.info());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            }
        }
    }

    // Método para eliminar un vehículo
    public static void eliminarVehiculo() {
        String placaStr = JOptionPane.showInputDialog("Ingrese el número de placa para eliminar:");
        if (placaStr != null) {
            int placa = Integer.parseInt(placaStr);
            boolean eliminado = false;

            for (Vehiculo v : inventario) {
                if (v.getPlaca() == placa) {
                    inventario.remove(v);
                    JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                    eliminado = true;
                    break;
                }
            }
            if (!eliminado) {
                JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            }
        }
    }

    // Opción 5: Mostrar estado de los vehículos
    public static void mostrarEstadoVehiculos() {
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

        JOptionPane.showMessageDialog(null, "Estado de los Vehículos:\nDisponibles: " + disponibles + "\nReservados: " + reservados + "\nVendidos: " + vendidos);
    }

    // Opción 6: Calcular monto total por estado
    public static void calcularMontoPorEstado() {
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

        JOptionPane.showMessageDialog(null, "Monto Total:\nDisponibles: Q" + totalDisponibles + "\nReservados: Q" + totalReservados + "\nVendidos: Q" + totalVendidos);
    }
}


