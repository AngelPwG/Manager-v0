package managerv0;

public class Personaje {
    private int id;
    private String nombre;
    private String clase;
    private String raza;
    private String descripcion;
    private int nivel;

    public Personaje() {}

    public Personaje(int id, String nombre, String clase, String raza, String descripcion, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getClase() {return clase;}

    public void setClase(String clase) {this.clase = clase;}

    public String getRaza() {return raza;}

    public void setRaza(String raza) {this.raza = raza;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public int getNivel() {return nivel;}

    public void setNivel(int nivel) {this.nivel = nivel;}
}
