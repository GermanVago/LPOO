public class MainComplejoCuerpo {
    public static void main(String[] args) {
        CuerpoHumano persona = new CuerpoHumano(30, "Masculino", 70);
        System.out.println("Edad: " + persona.getEdad() + ", Sexo: " + persona.getSexo());
        System.out.println("Ritmo cardíaco: " + persona.getCorazon().getRitmoCardiaco() + " bpm");
        System.out.println("Capacidad respiratoria: " + persona.getPulmonIzquierdo().getCapacidadRespiratoria() + " L");
    }
}

class CuerpoHumano {
    private int edad;
    private String sexo;
    private float peso;
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;

    public CuerpoHumano(int edad, String sexo, float peso) {
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.corazon = new Corazon();
        this.pulmonIzquierdo = new Pulmon();
        this.pulmonDerecho = new Pulmon();
    }

    // Getters y setters
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }
    public Corazon getCorazon() { return corazon; }
    public Pulmon getPulmonIzquierdo() { return pulmonIzquierdo; }
    public Pulmon getPulmonDerecho() { return pulmonDerecho; }
}

class Corazon {
    private int ritmoCardiaco;

    public Corazon() {
        this.ritmoCardiaco = 70; // Valor por defecto
    }

    public int getRitmoCardiaco() { return ritmoCardiaco; }
    public void setRitmoCardiaco(int ritmoCardiaco) { this.ritmoCardiaco = ritmoCardiaco; }
}

class Pulmon {
    private float capacidadRespiratoria;

    public Pulmon() {
        this.capacidadRespiratoria = 6.0f; // Valor por defecto en litros
    }

    public float getCapacidadRespiratoria() { return capacidadRespiratoria; }
    public void setCapacidadRespiratoria(float capacidadRespiratoria) { this.capacidadRespiratoria = capacidadRespiratoria; }
}