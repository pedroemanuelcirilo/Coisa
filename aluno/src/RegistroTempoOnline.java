public class RegistroTempoOnline {
    private String disciplina;
    private int horasEsperadas;
    private int horasAtuais;

    public RegistroTempoOnline (String disciplina, int horasEsperadas){
        this.disciplina = disciplina;
        this.horasEsperadas = horasEsperadas;
    }

    public RegistroTempoOnline (String disciplina){
        this.disciplina = disciplina;
        horasEsperadas = 120;
    }

    public void adicionaTempoOnline(int horas){
        horasAtuais += horas;
    }

    public boolean atingiuMetaTempoOnline(){
        if (horasAtuais >= horasEsperadas)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "RegistroTempoOnline{" +
                "disciplina='" + disciplina + '\'' +
                ", horasEsperadas=" + horasEsperadas +
                ", horasAtuais=" + horasAtuais +
                '}';
    }
}
