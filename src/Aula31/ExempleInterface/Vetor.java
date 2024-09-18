package Aula31.ExempleInterface;

public class Vetor implements Lista{

    private String[] elementos;

    private int tamanho;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }



    @Override
    public void adiciona (String elemento){
        elementos[tamanho++]= elemento;
    }

    @Override
    public String remove(){
        if(tamanho>0){
            return elementos[--tamanho];
        }
        return null;
    }

    /**
     * Retorna a lista em formato de conjunto
     * @return [] = vazio ou ["Elemento 1", "Elemento 2", "Elemento n"]
     */
    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        String resposta = "[";
        if(tamanho>0){
            for(int i=0;i<tamanho-1;i++){
                resposta+=elementos[i]+", ";
            }
            resposta+=elementos[tamanho-1];
        }
        resposta+="]";
        return resposta;
    }
}
