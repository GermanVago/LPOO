public class Main {
    // Clase Padre: Vehículo
    static class Vehículo {
        // Atributos
        private String marca;
        private String modelo;
        private int capacidad;
        private String color;

        // Constructor
        public Vehículo(String marca, String modelo, int capacidad, String color) {
            this.marca = marca;
            this.modelo = modelo;
            this.capacidad = capacidad;
            this.color = color;
        }

        // Getters y Setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Métodos
        public void acelerar() {
            System.out.println("El vehículo está acelerando.");
        }

        public void frenar() {
            System.out.println("El vehículo está frenando.");
        }
    }

    // Clase Hija: Autobús
    static class Autobús extends Vehículo {
        // Atributos adicionales
        private String tipoRutas;
        private int numPasajerosActuales;

        // Constructor
        public Autobús(String marca, String modelo, int capacidad, String color, String tipoRutas, int numPasajerosActuales) {
            super(marca, modelo, capacidad, color);
            this.tipoRutas = tipoRutas;
            this.numPasajerosActuales = numPasajerosActuales;
        }

        // Getters y Setters
        public String getTipoRutas() {
            return tipoRutas;
        }

        public void setTipoRutas(String tipoRutas) {
            this.tipoRutas = tipoRutas;
        }

        public int getNumPasajerosActuales() {
            return numPasajerosActuales;
        }

        public void setNumPasajerosActuales(int numPasajerosActuales) {
            this.numPasajerosActuales = numPasajerosActuales;
        }

        // Métodos adicionales
        public void subirPasajeros(int cantidad) {
            numPasajerosActuales += cantidad;
            System.out.println(cantidad + " pasajeros subieron. Total: " + numPasajerosActuales);
        }

        public void bajarPasajeros(int cantidad) {
            if (cantidad <= numPasajerosActuales) {
                numPasajerosActuales -= cantidad;
                System.out.println(cantidad + " pasajeros bajaron. Total: " + numPasajerosActuales);
            } else {
                System.out.println("No hay suficientes pasajeros para bajar.");
            }
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        // Crear un objeto de la clase Autobús
        Autobús miAutobús = new Autobús("Mercedes-Benz", "Sprinter", 30, "Blanco", "Urbano", 10);

        // Asignar y leer atributos
        System.out.println("Marca: " + miAutobús.getMarca());
        System.out.println("Modelo: " + miAutobús.getModelo());
        System.out.println("Capacidad: " + miAutobús.getCapacidad());
        System.out.println("Color: " + miAutobús.getColor());
        System.out.println("Tipo de rutas: " + miAutobús.getTipoRutas());
        System.out.println("Número de pasajeros actuales: " + miAutobús.getNumPasajerosActuales());

        // Métodos de la clase padre
        miAutobús.acelerar();
        miAutobús.frenar();

        // Métodos de la clase hija
        miAutobús.subirPasajeros(5);
        miAutobús.bajarPasajeros(3);
        miAutobús.bajarPasajeros(15); // Intento de bajar más pasajeros de los que hay
    }
}
