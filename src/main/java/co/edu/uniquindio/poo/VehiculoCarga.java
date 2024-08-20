package co.edu.uniquindio.poo;

public class VehiculoCarga extends Vehiculo { // Nombre de la clase corregido a "VehiculoCarga"
    private double capacidad; // Se mantiene como double
    private int ejes;

    // Constructor con el nombre correcto
    public VehiculoCarga(String marca, String placa, String modelo, String color, double capacidad, int ejes) {
        super(marca, placa, modelo, color);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    // Método corregido para retornar double
    public double getCapacidad() {
        return capacidad;
    }

    public int getEjes() {
        return ejes;
    }
}
