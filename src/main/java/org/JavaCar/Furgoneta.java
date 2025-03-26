package org.JavaCar;


public class Furgoneta extends Vehicle {
    private double capacitatCarga;
    // Constructor de la clase Furgoneta que inicializa sus atributos.


    public Furgoneta(String matricula, String marca, String model, double preuBase, double capacitatCarga, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.capacitatCarga = capacitatCarga;
    }

    // Calcula el precio del alquiler de la furgoneta en función de los días.
    // Si la capacidad de carga supera los 1000 kg, se añade un recargo de 10 unidades.
    @Override
    public double calcularPreu(int dies) {
        double preuFinal = preuBase;
        if (capacitatCarga > 1000) {
            preuFinal += 10;
        }
        return preuFinal * dies;
    }
    // Devuelve el tipo de vehículo (FURGONETA).
    @Override
    public TipusVehicle getTipus() {
        return TipusVehicle.FURGONETA;
    }
//Añadido getter para la capacidad de carga
    public double getCapacitatCarga() { return capacitatCarga; }
}