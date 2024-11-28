import java.util.ArrayList;
import java.util.List;

// Clase Cliente
class Cliente {
    private int id;
    private String nombre;
    private String direccion;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Método cohesivo dentro de la clase Cliente
    public String obtenerDatos() {
        return "Cliente: " + nombre + ", Dirección: " + direccion;
    }
}

// Clase Item
class Item {
    private int id;
    private String descripcion;
    private double precio;

    public Item(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Método cohesivo dentro de la clase Item
    public double calcularSubtotal(int cantidad) {
        return precio * cantidad;
    }
}

// Clase Pedido
class Pedido {
    private int id;
    private Cliente cliente;
    private List<Item> items;
    private double total;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    // Métodos cohesivos dentro de la clase Pedido
    public void agregarItem(Item item) {
        items.add(item);
    }

    public double calcularTotal() {
        total = 0.0;
        for (Item item : items) {
            total += item.calcularSubtotal(1); // Suponemos 1 unidad por simplicidad
        }
        return total;
    }

    public boolean validarItems() {
        return !items.isEmpty();
    }

    public void confirmarPedido() {
        if (validarItems()) {
            System.out.println("Pedido confirmado para: " + cliente.obtenerDatos());
            System.out.println("Total: $" + calcularTotal());
        } else {
            System.out.println("No se puede confirmar un pedido sin items.");
        }
    }
}

// Clase Principal para demostrar la funcionalidad
public class MainPedido {
    public static void main(String[] args) {
        // Creación de un cliente
        Cliente cliente = new Cliente(1, "German Vago", "Av. Siempre Viva 123");
        
        // Creación de un pedido
        Pedido pedido = new Pedido(101, cliente);

        // Creación de items
        Item item1 = new Item(1, "Laptop", 15000.0);
        Item item2 = new Item(2, "Mouse", 500.0);

        // Agregar items al pedido
        pedido.agregarItem(item1);
        pedido.agregarItem(item2);

        // Confirmar el pedido
        pedido.confirmarPedido();
    }
}
