import java.util.Scanner;

class Persona {
    String nombre;
    int edad;
    String direccion;

    Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
}

class Alumno extends Persona {
    String matricula;
    String carrera;

    Alumno(String nombre, int edad, String direccion, String matricula, String carrera) {
        super(nombre, edad, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Captura de datos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Carrera: ");
            String carrera = scanner.nextLine();

            alumnos[i] = new Alumno(nombre, edad, direccion, matricula, carrera);
        }

        System.out.println("\nDatos de los alumnos:");
        for (Alumno alumno : alumnos) {
            alumno.mostrarDatos();
        }

        scanner.close();
    }
}
