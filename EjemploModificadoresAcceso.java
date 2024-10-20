public class EjemploModificadoresAcceso {
    public static void main(String[] args) {
        ClaseEjemplo objeto = new ClaseEjemplo();
        
        // Acceso a miembro protected
        System.out.println("Atributo protected: " + objeto.atributoProtected);  // Esto funciona porque estamos en el mismo archivo
        objeto.metodoProtected();  // Esto funciona porque estamos en el mismo archivo
        
        // Intento de acceso a miembro private (esto generara un error de compilacion)
        // System.out.println(objeto.atributoPrivate);  // Error
        // objeto.metodoPrivate();  // Error
        
        // Acceso a atributo private a traves de un metodo publico
        System.out.println("Atributo private (via getter): " + objeto.getAtributoPrivate());
    }
}

class ClaseEjemplo {
    // Atributo protected
    protected int atributoProtected;
    
    // Atributo private
    private String atributoPrivate;
    
    // Metodo protected
    protected void metodoProtected() {
        System.out.println("Este es un metodo protected");
    }
    
    // Metodo private
    private void metodoPrivate() {
        System.out.println("Este es un metodo private");
    }
    
    // Constructor
    public ClaseEjemplo() {
        this.atributoProtected = 10;
        this.atributoPrivate = "Hola";
    }
    
    // Metodo publico para acceder al atributo private
    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }
}