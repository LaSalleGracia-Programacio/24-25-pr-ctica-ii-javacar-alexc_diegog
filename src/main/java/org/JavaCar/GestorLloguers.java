package org.JavaCar;

import java.util.List;
import java.util.ArrayList;


public class GestorLloguers {

    // Calcula el total de ingresos por el alquiler de una lista de vehículos durante un número determinado de días.
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calcularPreu(dies);
        }
        return total;
    }

    // Filtra los vehículos cuya tarifa base sea menor o igual al precio máximo especificado.
    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        List<Vehicle> filtrats = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPreuBase() <= preuMax) {
                filtrats.add(vehicle);
            }
        }
        return filtrats;
    }
}
