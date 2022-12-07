import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList <Partido> partidos;

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    protected ArrayList <Partido> getPartidos(){
        return partidos;
    }

    public ArrayList <Equipo> getEquiposQueAvanzan (){
        return null;
    }

    public EtapaMundial(){
        this.partidos= new ArrayList<Partido>();
    };

}
