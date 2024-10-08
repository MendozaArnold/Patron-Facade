public interface CarRentalService {
    void alquilarAuto(String modelo, String fechaInicio, String fechaFin, String nombreCliente);
    double getCosto();
}
