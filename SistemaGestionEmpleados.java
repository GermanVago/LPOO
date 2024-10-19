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

    // Método concreto
    public String getNombre() {
        return nombre;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Otro método abstracto
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

// Clase concreta que extiende Empleado e implementa Pagable
class EmpleadoPorHora extends Empleado implements Pagable {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String id, double salarioBase, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, salarioBase);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public String obtenerInformacion() {
        return "Empleado por hora: " + nombre + " (ID: " + id + ")";
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

// Clase concreta que extiende Empleado e implementa Pagable
class EmpleadoContratista extends Empleado implements Pagable {
    private double montoContrato;

    public EmpleadoContratista(String nombre, String id, double salarioBase, double montoContrato) {
        super(nombre, id, salarioBase);
        this.montoContrato = montoContrato;
    }

    @Override
    public double calcularSalario() {
        return montoContrato;
    }

    @Override
    public String obtenerInformacion() {
        return "Empleado contratista: " + nombre + " (ID: " + id + ")";
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

// Clase principal para demostración
public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("German Vago", "W0011567", 3000, 500);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Ana Banana", "W0011568", 0, 15, 40);
        EmpleadoContratista empleado3 = new EmpleadoContratista("Hector Ruiz", "W0011569", 0, 2000);
        
        // Mostrar información y realizar pagos
        Empleado[] empleados = {empleado1, empleado2, empleado3};

        for (Empleado empleado : empleados) {
            System.out.println(empleado.obtenerInformacion());
            System.out.println("Salario: $" + empleado.calcularSalario());
            if (empleado instanceof Pagable) {
                ((Pagable) empleado).pagar();  // Llamar a pagar si el empleado es pagable
            }
        }
    }
}