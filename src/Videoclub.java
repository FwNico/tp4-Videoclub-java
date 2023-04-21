import java.util.ArrayList;

public class Videoclub {

    private ArrayList<Pelicula> listaPeliculas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Alquiler> listaAlquileres;

    public Videoclub(){
        this.listaPeliculas = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaAlquileres = new ArrayList<>();
    }
}
