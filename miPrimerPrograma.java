class Alumno{
    String nombre;
    float promedio;
    String msg = " Hello World";

    void SetNombre(String nombre){
        this.nombre = nombre;
    }
    String getNombre(){
        return nombre;
    }

    String getMsg(){
        return msg;

    }
}

class miPrimerPrograma{
    public static void main (String[] args){
    Alumno al1 = new Alumno();
    al1.SetNombre("Pedrito");
    System.out.print(al1.getNombre());
    System.out.println(al1.getMsg());
    }
}