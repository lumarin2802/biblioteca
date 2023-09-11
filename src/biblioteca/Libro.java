package biblioteca;

public class Libro {
    //atributos
    private String titulo;
    private Autor autor;
    private boolean disponible;

    //Constructor

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    //getters and setters

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
