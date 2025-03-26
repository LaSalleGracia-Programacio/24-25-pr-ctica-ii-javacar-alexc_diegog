package org.JavaCar;

class Solicitud {
    private String matricula;
    private String client;
    private int dies;

    // Constructor que inicializa una solicitud con matrícula, cliente y número de días.
    public Solicitud(String matricula, String client, int dies) {
        this.matricula = matricula;
        this.client = client;
        this.dies = dies;
    }

    // Devuelve la matrícula del vehículo solicitado.
    public String getMatricula() {
        return matricula;
    }


    // Devuelve el nombre del cliente que realiza la solicitud.
    public String getClient() {
        return client;
    }

    // Devuelve el número de días de la solicitud.
    public int getDies() {
        return dies;
    }
}