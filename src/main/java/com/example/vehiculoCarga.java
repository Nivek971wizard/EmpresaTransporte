public class vehiculoCarga extends Vehiculo {
    private double capacidad;
    private int ejes;

    
    public vehiculoCarga(String marca, String placa, String modelo, String color, int capacidad, int ejes) {
        super(marca, placa, modelo, color);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }


    public int getCapacidad() {
        return capacidad;
    }


    public int getEjes() {
        return ejes;
    }

    
}
