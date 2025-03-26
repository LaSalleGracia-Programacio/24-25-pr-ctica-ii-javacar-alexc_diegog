package org.JavaCar;

  //Clase abstracta que representa un vehículo alquilable.
public abstract class Vehicle implements Llogable {
    protected String matricula;
    protected String marca;
    protected String model;
    protected double preuBase;
    protected Motor motor;
    protected Roda[] rodes;
    protected String etiquetaAmbiental;

    //Crea un vehículo con todos sus atributos.
    public Vehicle(String matricula, String marca, String model, double preuBase,
                   Motor motor, Roda[] rodes) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = calcularEtiquetaAmbiental();
    }

    // Método abstracto que debe ser implementado en las clases hijas para obtener el tipo de vehículo.
    public abstract TipusVehicle getTipus();

    //Calcula el precio del alquiler.Este método es abstracto y debe ser implementado por las clases hijas.
    public abstract double calcularPreu(int dies);

    //Calcula la etiqueta ambiental del vehículo.La etiqueta se calcula en función del tipo de motor y la potencia del vehículo.
    private String calcularEtiquetaAmbiental() {
        String tipusMotor = motor.getTipus();
        int potencia = motor.getPotencia();
        TipusVehicle tipus = getTipus();

        // Lógica para calcular la etiqueta ambiental de coches y furgonetas.
        if (tipus == TipusVehicle.COTXE || tipus == TipusVehicle.FURGONETA) {
            // Vehículos eléctricos o de pila de combustible
            if (tipusMotor.equals("Elèctric") || tipusMotor.equals("Pila de combustible")) {
                return "Zero emissions";
            }
            // Vehículos híbridos o de gas
            else if (tipusMotor.equals("Híbrid") || tipusMotor.equals("GNC") ||
                    tipusMotor.equals("GLP") || tipusMotor.equals("Gas natural")) {
                if ((tipusMotor.equals("Gasolina") && potencia <= 70) ||
                        (tipusMotor.equals("Dièsel") && potencia <= 75)) {
                    return "ECO";
                }
            }
            // Vehículos de gasolina o diésel
            else if (tipusMotor.equals("Gasolina")) {
                if (potencia >= 160) return "C";
                else if (potencia >= 71 && potencia <= 159) return "B";
            }

            else if (tipusMotor.equals("Dièsel")) {
                if (potencia >= 180) return "C";
                else if (potencia >= 76 && potencia <= 179) return "B";
            }
        }

        // Lógica para calcular la etiqueta ambiental de las motos.
        else if (tipus == TipusVehicle.MOTO) {
            if (tipusMotor.equals("Elèctric") || tipusMotor.equals("Híbrid PHEV")) {
                return "Zero emissions (blava)";
            }
            else if (tipusMotor.equals("Híbrid HEV")) {
                return "ECO";
            }
            else if (potencia >=90) {
                return "C";
            }
            else if (potencia >= 45 && potencia <= 89) {
                return "B";
            }
        }

        // Si no se cumple ninguna de las condiciones anteriores, no se asigna etiqueta ambiental.
        return "Sense etiqueta";
    }

    // Métodos getter para acceder a los atributos del vehículo.
    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public double getPreuBase() { return preuBase; }
    public Motor getMotor() { return motor; }
    public Roda[] getRodes() { return rodes; }
    public String getEtiquetaAmbiental() { return etiquetaAmbiental; }
}
