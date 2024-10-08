public abstract class RentalDecorator implements CarRentalService {
    protected CarRentalService rentalService;

    public RentalDecorator(CarRentalService rentalService) {
        this.rentalService = rentalService;
    }

    @Override
    public void alquilarAuto(String modelo, String fechaInicio, String fechaFin, String nombreCliente) {
        rentalService.alquilarAuto(modelo, fechaInicio, fechaFin, nombreCliente);
    }

    @Override
    public double getCosto() {
        return rentalService.getCosto();
    }
}
