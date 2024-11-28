// Nivel 3: Interfaz para polimorfismo dinámico
interface Vehiculo {
    void mostrarInfo(); // Polimorfismo dinámico
    double calcularTarifa();
}

// Nivel 2: Clase abstracta para herencia
abstract class Transporte implements Vehiculo {
    // Nivel 1: Sobrecarga en la misma clase
    public double calcularTarifa(double distancia) {
        return distancia * 2.0; // Tarifa base
    }

    public double calcularTarifa(double distancia, int pasajeros) {
        return calcularTarifa(distancia) * pasajeros; // Tarifa por pasajero
    }

    // Nivel 2: Método heredado puede ser sobrescrito
    @Override
    public abstract void mostrarInfo();
}

// Nivel 2 y 3: Clases concretas que sobrescriben métodos
class Autobus extends Transporte {
    @Override
    public double calcularTarifa() {
        return calcularTarifa(10.0, 50); // Sobrecarga en uso
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un Autobus. Transporto muchos pasajeros.");
    }
}

class Taxi extends Transporte {
    @Override
    public double calcularTarifa() {
        return calcularTarifa(10.0) + 5.0; // Sobrecarga en uso
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un Taxi. Transporte personalizado.");
    }
}

class Bicicleta extends Transporte {
    @Override
    public double calcularTarifa() {
        return 0.0; // Las bicicletas no tienen tarifa
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy una Bicicleta. Medio de transporte ecológico.");
    }
}

// Clase principal para demostrar el polimorfismo
public class PolimorfismoTest {
    public static void main(String[] args) {
        // Polimorfismo dinámico (Nivel 3)
        Vehiculo vehiculo1 = new Autobus();
        Vehiculo vehiculo2 = new Taxi();
        Vehiculo vehiculo3 = new Bicicleta();

        // Invocación de métodos usando polimorfismo
        mostrarDetalles(vehiculo1);
        mostrarDetalles(vehiculo2);
        mostrarDetalles(vehiculo3);
    }

    public static void mostrarDetalles(Vehiculo vehiculo) {
        vehiculo.mostrarInfo(); // Polimorfismo dinámico en acción
        System.out.println("Tarifa calculada: " + vehiculo.calcularTarifa());
    }
}