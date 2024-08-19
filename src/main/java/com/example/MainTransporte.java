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
        Vehiculo vehiculoCarga1 = new Vehiculo ("abc234","2019","toyota","rojo",40);
        propietario1.addVehiculo(vehiculoCarga1);

    }
    
}
