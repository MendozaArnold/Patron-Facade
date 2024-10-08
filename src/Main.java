public class Main {
    public static void main(String[] args) {
        // Crear un servicio de reserva básico
        CarRentalService reservaBasica = new ReservaService();
        
        System.out.println("Alquiler de auto sin servicio de grúa:");
        reservaBasica.alquilarAuto("Toyota Corolla", "12/09/2024", "15/09/2024", "Juan Perez");
        System.out.println("Costo total: $" + reservaBasica.getCosto());

        // Agregar el servicio de grúa mediante el decorador
        CarRentalService reservaConGrua = new TowServiceDecorator(reservaBasica);

        System.out.println("\nAlquiler de auto con servicio de grúa:");
        reservaConGrua.alquilarAuto("Toyota Corolla", "12/09/2024", "15/09/2024", "Juan Perez");
        System.out.println("Costo total con grúa: $" + reservaConGrua.getCosto());
    }
}