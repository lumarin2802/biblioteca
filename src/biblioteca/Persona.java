package biblioteca;



public abstract class Persona {

    //atributos
    private String nombre;
    private String documento;

    //Constructorde la clase Persona
    public Persona(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }
    //getters


    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }
}
