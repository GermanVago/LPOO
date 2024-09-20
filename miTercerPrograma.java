class Persona {
    // Atributos demográficos
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    private double altura;

    // Métodos set y get para cada atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    // Método estático comer(...)
    public static void comer(String comida) {
        System.out.printf("Estoy comiendo %s.%n", comida);
    }

    // Método dormir(...)
    public void dormir(int horas) {
        System.out.printf("%s está durmiendo por %d horas.%n", nombre, horas);
    }

    // Método hacerEjercicio(...)
    public void hacerEjercicio(String tipoEjercicio, int duracion) {
        System.out.printf("%s está haciendo %s por %d minutos.%n", nombre, tipoEjercicio, duracion);
    }
}

// Clase con el método main para probar la invocación de los métodos
public class miTercerPrograma {
    public static void main(String[] args) {
        // Crear objeto Persona
        Persona persona = new Persona();
        
        // Establecer atributos
        persona.setNombre("Ana");
        persona.setEdad(25);
        persona.setGenero("Femenino");
        persona.setNacionalidad("Mexicana");
        persona.setAltura(1.65);

        // Invocar método estático comer (no se necesita un objeto)
        Persona.comer("Ensalada");

        // Invocar métodos no estáticos dormir y hacerEjercicio
        persona.dormir(8);
        persona.hacerEjercicio("Yoga", 30);
    }
}
