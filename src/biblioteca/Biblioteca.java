package biblioteca;

public interface Biblioteca {
    void agregarLibro(Libro libro);
    void buscarLibroPorTitulo(String titulo);

    void buscarLibroPorAutor(Autor autor);

    void prestarLibro(String titulo, Usuario usuario);
    void devolverLibro (String titulo);
}
