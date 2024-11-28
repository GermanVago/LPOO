// Clase abstracta FiguraGeometrica
abstract class FiguraGeometrica {
    // Atributo común
    private String color;

    // Constructor
    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Getter y Setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

// Interfaz Drawable
interface Drawable {
    void dibujar();
}

// Interfaz Transformable
interface Transformable {
    void escalar(double factor);
    void rotar(double grados);
}

// Clase Rectangulo (hereda de FiguraGeometrica e implementa Drawable y Transformable)
class Rectangulo extends FiguraGeometrica implements Drawable, Transformable {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de color " + getColor());
    }

    @Override
    public void escalar(double factor) {
        this.base *= factor;
        this.altura *= factor;
        System.out.println("Rectángulo escalado por un factor de " + factor);
    }

    @Override
    public void rotar(double grados) {
        System.out.println("Rectángulo rotado " + grados + " grados.");
    }
}

// Clase Circulo (hereda de FiguraGeometrica e implementa Drawable y Transformable)
class Circulo extends FiguraGeometrica implements Drawable, Transformable {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + getColor());
    }

    @Override
    public void escalar(double factor) {
        this.radio *= factor;
        System.out.println("Círculo escalado por un factor de " + factor);
    }

    @Override
    public void rotar(double grados) {
        System.out.println("Círculo rotado " + grados + " grados.");
    }
}

// Clase Triangulo (hereda de FiguraGeometrica e implementa Drawable y Transformable)
class Triangulo extends FiguraGeometrica implements Drawable, Transformable {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Suponiendo un triángulo equilátero por simplicidad (todos los lados iguales)
        return 3 * base;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de color " + getColor());
    }

    @Override
    public void escalar(double factor) {
        this.base *= factor;
        this.altura *= factor;
        System.out.println("Triángulo escalado por un factor de " + factor);
    }

    @Override
    public void rotar(double grados) {
        System.out.println("Triángulo rotado " + grados + " grados.");
    }
}

// Clase principal para probar el código
public class Main2 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("Rojo", 5, 3);
        Circulo circulo = new Circulo("Azul", 4);
        Triangulo triangulo = new Triangulo("Verde", 6, 4);

        // Mostrando características y operaciones
        System.out.println("Rectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        rectangulo.dibujar();
        rectangulo.escalar(2);
        rectangulo.rotar(90);

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        circulo.dibujar();
        circulo.escalar(1.5);
        circulo.rotar(45);

        System.out.println("\nTriángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        triangulo.dibujar();
        triangulo.escalar(1.2);
        triangulo.rotar(60);
    }
}
