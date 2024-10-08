## Actividad
Implementando el patrón Decorator, crea un sistema de alquiler de autos que incluya las siguientes funcionalidades:

- **Reserva de Autos**
  - **Servicio de reserva básico** que permita alquilar un auto.
  - **Servicio adicional de grúa** que pueda ser añadido a la reserva.

**Clases a implementar:**
- **CarRentalService** (interfaz)
- **ReservaService** (implementa CarRentalService)
- **RentalDecorator** (clase abstracta que implementa CarRentalService)
- **TowServiceDecorator** (extiende RentalDecorator)

**Funcionalidades adicionales:**
- Crear clases `CarAPI` y `CustomerAPI` para gestionar la búsqueda de autos disponibles y el registro de clientes, respectivamente.

**Instrucciones:**
1. Define la interfaz `CarRentalService` con los métodos necesarios.
2. Implementa `ReservaService` que incluya el uso de `CarAPI` y `CustomerAPI`.
3. Crea `RentalDecorator` como una clase abstracta para extender funcionalidades.
4. Implementa `TowServiceDecorator` para añadir el servicio de grúa a la reserva.
5. En la clase `Main`, demuestra el uso del sistema de reservas y el servicio de grúa.

### Ejemplo de uso
En la clase `Main`, puedes implementar la lógica para alquilar un auto con y sin el servicio de grúa, y mostrar los costos correspondientes.