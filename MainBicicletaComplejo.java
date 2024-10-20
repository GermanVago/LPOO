// Clase principal que representa la bicicleta como un todo
public class Bicicleta {
    private Cuadro cuadro;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private String color;
    private double precio;
    private int añoModelo;

    // Constructor
    public Bicicleta(Cuadro cuadro, Rueda ruedaDelantera, Rueda ruedaTrasera, String color, double precio, int añoModelo) {
        this.cuadro = cuadro;
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.color = color;
        this.precio = precio;
        this.añoModelo = añoModelo;
    }

    // Getters y setters
    public Cuadro getCuadro() { return cuadro; }
    public void setCuadro(Cuadro cuadro) { this.cuadro = cuadro; }
    public Rueda getRuedaDelantera() { return ruedaDelantera; }
    public void setRuedaDelantera(Rueda ruedaDelantera) { this.ruedaDelantera = ruedaDelantera; }
    public Rueda getRuedaTrasera() { return ruedaTrasera; }
    public void setRuedaTrasera(Rueda ruedaTrasera) { this.ruedaTrasera = ruedaTrasera; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getAñoModelo() { return añoModelo; }
    public void setAñoModelo(int añoModelo) { this.añoModelo = añoModelo; }
}

// Clase que representa el cuadro de la bicicleta
public class Cuadro {
    private double tamaño;
    private String material;
    private String tipo;

    // Constructor, getters y setters (omitidos por brevedad)
}

// Clase que representa una rueda de la bicicleta
public class Rueda {
    private double tamaño;
    private String tipo;
    private boolean esTubeless;

    // Constructor, getters y setters (omitidos por brevedad)
}

// Clase principal para demostrar el uso
public class MainBicicletaComplejo {
    public static void main(String[] args) {
        Cuadro cuadro = new Cuadro(54, "Aluminio", "Montaña");
        Rueda ruedaDelantera = new Rueda(29, "Todo terreno", true);
        Rueda ruedaTrasera = new Rueda(29, "Todo terreno", true);
        
        Bicicleta miBici = new Bicicleta(cuadro, ruedaDelantera, ruedaTrasera, "Rojo", 1500.0, 2024);
        
        System.out.println("Tamaño del cuadro: " + miBici.getCuadro().getTamaño() + " cm");
        System.out.println("Tamaño de rueda: " + miBici.getRuedaDelantera().getTamaño() + " pulgadas");
        System.out.println("Color de la bicicleta: " + miBici.getColor());
    }
}