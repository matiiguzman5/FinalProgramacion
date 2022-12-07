import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntos;
    }

    public void setPuntaje(int puntaje) {
        this.puntos = puntaje;
    }
    public Equipo (String nombre){
        this.nombre=nombre;
        this.puntos=0;
    }
}
