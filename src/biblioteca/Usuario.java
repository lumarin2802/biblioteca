package biblioteca;

public class Usuario extends Persona{
     //atributos
    private String id;
    //constructor
    public Usuario(String nombre, String documento, String id) {
        super(nombre, documento);
        this.id = id;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
}
