public class Bicicleta {
    // Atributos de la bicicleta
    private String color;
    private String tamañoCuadro;
    private String tamañoRueda;
    private Rueda rueda;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(String color, String tamañoCuadro, String tamañoRueda) {
        this.color = color;
        this.tamañoCuadro = tamañoCuadro;
        this.tamañoRueda = tamañoRueda;
        this.rueda = new Rueda(tamañoRueda);
        this.cuadro = new Cuadro(tamañoCuadro);
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamañoCuadro() {
        return tamañoCuadro;
    }

    public void setTamañoCuadro(String tamañoCuadro) {
        this.tamañoCuadro = tamañoCuadro;
        cuadro.setTamaño(tamañoCuadro);
    }

    public String getTamañoRueda() {
        return tamañoRueda;
    }

    public void setTamañoRueda(String tamañoRueda) {
        this.tamañoRueda = tamañoRueda;
        rueda.setTamaño(tamañoRueda);
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la bicicleta:");
        System.out.println("Color: " + getColor());
        System.out.println("Tamaño del cuadro: " + cuadro.getTamaño());
        System.out.println("Tamaño de la rueda: " + rueda.getTamaño());
    }

    // Clase anidada Rueda
    public class Rueda {
        private String tamaño;

        public Rueda(String tamaño) {
            this.tamaño = tamaño;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public void inflarRueda() {
            System.out.println("La rueda de tamaño " + tamaño + " está inflándose.");
        }
    }

    // Clase anidada Cuadro
    public class Cuadro {
        private String tamaño;

        public Cuadro(String tamaño) {
            this.tamaño = tamaño;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        public void repararCuadro() {
            System.out.println("Reparando el cuadro de tamaño " + tamaño + ".");
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Crear objeto Bicicleta
        Bicicleta bicicleta = new Bicicleta("Rojo", "M", "26 pulgadas");

        // Mostrar detalles de la bicicleta
        bicicleta.mostrarDetalles();

        // Inflar rueda y reparar cuadro
        bicicleta.rueda.inflarRueda();
        bicicleta.cuadro.repararCuadro();
    }
}
