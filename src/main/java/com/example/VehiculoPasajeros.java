public class VehiculoPasajeros extends Vehiculo {
    private int numeropasajeros;

    public VehiculoPasajeros(String marca, String placa, String modelo, String color, int numeropasajeros) {
        super(marca, placa, modelo, color);
        this.numeropasajeros = numeropasajeros;
    }

    public int getNumeropasajeros() {
        return numeropasajeros;
    }

    
}
