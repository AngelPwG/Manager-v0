package managerv0;

import java.util.List;

public class Campaña {
    int id;
    String nombre;
    String sistema; // D&D, CoC, etc.
    List<Personaje> personajes;
    List<Sesion> sesiones;

    public Campaña() {}

    public Campaña(int id, String nombre, String sistema, List<Personaje> personajes, List<Sesion> sesiones) {
        this.id = id;
        this.nombre = nombre;
        this.sistema = sistema;
        this.personajes = personajes;
        this.sesiones = sesiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
}
