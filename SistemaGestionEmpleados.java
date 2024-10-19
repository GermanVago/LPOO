// Clase abstracta Empleado
abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Method concreto
    public String getNombre() {
        return nombre;
    }

    // Method abstracto
    public abstract double calcularSalario();

    // Otro method abstracto
    public abstract String obtenerInformacion();
}

// Interfaz Pagable
interface Pagable {
    void pagar();
    double obtenerMontoPago();
}

// Clase concreta que extiende Empleado e implementa Pagable
class EmpleadoTiempoCompleto extends Empleado implements Pagable {
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String obtenerInformacion() {
        return "Empleado de tiempo completo: " + nombre + " (ID: " + id + ")";
    }

    @Override
    public void pagar() {
        System.out.println("Pagando a " + nombre + " un monto de " + obtenerMontoPago());
    }

    @Override
    public double obtenerMontoPago() {
        return calcularSalario();
    }
}

// Main para demostrar
public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("German Vago", "W0011567", 3000, 500);
        System.out.println(empleado.obtenerInformacion());
        System.out.println("Salario: $" + empleado.calcularSalario());
        empleado.pagar();
    }
}