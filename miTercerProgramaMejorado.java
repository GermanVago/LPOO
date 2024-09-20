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
    public static void comer(String nombre, String comida) {
        System.out.printf("%s está comiendo %s.%n", nombre, comida);
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
public class miTercerProgramaMejorado {
    public static void main(String[] args) {
        // Crear tres objetos Persona con los datos de los integrantes del equipo

        // Integrante 1: German Vargas González
        Persona german = new Persona();
        german.setNombre("German Vargas González");
        german.setEdad(20);
        german.setGenero("Masculino");
        german.setNacionalidad("Mexicano");
        german.setAltura(1.67);

        // Integrante 2: Luis Diego Cazares Meraz
        Persona luis = new Persona();
        luis.setNombre("Luis Diego Cazares Meraz");
        luis.setEdad(20);  // Edad no proporcionada, asumí 20
        luis.setGenero("Masculino");
        luis.setNacionalidad("Mexicano");
        luis.setAltura(1.80);

        // Integrante 3: Castro Campos Milton Manuel
        Persona milton = new Persona();
        milton.setNombre("Castro Campos Milton Manuel");
        milton.setEdad(20);  // Edad no proporcionada, asumí 20
        milton.setGenero("Masculino");
        milton.setNacionalidad("Mexicano");
        milton.setAltura(1.70);

        // Imprimir datos e invocar métodos de German
        System.out.println("Datos de German:");
        System.out.printf("Nombre: %s, Edad: %d, Género: %s, Nacionalidad: %s, Altura: %.2f%n", german.getNombre(), german.getEdad(), german.getGenero(), german.getNacionalidad(), german.getAltura());
        Persona.comer(german.getNombre(), "Pizza");
        german.dormir(8);
        german.hacerEjercicio("Gimnasio", 120);

        // Imprimir datos e invocar métodos de Luis
        System.out.println("\nDatos de Luis:");
        System.out.printf("Nombre: %s, Edad: %d, Género: %s, Nacionalidad: %s, Altura: %.2f%n", luis.getNombre(), luis.getEdad(), luis.getGenero(), luis.getNacionalidad(), luis.getAltura());
        Persona.comer(luis.getNombre(), "Hamburguesa");
        luis.dormir(7);
        luis.hacerEjercicio("Gimnasio", 120);

        // Imprimir datos e invocar métodos de Milton
        System.out.println("\nDatos de Milton:");
        System.out.printf("Nombre: %s, Edad: %d, Género: %s, Nacionalidad: %s, Altura: %.2f%n", milton.getNombre(), milton.getEdad(), milton.getGenero(), milton.getNacionalidad(), milton.getAltura());
        Persona.comer(milton.getNombre(), "Pollo");
        milton.dormir(10);
        milton.hacerEjercicio("Gimnasio", 120);
    }
}
