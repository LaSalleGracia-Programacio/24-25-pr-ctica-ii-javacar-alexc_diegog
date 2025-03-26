package org.JavaCar;

// Clase que representa una moto alquilable.
public class Moto extends Vehicle {
    private int cilindrada;


    // Constructor que inicializa una moto con sus atributos.
    public Moto(String matricula, String marca, String model, double preuBase, int cilindrada, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.cilindrada = cilindrada;
    }

    // Calcula el precio del alquiler de la moto en función de los días.
    // Si la cilindrada es superior a 500 cc, se añade un recargo de 5 unidades.
    @Override
    public double calcularPreu(int dies) {
        double preuFinal = preuBase;
        if (cilindrada > 500) {
            preuFinal += 5;
        }
        return preuFinal * dies;

        // Devuelve el tipo de vehículo (MOTO).
    }
    @Override
    public TipusVehicle getTipus() {
        return TipusVehicle.MOTO;
    }

    public int getCilindrada() { return cilindrada; }
}
