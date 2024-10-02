public class ProgramaMio {
    public static class Persona {
        protected String nombre;
        private int edad;
        public String ciudad;
        public String ocupacion;
        public String genero;
        
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
        
        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
        
        public String getCiudad() {
            return ciudad;
        }
        
        public void setOcupacion(String ocupacion) {
            this.ocupacion = ocupacion;
        }
        
        public String getOcupacion() {
            return ocupacion;
        }
        
        public void setGenero(String genero) {
            this.genero = genero;
        }
        
        public String getGenero() {
            return genero;
        }
        
        public void comer(String comida) {
            System.out.println("Comiendo " + comida);
        }
        
        protected void dormir(int horas) {
            System.out.println("Durmiendo por " + horas + " horas");
        }
        
        private void tomarShower(int minutos) {
            System.out.println("Tomando shower por " + minutos + " minutos");
        }
    }

    public static class Estudiante extends Persona {
        private String escuela;
        private int grado;
        
        public void setEscuela(String escuela) {
            this.escuela = escuela;
        }
        
        public String getEscuela() {
            return escuela;
        }
        
        public void setGrado(int grado) {
            this.grado = grado;
        }
        
        public int getGrado() {
            return grado;
        }
        
        public void estudiar(String materia) {
            System.out.println("Estudiando " + materia);
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("German");
        persona.setEdad(20);
        persona.setCiudad("Tijuana");
        persona.setOcupacion("Desarrollador");
        persona.setGenero("Masculino");
        
        System.out.println("\nDatos de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Ciudad: " + persona.getCiudad());
        System.out.println("Ocupación: " + persona.getOcupacion());
        System.out.println("Género: " + persona.getGenero());
        
        System.out.println("\nAcciones de la Persona:");
        persona.comer("pizza");
        persona.dormir(8);
        
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ana");
        estudiante.setEdad(20);
        estudiante.setEscuela("CBTis 155");
        estudiante.setGrado(2);
        
        System.out.println("\nDatos del Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Escuela: " + estudiante.getEscuela());
        System.out.println("Grado: " + estudiante.getGrado());
        
        System.out.println("\nAcciones del Estudiante:");
        estudiante.estudiar("Programación");
        estudiante.dormir(6);
    }
}
