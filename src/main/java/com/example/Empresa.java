public class Empresa {
    private String nombre;
    private list<Propietario> propietarios;
    
    public Empresa(String nombre, list<Propietario> propietarios) {
        this.nombre = nombre;
        this.propietarios = propietarios;
    }

    public String getNombre() {
        return nombre;
    }

    public list<Propietario> getPropietarios() {
        return propietarios;
    }

    
    
}
