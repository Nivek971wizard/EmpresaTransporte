public class Propietario {

    private String nombre;
    private String id;
    private String email;
    private String celular;
    private list<Vehiculo> vehiculos;


    public Propietario(String nombre, String id, String email, String celular, list<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.celular = celular;
        this.vehiculos = vehiculos;
    }



    public String getNombre() {
        return nombre;
    }



    public String getId() {
        return id;
    }



    public String getEmail() {
        return email;
    }



    public String getCelular() {
        return celular;
    }



    public list<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    



}