public class Descanso {
    private int horasDeDescanso;
    private int semanas;

    public void defineHorasDescanso(int horas){
        horasDeDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas){
        this.semanas = semanas;
    }

    public String getStatusGeral(){
        if ((horasDeDescanso != 0 && semanas != 0) && horasDeDescanso/semanas >= 26)
            return "descansado";
        return "cansado";
    }
}
