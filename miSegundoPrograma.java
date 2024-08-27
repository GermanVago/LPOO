class Persona {
    String nombre;

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void takeShower(String sustancia, String odirifico) {
        System.out.printf("Yo, %s, me baño con %s y con %s.%n", nombre, sustancia, odirifico);
    }

    void takeShower(String sustancia, String odirifico, String suavizante) {
        System.out.printf("Yo, %s, me baño con %s, con %s y uso suavizante %s.%n", nombre, sustancia, odirifico, suavizante);
    }

    void takeShower(String sustancia, double tiempo) {
        System.out.printf("Yo, %s, me baño con %s y tardo %.2f minutos.%n", nombre, sustancia, tiempo);
    }

    void takeShower(String sustancia, int x, int y){
        System.out.println("Yo me llamo " + nombre + " Me baño con " + sustancia + " y en las coordenadas son: x: " + x + " la coordenada en y es " + y);
    }
}

class miSegundoPrograma {
    public static void main(String[] args) {
        Persona obj1 = new Persona();
    
        obj1.setNombre("Reyes");
        obj1.takeShower("Agua", "Nordiko");
        obj1.takeShower("Agua", 45.7);
        obj1.takeShower("Agua",45,90);
    }
}
