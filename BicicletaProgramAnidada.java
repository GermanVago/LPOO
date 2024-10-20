public class BicicletaProgramAnidada
 {
    public static void main(String[] args) {
        Bicicleta miBici = new Bicicleta("Trek", "Marlin 7", "Rojo");
        System.out.println("Bicicleta: " + miBici.getMarca() + " " + miBici.getModelo());
        System.out.println("Color: " + miBici.getColor());
        System.out.println("Cuadro: " + miBici.getCuadro().getMaterial() + ", " + miBici.getCuadro().getTamaño() + " cm, tipo " + miBici.getCuadro().getTipo());
        System.out.println("Rueda delantera: " + miBici.getRuedaDelantera().getDiametro() + " pulgadas, " + miBici.getRuedaDelantera().getMaterial() + ", tipo " + miBici.getRuedaDelantera().getTipo());
        System.out.println("Rueda trasera: " + miBici.getRuedaTrasera().getDiametro() + " pulgadas, " + miBici.getRuedaTrasera().getMaterial() + ", tipo " + miBici.getRuedaTrasera().getTipo());
    }
}

class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private Cuadro cuadro;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    public Bicicleta(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cuadro = new Cuadro("Aluminio", 54, "Montaña");
        this.ruedaDelantera = new Rueda(26, "Aleación", "Todo terreno");
        this.ruedaTrasera = new Rueda(26, "Aleación", "Todo terreno");
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public Cuadro getCuadro() { return cuadro; }
    public Rueda getRuedaDelantera() { return ruedaDelantera; }
    public Rueda getRuedaTrasera() { return ruedaTrasera; }

    // Clase anidada Cuadro
    class Cuadro {
        private String material;
        private int tamaño;
        private String tipo;

        public Cuadro(String material, int tamaño, String tipo) {
            this.material = material;
            this.tamaño = tamaño;
            this.tipo = tipo;
        }

        public String getMaterial() { return material; }
        public void setMaterial(String material) { this.material = material; }
        public int getTamaño() { return tamaño; }
        public void setTamaño(int tamaño) { this.tamaño = tamaño; }
        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
    }

    // Clase anidada Rueda
    class Rueda {
        private int diametro;
        private String material;
        private String tipo;

        public Rueda(int diametro, String material, String tipo) {
            this.diametro = diametro;
            this.material = material;
            this.tipo = tipo;
        }

        public int getDiametro() { return diametro; }
        public void setDiametro(int diametro) { this.diametro = diametro; }
        public String getMaterial() { return material; }
        public void setMaterial(String material) { this.material = material; }
        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
    }
}
