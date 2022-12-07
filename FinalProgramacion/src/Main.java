import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //grupo A
        Equipo uruguay = new Equipo("uruguay");
        Equipo rusia = new Equipo("rusia");
        Equipo arabiasaudita = new Equipo("arabiasaudita");
        Equipo egipto = new Equipo("egipto");


        //grupo B
        Equipo españa = new Equipo("inglaterra");
        Equipo portugal = new Equipo("eeuu");
        Equipo iran = new Equipo("iran");
        Equipo marruecos = new Equipo("gales");

        //grupo C
        Equipo francia = new Equipo("francia");
        Equipo dinamarca = new Equipo("dinamarca");
        Equipo peru = new Equipo("peru");
        Equipo australia = new Equipo("australia");

        //grupo D
        Equipo croacia = new Equipo("croacia");
        Equipo argentina = new Equipo("argentina");
        Equipo nigeria = new Equipo("nigeria");
        Equipo islandia = new Equipo("islandia");

        //grupo E
        Equipo brasil = new Equipo("brasil");
        Equipo suiza = new Equipo("suiza");
        Equipo serbia  = new Equipo("serbia");
        Equipo costarica = new Equipo("costarica");

        //grupo F

        Equipo suecia = new Equipo("suecia");
        Equipo mexico = new Equipo("mexico");
        Equipo coreadelsur = new Equipo("coreadelsur");
        Equipo alemania = new Equipo("alemania");

        // grupo G

        Equipo belgica = new Equipo("belgica");
        Equipo inglaterra = new Equipo("inglaterra");
        Equipo tunez = new Equipo("tunez");
        Equipo panama = new Equipo("panama");

        //grupo H

        Equipo colombia = new Equipo("colombia");
        Equipo japon = new Equipo("japon");
        Equipo senegal = new Equipo("senegal");
        Equipo polonia = new Equipo("polonia");

        EtapaMundial grupoA = new Grupo();
        grupoA.setDescripcionEtapa("grupo a");
        grupoA.addPartido(new Partido(new Date(), uruguay,rusia,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), egipto,arabiasaudita,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), uruguay,arabiasaudita,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), rusia,arabiasaudita,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), egipto,uruguay,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), egipto,rusia,new Resultado()));

        EtapaMundial grupoB = new Grupo();
        grupoB.setDescripcionEtapa("grupo b");
        grupoB.addPartido(new Partido(new Date(), españa,iran,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), portugal,marruecos,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), españa,marruecos,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), iran,portugal,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), marruecos,iran,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), españa,portugal,new Resultado()));

        EtapaMundial grupoC = new Grupo();
        grupoC.setDescripcionEtapa("grupo c");
        grupoC.addPartido(new Partido(new Date(), francia,peru,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), peru,australia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), francia,dinamarca,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), australia,dinamarca,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), francia,australia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), peru,dinamarca,new Resultado()));

        EtapaMundial grupoD = new Grupo();
        grupoD.setDescripcionEtapa("grupo d");
        grupoD.addPartido(new Partido(new Date(), argentina,croacia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), croacia,nigeria,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), argentina,islandia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), croacia,islandia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), nigeria,argentina,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), nigeria,islandia,new Resultado()));

        EtapaMundial grupoE = new Grupo();
        grupoE.setDescripcionEtapa("grupo e");
        grupoE.addPartido(new Partido(new Date(), suiza,brasil,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), serbia,costarica,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), brasil,costarica,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), serbia,suiza,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), costarica,suiza,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), serbia,brasil,new Resultado()));

        EtapaMundial grupoF = new Grupo();    // suecia, mexico, coreadel sur, alemania
        grupoF.setDescripcionEtapa("grupo f");
        grupoF.addPartido(new Partido(new Date(), suecia, mexico, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), coreadelsur, alemania, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), suecia, alemania, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), coreadelsur, mexico, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), suecia, coreadelsur, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), alemania, mexico, new Resultado()));

        EtapaMundial grupoG = new Grupo();    // belgica, inglaterra, tunez,panama
        grupoG.setDescripcionEtapa("grupo g");
        grupoG.addPartido(new Partido(new Date(), belgica, inglaterra, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), tunez, panama, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), panama, belgica, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), tunez, inglaterra, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), belgica, tunez, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), panama, inglaterra, new Resultado()));

        EtapaMundial grupoH = new Grupo();    // colombia, japon, senegal, polonia
        grupoH.setDescripcionEtapa("grupo g");
        grupoH.addPartido(new Partido(new Date(), colombia, japon, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), senegal, polonia, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), polonia, japon, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), colombia, polonia, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), senegal, japon, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), senegal, colombia, new Resultado()));


        // arraaaaays
        ArrayList<Equipo> mejoresGrupoA = grupoA.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoB = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoC = grupoC.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoD = grupoD.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoE = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoF = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoG = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> mejoresGrupoH = grupoE.getEquiposQueAvanzan();


        EtapaMundial octavosFinal = new Llave();
        octavosFinal.setDescripcionEtapa("octavos de final");
        octavosFinal.addPartido(new Partido(new Date(), mejoresGrupoA.get(0),mejoresGrupoC.get(1), new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoD.get(0),mejoresGrupoE.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoC.get(0),mejoresGrupoD.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoE.get(0),mejoresGrupoC.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoC.get(0),mejoresGrupoA.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoB.get(0),mejoresGrupoA.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoD.get(0),mejoresGrupoC.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoF.get(0),mejoresGrupoE.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoH.get(0),mejoresGrupoG.get(1),new Resultado()));

        System.out.println("\n Los equipos que pasaron a octavos son: \n ");
        for (int i=0 ; i<mejoresGrupoA.size() ; i++){
            System.out.println(mejoresGrupoA.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoB.size() ; i++){
            System.out.println(mejoresGrupoB.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoC.size() ; i++){
            System.out.println(mejoresGrupoC.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoD.size() ; i++){
            System.out.println(mejoresGrupoD.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoE.size() ; i++){
            System.out.println(mejoresGrupoE.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoF.size() ; i++){
            System.out.println(mejoresGrupoF.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoG.size() ; i++){
            System.out.println(mejoresGrupoG.get(i).getNombre());
        }

        for (int i=0 ; i<mejoresGrupoH.size() ; i++){
            System.out.println(mejoresGrupoH.get(i).getNombre());
        }

        EtapaMundial cuartosFinal = new Llave();
        cuartosFinal.setDescripcionEtapa("cuartos de final");
        ArrayList<Equipo> mejoresOctavos = octavosFinal.getEquiposQueAvanzan();

        System.out.println("\n Los equipos que pasan a cuartos son: \n ");
        for (int i=0 ; i<mejoresOctavos.size() ; i++){
            System.out.println(mejoresOctavos.get(i).getNombre());
        }

        cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(0),mejoresOctavos.get(2),new Resultado()));
        cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(1),mejoresOctavos.get(3),new Resultado()));
        cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(4),mejoresOctavos.get(6),new Resultado()));
        cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(5),mejoresOctavos.get(7),new Resultado()));


        ArrayList<Equipo> mejoresCuartos = cuartosFinal.getEquiposQueAvanzan();

        System.out.println("\nLos equipos que llegan a semis son: \n ");

        for (int i=0 ; i<mejoresCuartos.size() ; i++){
            System.out.println(mejoresCuartos.get(i).getNombre());
        }

        EtapaMundial semiFinal = new Llave();
        semiFinal.setDescripcionEtapa("semi Final");

        semiFinal.addPartido(new Partido(new Date(),mejoresCuartos.get(0),mejoresCuartos.get(2),new Resultado()));
        semiFinal.addPartido(new Partido(new Date(),mejoresCuartos.get(1),mejoresCuartos.get(3),new Resultado()));

        // FINAL
        ArrayList<Equipo> mejoresSemifinal = semiFinal.getEquiposQueAvanzan();

        System.out.println("\n Los equipos que llegaron a la final son: ");

        for (int i=0 ; i<mejoresSemifinal.size() ; i++){
            System.out.println(mejoresSemifinal.get(i).getNombre());
        }

        EtapaMundial partidoFinal = new Llave();
        partidoFinal.setDescripcionEtapa("final");

        partidoFinal.addPartido(new Partido(new Date(),mejoresSemifinal.get(0),mejoresSemifinal.get(1),new Resultado()));

        // Ganador del mundial
        ArrayList<Equipo> ganador = partidoFinal.getEquiposQueAvanzan();
        System.out.println("\n El ganador del mundial rusia 2018 es................ " + ganador.get(0).getNombre() + "!!!!!!");

    }

}

