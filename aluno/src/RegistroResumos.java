public class RegistroResumos {
    private Resumos[] arrayResumos;
    private int quantidadeResumos;
    private int indice;

    public RegistroResumos(int quantidade){
        arrayResumos = new Resumos[quantidade];
        quantidadeResumos = 0;
        indice = 0;
    }

    public void adiciona(String tema, String resumo){
        Resumos resume = new Resumos();
        boolean tem = false;
        for(int i = 0; i < quantidadeResumos; i++){
            if (arrayResumos[i].getTema().equals(tema))
                tem = true;
                break;
        }
        if (!tem) {
            arrayResumos[indice] = resume;
            arrayResumos[indice].setTema(tema);
            arrayResumos[indice].setResumo(resumo);
            quantidadeResumos += 1;
            indice = (indice + 1 > arrayResumos.length) ? 0 : indice + 1;
        }
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < quantidadeResumos; i++){
            if (arrayResumos[i].getTema().equals(tema))
                return true;
        }
        return false;
    }

    public int contaResumos(){
        return quantidadeResumos;
    }

    public String[] pegaResumos(){
        String[] resumos = new String[quantidadeResumos];
        for (int i = 0; i < quantidadeResumos; i++){
            resumos[i] = String.format("%s: %s", arrayResumos[i].getTema(), arrayResumos[i].getResumo());
        }
        return resumos;
    }

    public String imprimeResumos(){
        String saida = "- " + quantidadeResumos + " Resumo(s) cadastrado(s)\n- ";
        int i = 0;
        while (i < quantidadeResumos - 1){
            saida += arrayResumos[i].getTema() + " | ";
            i++;
        }
        saida += arrayResumos[i].getTema();
        return saida;
    }
}
