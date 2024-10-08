public class ReservaService implements CarRentalService {

    private final CarAPI carAPI;
    private final CustomerAPI customerAPI;
    private double costoBase = 100.0;  // Costo base de alquiler de auto
 
     public ReservaService() {
         this.carAPI = new CarAPI();
         this.customerAPI = new CustomerAPI();
     }
 
     public void buscar_disponibilidad_autos(String fechallegada, String fechasalida, String ciudad) {
         carAPI.buscar_Auto(fechallegada, fechasalida, ciudad);
     }
 
     @Override
     public void alquilarAuto(String modelo, String fechaInicio, String fechaFin, String nombreCliente) {
         System.out.println("Auto alquilado: " + modelo);
         customerAPI.registrarCliente(nombreCliente);
         System.out.println("Fecha de inicio: " + fechaInicio + " | Fecha de fin: " + fechaFin);
         System.out.println("Costo base del alquiler: $" + costoBase);
     }
 
     @Override
     public double getCosto() {
         return costoBase;
     }
 }
 