public class CuerpoHumanoProgramAnidado {
    public static void main(String[] args) {
        CuerpoHumano persona = new CuerpoHumano(1.75f, 70.0f, 30);
        System.out.println("Altura: " + persona.getAltura() + " m, Peso: " + persona.getPeso() + " kg, Edad: " + persona.getEdad() + " años");
        System.out.println("Corazón - Ritmo cardíaco: " + persona.getCorazon().getRitmoCardiaco() + " bpm, Tamaño: " + persona.getCorazon().getTamaño() + " kg, Presión sistólica: " + persona.getCorazon().getPresionSistolica() + " mmHg");
        System.out.println("Pulmón Izquierdo - Capacidad vital: " + persona.getPulmonIzquierdo().getCapacidadVital() + " L, Frecuencia respiratoria: " + persona.getPulmonIzquierdo().getFrecuenciaRespiratoria() + " rpm, Saturación de oxígeno: " + persona.getPulmonIzquierdo().getSaturacionOxigeno() + "%");
        System.out.println("Pulmón Derecho - Capacidad vital: " + persona.getPulmonDerecho().getCapacidadVital() + " L, Frecuencia respiratoria: " + persona.getPulmonDerecho().getFrecuenciaRespiratoria() + " rpm, Saturación de oxígeno: " + persona.getPulmonDerecho().getSaturacionOxigeno() + "%");
        System.out.println("Hígado - Tamaño: " + persona.getHigado().getTamaño() + " kg, Nivel de enzimas: " + persona.getHigado().getNivelEnzimas() + " U/L, Producción de bilis: " + persona.getHigado().getProduccionBilis() + " L/día");
        System.out.println("Apéndice - Longitud: " + persona.getApendice().getLongitud() + " cm, Estado: " + persona.getApendice().getEstado() + ", Inflamación: " + (persona.getApendice().isInflamacion() ? "Sí" : "No"));
    }
}

class CuerpoHumano {
    private float altura;
    private float peso;
    private int edad;
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumano(float altura, float peso, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.corazon = new Corazon(70, 0.3f, 120);
        this.pulmonIzquierdo = new Pulmon(3.0f, 12, 98.0f);
        this.pulmonDerecho = new Pulmon(3.0f, 12, 98.0f);
        this.higado = new Higado(1.5f, 30.0f, 1.0f);
        this.apendice = new Apendice(10.0f, "Normal", false);
    }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }
    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public Corazon getCorazon() { return corazon; }
    public Pulmon getPulmonIzquierdo() { return pulmonIzquierdo; }
    public Pulmon getPulmonDerecho() { return pulmonDerecho; }
    public Higado getHigado() { return higado; }
    public Apendice getApendice() { return apendice; }

    // Clase anidada Corazon
    public class Corazon {
        private int ritmoCardiaco;
        private float tamaño;
        private int presionSistolica;

        public Corazon(int ritmoCardiaco, float tamaño, int presionSistolica) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.tamaño = tamaño;
            this.presionSistolica = presionSistolica;
        }

        public int getRitmoCardiaco() { return ritmoCardiaco; }
        public void setRitmoCardiaco(int ritmoCardiaco) { this.ritmoCardiaco = ritmoCardiaco; }
        public float getTamaño() { return tamaño; }
        public void setTamaño(float tamaño) { this.tamaño = tamaño; }
        public int getPresionSistolica() { return presionSistolica; }
        public void setPresionSistolica(int presionSistolica) { this.presionSistolica = presionSistolica; }
    }

    // Clase anidada Pulmon
    public class Pulmon {
        private float capacidadVital;
        private int frecuenciaRespiratoria;
        private float saturacionOxigeno;

        public Pulmon(float capacidadVital, int frecuenciaRespiratoria, float saturacionOxigeno) {
            this.capacidadVital = capacidadVital;
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
            this.saturacionOxigeno = saturacionOxigeno;
        }

        public float getCapacidadVital() { return capacidadVital; }
        public void setCapacidadVital(float capacidadVital) { this.capacidadVital = capacidadVital; }
        public int getFrecuenciaRespiratoria() { return frecuenciaRespiratoria; }
        public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) { this.frecuenciaRespiratoria = frecuenciaRespiratoria; }
        public float getSaturacionOxigeno() { return saturacionOxigeno; }
        public void setSaturacionOxigeno(float saturacionOxigeno) { this.saturacionOxigeno = saturacionOxigeno; }
    }

    // Clase anidada Higado
    public class Higado {
        private float tamaño;
        private float nivelEnzimas;
        private float produccionBilis;

        public Higado(float tamaño, float nivelEnzimas, float produccionBilis) {
            this.tamaño = tamaño;
            this.nivelEnzimas = nivelEnzimas;
            this.produccionBilis = produccionBilis;
        }

        public float getTamaño() { return tamaño; }
        public void setTamaño(float tamaño) { this.tamaño = tamaño; }
        public float getNivelEnzimas() { return nivelEnzimas; }
        public void setNivelEnzimas(float nivelEnzimas) { this.nivelEnzimas = nivelEnzimas; }
        public float getProduccionBilis() { return produccionBilis; }
        public void setProduccionBilis(float produccionBilis) { this.produccionBilis = produccionBilis; }
    }

    // Clase anidada Apendice
    public class Apendice {
        private float longitud;
        private String estado;
        private boolean inflamacion;

        public Apendice(float longitud, String estado, boolean inflamacion) {
            this.longitud = longitud;
            this.estado = estado;
            this.inflamacion = inflamacion;
        }

        public float getLongitud() { return longitud; }
        public void setLongitud(float longitud) { this.longitud = longitud; }
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
        public boolean isInflamacion() { return inflamacion; }
        public void setInflamacion(boolean inflamacion) { this.inflamacion = inflamacion; }
    }
}
