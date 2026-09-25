package src.Clases;
import java.time.LocalDate;
import java.util.UUID;

public class Turno {
    private UUID Id;
    private String Nombre;
    private String Descripcion;
    private int Estado;
    private LocalDate Fecha;

    public Turno(String nombre, String descripcion) {
        Id = UUID.randomUUID();
        Nombre = nombre;
        Descripcion = descripcion;
        Estado = 0;
        Fecha = LocalDate.now();
    }

    public UUID getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public void mostrarTurno() {
        System.out.println("==========================================================");
        System.out.println("Cliente: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
    }
}
