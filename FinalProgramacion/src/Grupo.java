import java.util.ArrayList;
    public class Grupo extends EtapaMundial {

    public ArrayList<Equipo> getEquiposQueAvanzan () {
        ArrayList<Partido> listaPartidos = super.getPartidos();
        ArrayList<Equipo> mejoresPuntajes= new ArrayList<Equipo>();
        Equipo campeon = new Equipo("");
        Equipo subCampeon = new Equipo("");
        int mejorPuntaje = 0;
        int subMejorPuntaje=0;


        for (int i=0 ; i<listaPartidos.size() ; i++){
            Equipo visitante=listaPartidos.get(i).getVisitante();
            Equipo local=listaPartidos.get(i).getLocal();
            Resultado resultado=listaPartidos.get(i).getResultado();
            System.out.println(visitante.getNombre() + ": " + resultado.getGolesVisitante() + " " + local.getNombre() + ": " + resultado.getGolesLocal());
            if (resultado.empate()){
                visitante.setPuntaje(visitante.getPuntaje() + 1);
                local.setPuntaje(local.getPuntaje() + 1);
            }
            if (resultado.ganoLocal()){
                local.setPuntaje(local.getPuntaje() + 2);
            }else{
                visitante.setPuntaje(local.getPuntaje() + 2);
            }
        }


        for (int i=0 ; i<listaPartidos.size() ; i++){
            Equipo visitante=listaPartidos.get(i).getVisitante();
            Equipo local=listaPartidos.get(i).getLocal();

            if (mejorPuntaje< visitante.getPuntaje()){
                mejorPuntaje= visitante.getPuntaje();
                campeon=visitante;
            }
            if (mejorPuntaje< local.getPuntaje()){
                mejorPuntaje= local.getPuntaje();
                campeon=local;
            }

            if (subMejorPuntaje < visitante.getPuntaje() && !campeon.getNombre().equals(visitante.getNombre())){
                subMejorPuntaje= visitante.getPuntaje();
                subCampeon=visitante;
            }
            if (subMejorPuntaje < local.getPuntaje() && !campeon.getNombre().equals(local.getNombre())){
                subMejorPuntaje= local.getPuntaje();
                subCampeon=local;
            }
        }

        mejoresPuntajes.add(campeon);
        mejoresPuntajes.add(subCampeon);
        return mejoresPuntajes;
    }
}
