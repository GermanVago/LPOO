public class CuerpoHumano {
    // Atributos del cuerpo humano
    private int edad;
    private String sexo;
    private int ritmoCardiaco;
    private int capacidadRespiratoria;
    private Corazon corazon;
    private Pulmon pulmon;

    // Constructor
    public CuerpoHumano(int edad, String sexo, int ritmoCardiaco, int capacidadRespiratoria) {
        this.edad = edad;
        this.sexo = sexo;
        this.ritmoCardiaco = ritmoCardiaco;
        this.capacidadRespiratoria = capacidadRespiratoria;
        this.corazon = new Corazon(ritmoCardiaco);
        this.pulmon = new Pulmon(capacidadRespiratoria);
    }

    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
        corazon.setRitmo(ritmoCardiaco);
    }

    public int getCapacidadRespiratoria() {
        return capacidadRespiratoria;
    }

    public void setCapacidadRespiratoria(int capacidadRespiratoria) {
        this.capacidadRespiratoria = capacidadRespiratoria;
        pulmon.setCapacidad(capacidadRespiratoria);
    }

    public void mostrarEstado() {
        System.out.println("Estado del cuerpo humano:");
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Ritmo cardiaco: " + corazon.getRitmo());
        System.out.println("Capacidad respiratoria: " + pulmon.getCapacidad());
    }

    // Clase anidada Corazón
    public class Corazon {
        private int ritmo;

        public Corazon(int ritmo) {
            this.ritmo = ritmo;
        }

        public int getRitmo() {
            return ritmo;
        }

        public void setRitmo(int ritmo) {
            this.ritmo = ritmo;
        }

        public void bombearSangre() {
            System.out.println("El corazón está bombeando sangre a " + ritmo + " latidos por minuto.");
        }
    }

    // Clase anidada Pulmón
    public class Pulmon {
        private int capacidad;

        public Pulmon(int capacidad) {
            this.capacidad = capacidad;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public void respirar() {
            System.out.println("Los pulmones están respirando con una capacidad de " + capacidad + " ml.");
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Crear objeto Cuerpo Humano
        CuerpoHumano cuerpoHumano = new CuerpoHumano(30, "Masculino", 70, 5000);

        // Mostrar estado del cuerpo humano
        cuerpoHumano.mostrarEstado();

        // Usar clases anidadas
        cuerpoHumano.corazon.bombearSangre();
        cuerpoHumano.pulmon.respirar();
    }
}
