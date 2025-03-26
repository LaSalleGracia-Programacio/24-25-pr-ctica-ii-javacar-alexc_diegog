package org.JavaCar;

//Clase que representa una rueda.
public class Roda {
    private String marca;
    private double diametre;

    // Constructor que inicializa una rueda con su marca y diámetro.
    public Roda(String marca, double diametre) {
        this.marca = marca;
        this.diametre = diametre;
    }
    // Devuelve la marca de la rueda.
    public String getMarca() { return marca; }
    // Devuelve el diámetro de la rueda.
    public double getDiametre() { return diametre; }
}