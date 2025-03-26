package org.JavaCar;

public class Cotxe extends Vehicle {
    private int nombrePlaces;

    // Constructor que inicializa un coche con sus atributos, incluyendo la matrícula, marca, modelo, precio base,
    // el número de plazas, el motor y las ruedas.
    public Cotxe(String matricula, String marca, String model, double preuBase, int nombrePlaces, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.nombrePlaces = nombrePlaces;
    }
