import java.util.ArrayList;
public class Llave extends EtapaMundial {
    public ArrayList<Equipo> getEquiposQueAvanzan () {
        ArrayList<Equipo> equiposwinn= new ArrayList<Equipo>();
        ArrayList<Partido> listaDePartidos = super.getPartidos();


        for (int i=0 ; i<listaDePartidos.size() ; i++){
            Equipo visitante=listaDePartidos.get(i).getVisitante();
            Equipo local=listaDePartidos.get(i).getLocal();
            Resultado resultado=listaDePartidos.get(i).getResultado();
            System.out.println(visitante.getNombre() + ": " + resultado.getGolesVisitante() + " " + local.getNombre() + ": " + resultado.getGolesLocal());
            if (resultado.empate()){
                int ganadorPorPenales= (int) (Math.random() * 2);
                if (ganadorPorPenales==0){
                    equiposwinn.add(local);
                }else{
                    equiposwinn.add(visitante);
                }
            } else if (resultado.ganoLocal()){
                equiposwinn.add(local);
            }else{
                equiposwinn.add(visitante);
            }
        }

        return equiposwinn;
    }
}
