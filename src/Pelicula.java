public class Pelicula {
    private String titulo;
    private String genero;
    private Integer duracion;
    private String lanzamiento;
    private Integer stock;
    private String audiencia;
    private String pais;
    private Integer cantAlquilado;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, Integer duracion, String lanzamiento, Integer stock, String audiencia, String pais, Integer cantAlquilado) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
        this.stock = stock;
        this.audiencia = audiencia;
        this.pais = pais;
        this.cantAlquilado = cantAlquilado;
    }


}
