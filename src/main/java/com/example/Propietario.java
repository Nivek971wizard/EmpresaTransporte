public class Propietario {

    private String nombre;
    private String identificacion;
    private String email;
    private String celular;
    private int edad;
    private List<Vehiculo> vehiculos;


    public Propietario(String nombre, String identificacion, String email, String celular, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
        this.vehiculos = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public String getIdentificacion() {
        return identificacion;
    }


    public String getEmail() {
        return email;
    }


    public String getCelular() {
        return celular;
    }


    public int getEdad() {
        return edad;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }


}