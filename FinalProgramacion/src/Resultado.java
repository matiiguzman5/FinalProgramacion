public class Resultado {

    private int golesLocal;
    private int golesVisita;

    public Resultado (int golesLocales, int golesVisitante ){
        this.golesLocal=golesLocales;
        this.golesVisita=golesVisitante;
    }

    public Resultado (){
        this.golesLocal= (int) (Math.random()*9);
        this.golesVisita=(int) (Math.random()*9);
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisita;
    }

    public boolean ganoLocal() {
        if (golesLocal > golesVisita) {
            return true;
        } else {
            return false;
        }
    }

    public boolean empate() {
        if (golesLocal == golesVisita) {
            return true;
        }
        return false;
    }
}