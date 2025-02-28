/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

import java.util.Scanner;

/**
 *
 * @author Joker
 */
public class mainVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStack vehiculos = new ArrayStack(10);

        System.out.println("Ingrese la cantidad de vehículos:");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el tipo de vehículo :");
            String tipo = scanner.nextLine();
            
            System.out.println("Ingrese la marca:");
            String marca = scanner.nextLine();
            
            System.out.println("Ingrese el modelo:");
            String modelo = scanner.nextLine();
            
            System.out.println("Ingrese el año:");
            int year = scanner.nextInt();
            scanner.nextLine();

            if (tipo.equalsIgnoreCase("Automovil")) {
                System.out.println("Ingrese el número de puertas:");
                int numeroPuertas = scanner.nextInt();
                scanner.nextLine();
                vehiculos.push(new Automovil(marca, modelo, year, numeroPuertas));
            } else if (tipo.equalsIgnoreCase("Motocicleta")) {
                System.out.println("Ingrese el tipo de motocicleta (Deportiva/Scooter/etc.):");
                String tipoMoto = scanner.nextLine();
                vehiculos.push(new Motocicleta(marca, modelo, year, tipoMoto));
            }
        }

        System.out.println("\nMostrando detalles de los vehículos ingresados:");
        while (!vehiculos.isEmpty()) {
            Vehiculo vehiculo = (Vehiculo) vehiculos.pop();
            vehiculo.mostrarDetalles();
            System.out.println();
        }
    }
}

