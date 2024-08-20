import java.util.ArrayList;
import java.util.List;

public class MainTransporte {
    
    /**
     * 
     */
    public static void main(String[] args ) {

        MainTransporte app = new MainTransporte();
        app.inicializardatosprueba();

        double peso = 1000.0;
        app.obetenerUsuarioPorPeso (peso);
    
        String placa = "wqwe223";
        int viajesDia = 3;
        app.usuariosPorPlaca(placa, viajesDia);
        
        app.numeroPropietariosMayores40();

        int edadMin = 18; 
        int edadMax = 50; 
        app.contarUsuariosEnRangoEdad(edadMin, edadMax);
    
    }   
    public void datosDePrueba (){


        Propietario propietario = new Propietario("kevin", 1234567,"kev@gmail.com", 3245678, 45);
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga ("abc234","2019","toyota","rojo",40);
        propietario1.addVehiculo(vehiculoCarga1);


        Propietario propietario2 = new Propietario("María López", "87654321", "maria@example.com", "555-5678", 35);
        VehiculoDePasajeros vehiculoPasajeros1 = new VehiculoDePasajeros("sdf123", "2008", "bmw", "negro", 40);
        propietario2.addVehiculo(vehiculoPasajeros1);
        
        propietarios.add(propietario1);
        propietarios.add(propietario2);

    }
    
    public void obetenerUsuarioPorPeso (double peso){

        System.out.println("\nUsuarios con vehículos de carga que superan el peso de " + peso + "kg:");
        for (Propietario propietario : propietarios) {
            for (Vehiculo vehiculo : propietario.getVehiculos()) {
                if (Vehiculo instanceof vehiculoCarga) {
                    VehiculoDeCarga vehiculoCarga = (VehiculoCarga) vehiculo;
                    if (vehiculoCarga.getCapacidadDeCarga() > peso) {
                        System.out.println("Nombre: " + propietario.getNombre() + ", ID: " + propietario.getIdentificacion());
                    }
                }
            }
        }

    }

    public void obtenerUsuariosMovilizadosPorPlaca(String placa, int numeroViajes) {
        for (Propietario propietario : propietarios) {
            for (Vehiculo vehiculo : propietario.getVehiculos()) {
                if (Vehiculo instanceof VehiculoPasajeros && vehiculo.getPlaca().equals(placa)) {
                    VehiculoDePasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculo;
                    int totalPasajeros = vehiculoPasajeros.getMaximoPasajeros() * viajesDia;
                    System.out.println("Total de usuarios movilizados en el vehículo con placa " + placa + ": " + totalPasajeros);
                    return;
                }
            }
        }
        System.out.println("No se encontró un vehículo de pasajeros con la placa indicada.");
    }

    public void obtenerNumeroPropietariosMayores40() {
        int count = 0;
        for (Propietario propietario : propietarios) {
            if (propietario.getEdad() > 40) {
                count++;
            }
        }
        System.out.println("Número de propietarios mayores de 40 años: " + count);
    }

    public void contarUsuariosEnRangoEdad(int edadMin, int edadMax) {
        int count = 0;
        for (Propietario propietario : propietarios) {
            if (propietario.getEdad() >= edadMin && propietario.getEdad() <= edadMax) {
                count++;
            }
        }
        System.out.println("Número de usuarios en el rango de edad " + edadMin + " - " + edadMax + ": " + count);
    }
}
