import java.time.LocalDate;

public class Alquiler {
    private Integer id;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private boolean devuelto;
    private static Integer cantAlquileres;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate fechaDevolucion) {
        this.id = cantAlquileres;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaAlquiler = LocalDate.now();
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = false;
        cantAlquileres++;
    }
}
