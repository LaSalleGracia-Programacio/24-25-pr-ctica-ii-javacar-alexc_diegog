package org.JavaCar;


// Clase que representa un motor con su tipo y potencia.
public class Motor {
    String tipus;
    int potencia;

    // Constructor que inicializa un motor con su tipo y potencia.
    public Motor(String tipus, int potencia) {
        this.tipus = tipus;
        this.potencia = potencia;
    }
    // Devuelve el tipo de motor.
    public String getTipus() { return tipus; }
    // Devuelve la potencia del motor.
    public int getPotencia() { return potencia; }
}