import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersistenciaDemo {

    // Clase Usuario
    static class Usuario implements Serializable {
        private int idUsuario;
        private String nombre;
        private String correo;

        public Usuario(int idUsuario, String nombre, String correo) {
            this.idUsuario = idUsuario;
            this.nombre = nombre;
            this.correo = correo;
        }

        public void registrarUsuario() {
            System.out.println("Usuario registrado: " + nombre);
        }

        public int getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(int idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }

    // Clase Ruta
    static class Ruta implements Serializable {
        private int idRuta;
        private String origen;
        private String destino;
        private List<String> paradas;

        public Ruta(int idRuta, String origen, String destino, List<String> paradas) {
            this.idRuta = idRuta;
            this.origen = origen;
            this.destino = destino;
            this.paradas = new ArrayList<>(paradas);
        }

        public void agregarRuta() {
            System.out.println("Ruta agregada: " + origen + " -> " + destino);
        }

        public int getIdRuta() {
            return idRuta;
        }

        public void setIdRuta(int idRuta) {
            this.idRuta = idRuta;
        }

        public String getOrigen() {
            return origen;
        }

        public void setOrigen(String origen) {
            this.origen = origen;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public List<String> getParadas() {
            return paradas;
        }

        public void setParadas(List<String> paradas) {
            this.paradas = paradas;
        }
    }

    // Clase Viaje
    static class Viaje implements Serializable {
        private int idViaje;
        private Date fechaHora;
        private Usuario usuario;
        private Ruta ruta;

        public Viaje(int idViaje, Date fechaHora, Usuario usuario, Ruta ruta) {
            this.idViaje = idViaje;
            this.fechaHora = fechaHora;
            this.usuario = usuario;
            this.ruta = ruta;
        }

        public void registrarViaje() {
            System.out.println("Viaje registrado para el usuario: " + usuario.getNombre());
        }

        public int getIdViaje() {
            return idViaje;
        }

        public void setIdViaje(int idViaje) {
            this.idViaje = idViaje;
        }

        public Date getFechaHora() {
            return fechaHora;
        }

        public void setFechaHora(Date fechaHora) {
            this.fechaHora = fechaHora;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public Ruta getRuta() {
            return ruta;
        }

        public void setRuta(Ruta ruta) {
            this.ruta = ruta;
        }
    }

    public static void main(String[] args) {
        // Crear datos de prueba
        Usuario usuario = new Usuario(1, "German Vago", "germy.vago@example.com");
        usuario.registrarUsuario();

        List<String> paradas = new ArrayList<>();
        paradas.add("Parada 1");
        paradas.add("Parada 2");

        Ruta ruta = new Ruta(101, "Tijuana", "Mexicali", paradas);
        ruta.agregarRuta();

        Viaje viaje = new Viaje(1001, new Date(), usuario, ruta);
        viaje.registrarViaje();
    }
}
