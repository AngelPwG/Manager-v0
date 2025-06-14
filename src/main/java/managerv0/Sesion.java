package managerv0;

import java.time.LocalDate;

public class Sesion {
    int id;
    String titulo;
    String resumen;
    LocalDate fecha;

    public Sesion() {}

    public Sesion(int id, String titulo, String resumen, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.resumen = resumen;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
