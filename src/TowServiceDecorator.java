public class TowServiceDecorator extends RentalDecorator {
    private double costoGrúa = 50.0;  // Costo adicional por el servicio de grúa

    public TowServiceDecorator(CarRentalService rentalService) {
        super(rentalService);
    }

    @Override
    public void alquilarAuto(String modelo, String fechaInicio, String fechaFin, String nombreCliente) {
        super.alquilarAuto(modelo, fechaInicio, fechaFin, nombreCliente);
        System.out.println("Se ha añadido el servicio de grúa al alquiler.");
    }

    @Override
    public double getCosto() {
        return super.getCosto() + costoGrúa;
    }
}
