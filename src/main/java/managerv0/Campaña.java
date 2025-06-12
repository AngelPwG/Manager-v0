package managerv0;

import java.util.List;

public class Campaña {
    int id;
    String nombre;
    String sistema; // D&D, CoC, etc.
    List<Personaje> personajes;
    List<Sesion> sesiones;
}
