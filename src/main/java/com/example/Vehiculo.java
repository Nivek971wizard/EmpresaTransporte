public abstract class Vehiculo {
    

    private String marca;
    private String placa;
    private String modelo;
    private String color;

    
    public Vehiculo(String marca, String placa, String modelo, String color) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }


    public String getPlaca() {
        return placa;
    }


    public String getModelo() {
        return modelo;
    }


    public String getColor() {
        return color;
    }


    
    


}
