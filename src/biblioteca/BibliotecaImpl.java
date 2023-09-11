package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaImpl implements Biblioteca{
    private List<Libro> libros;
    public BibliotecaImpl(){
        libros= new ArrayList<>();
    }
    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro Agregado"+ libro.getTitulo() + ", de "+libro.getAutor());
    }

    @Override
    public void buscarLibroPorTitulo(String titulo) {
    for(Libro lib : libros){
        if(lib.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Libro encontrado: "+lib.getTitulo()+", de "+ lib.getAutor());
            return;
        }
    }
        System.out.println("Libro no encontrado "+ titulo);
    }



    @Override
    public void buscarLibroPorAutor(Autor autor) {
        for (Libro lib : libros){
            if (lib.getAutor().equals(autor)){
                System.out.println("Libro encontrado por autor: " +lib.getTitulo());
                return;
            }
        }
        System.out.println("Libro no encontrado por autor: "+autor.toString());
    }



    @Override
    public void prestarLibro(String titulo, Usuario usuario) {
    for (Libro lib : libros){
        if (lib.getTitulo().equalsIgnoreCase(titulo)){
            if (lib.isDisponible()){
                lib.setDisponible(false);
                System.out.println("Libro prestado: "+lib.getTitulo()+" a "+usuario.toString());
                return;
            }else{
                System.out.println("El libro "+lib.getTitulo()+" no está disponible actualmente");
                return;
            }
        }
    }
        System.out.println("Libro no encontrado: "+ titulo);
    }

    @Override
    public void devolverLibro(String titulo) {
        for (Libro lib : libros){
            if (lib.getTitulo().equalsIgnoreCase(titulo)){
                lib.setDisponible(true);
                System.out.println("Libro devuelto: "+lib.getTitulo());
                return;
            }


        }
        System.out.println("Libro no encontrado: " + titulo);

    }
}
