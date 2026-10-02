import java.util.Arrays;

public class Disciplina {
    private String disciplina;
    private double[] notas;
    private int horas;

    public Disciplina(String disciplina){
        this.disciplina = disciplina;
        notas = new double[4];
    }

    public void cadastraNota(int nota, double valor){
        notas[nota -1] = valor;
    }

    public boolean aprovado(){
        double media = 0;
        for (double nota : notas){
            media += nota;
        }
        if (media / 4 >= 7)
            return true;
        return false;
    }

    public void cadastraHoras(int horas){
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
