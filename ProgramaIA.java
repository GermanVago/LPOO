// ProgramaIA.java
public class ProgramaIA {
    public static class Persona {
        protected String nombre;
        private int edad;
        public String ciudad;
        String ocupacion;
        public final String genero;
        
        public Persona(String nombre, int edad, String ciudad, String ocupacion, String genero) {
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
            this.ocupacion = ocupacion;
            this.genero = genero;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        protected void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public int getEdad() {
            return edad;
        }
        
        private void setEdad(int edad) {
            if (edad >= 0 && edad <= 150) {
                this.edad = edad;
            } else {
                throw new IllegalArgumentException("Edad inválida");
            }
        }
        
        public void comer(String comida, int cantidad) {
            System.out.printf("Comiendo %d porciones de %s%n", cantidad, comida);
            digerir();
        }
        
        protected void dormir(int horas) {
            if (horas > 12) {
                System.out.println("¡Demasiadas horas de sueño!");
            } else {
                System.out.printf("Durmiendo por %d horas. ZzZzZz...%n", horas);
            }
        }
        
        private void digerir() {
            System.out.println("Digestión en proceso...");
        }
        
        private void tomarShower(int minutos, boolean aguaCaliente) {
            String temperatura = aguaCaliente ? "caliente" : "fría";
            System.out.printf("Tomando una ducha con agua %s por %d minutos%n", 
                             temperatura, minutos);
        }
        
        @Override
        public String toString() {
            return String.format("Persona[nombre=%s, edad=%d, ciudad=%s, ocupacion=%s, genero=%s]",
                                nombre, edad, ciudad, ocupacion, genero);
        }
    }

    public static class Estudiante extends Persona {
        private String escuela;
        private double promedio;
        private String[] materias;
        
        public Estudiante(String nombre, int edad, String ciudad, 
                          String escuela, String genero) {
            super(nombre, edad, ciudad, "Estudiante", genero);
            this.escuela = escuela;
            this.materias = new String[0];
        }
        
        public void agregarMateria(String materia) {
            String[] newMaterias = new String[materias.length + 1];
            System.arraycopy(materias, 0, newMaterias, 0, materias.length);
            newMaterias[materias.length] = materia;
            materias = newMaterias;
        }
        
        @Override
        public void dormir(int horas) {
            if (horas < 6) {
                System.out.println("¡Un estudiante debería dormir más!");
            }
            super.dormir(horas);
        }
        
        public void estudiar(String materia, int horas) {
            System.out.printf("Estudiando %s por %d horas%n", materia, horas);
            System.out.printf("%s está muy concentrado%n", nombre);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Programa IA ===\n");
        
        try {
            // Demostración de la clase Persona
            System.out.println("1. Creación y uso de una Persona:");
            Persona persona = new Persona("Juan Pérez", 25, "México", "Desarrollador", "Masculino");
            System.out.println(persona);
            
            System.out.println("\n2. Demostración de métodos de Persona:");
            persona.comer("pizza", 2);
            persona.dormir(8);
            
            // Demostración de la clase Estudiante
            System.out.println("\n3. Creación y uso de un Estudiante:");
            Estudiante estudiante = new Estudiante("Ana García", 20, "Guadalajara", "UNAM", "Femenino");
            System.out.println(estudiante);
            
            System.out.println("\n4. Demostración de métodos específicos de Estudiante:");
            estudiante.agregarMateria("Programación");
            estudiante.agregarMateria("Matemáticas");
            estudiante.estudiar("Programación", 3);
            
            System.out.println("\n5. Demostración de sobrescritura de métodos:");
            estudiante.dormir(5);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}