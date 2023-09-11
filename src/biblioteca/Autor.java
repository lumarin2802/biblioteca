package biblioteca;

public class Autor extends Persona{

     public Autor(String nombre, String documento) {
        super(nombre, documento);
    }
    @Override
    public String toString(){
         return this.getNombre();
    }
}
