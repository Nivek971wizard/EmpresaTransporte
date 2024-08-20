package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class MainTransporte {

    private List<Propietario> propietarios = new ArrayList<>();

    public static void main(String[] args) {

        MainTransporte app = new MainTransporte();
        app.datosDePrueba();

        double peso = 1000.0;
        app.obtenerUsuariosPorPeso(peso);

        String placa = "wqwe223";
        int viajesDia = 3;
        app.obtenerUsuariosMovilizadosPorPlaca(placa, viajesDia);

        app.obtenerNumeroPropietariosMayores40();

        int edadMin = 18;
        int edadMax = 50;
        app.contarUsuariosEnRangoEdad(edadMin, edadMax);
    }

    public void datosDePrueba() {
        Propietario propietario1 = new Propietario("Kevin", "1234567", "kev@gmail.com", "3245678", 45);
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga("abc234", "2019", "Toyota", "Rojo", 40.0, 7);
        propietario1.addVehiculo(vehiculoCarga1);

        Propietario propietario2 = new Propietario("nicolas gei", "87654321", "nico@example.com", "311578", 35);
        VehiculoPasajeros vehiculoPasajeros1 = new VehiculoPasajeros("sdf123", "2008", "BMW", "Negro", 40);
        propietario2.addVehiculo(vehiculoPasajeros1);

        propietarios.add(propietario1);
        propietarios.add(propietario2);
    }

    public void obtenerUsuariosPorPeso(double peso) {
        System.out.println("\nUsuarios con vehículos de carga que superan el peso de " + peso + "kg:");
        for (Propietario propietario : propietarios) {
            for (Vehiculo vehiculo : propietario.getVehiculos()) {
                if (vehiculo instanceof VehiculoCarga) {
                    VehiculoCarga vehiculoCarga = (VehiculoCarga) vehiculo;
                    if (vehiculoCarga.getCapacidad() > peso) {
                        System.out.println(
                                "Nombre: " + propietario.getNombre() + ", ID: " + propietario.getIdentificacion());
                    }
                }
            }
        }
    }

    public void obtenerUsuariosMovilizadosPorPlaca(String placa, int numeroViajes) {
        for (Propietario propietario : propietarios) {
            for (Vehiculo vehiculo : propietario.getVehiculos()) {
                if (vehiculo instanceof VehiculoPasajeros && vehiculo.getPlaca().equals(placa)) {
                    VehiculoPasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculo;
                    int totalPasajeros = vehiculoPasajeros.getNumeroPasajeros() * numeroViajes;
                    System.out.println(
                            "Total de usuarios movilizados en el vehículo con placa " + placa + ": " + totalPasajeros);
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
