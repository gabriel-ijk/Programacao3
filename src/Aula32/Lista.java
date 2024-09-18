package Aula32;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    // Construtor que permite omitir o tamanho e define a capacidade como 10
    public Lista() {
        this(10);  // Chama o outro construtor com capacidade 10
    }

    // Construtor que permite definir o tamanho da lista
    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    // Adiciona um elemento à lista
    public void adiciona(T elemento) {
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    // Adiciona um elemento em uma posição específica da lista
    public void adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        }
        aumentaCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    // Aumenta a capacidade da lista caso necessário
    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] aux = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    // Obtém o elemento na posição especificada
    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        }
        return elementos[posicao];
    }

    // Método que pesquisa e diz se o elemento existe na lista
    public boolean contem(T elemento) {
        return posicaoDe(elemento) >= 0;
    }

    // Remove o elemento na posição especificada
    public T remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        }
        T copia = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return copia;
    }

    // Método que remove o elemento pelo valor
    public boolean remove(T elemento) {
        int posicao = posicaoDe(elemento);
        if (posicao >= 0) {
            remove(posicao);
            return true;
        }
        return false;
    }

    // Método que limpa a lista
    public void limpar() {
        elementos = (T[]) new Object[elementos.length];
        tamanho = 0;
    }

    // Método que retorna o tamanho da lista
    public int tamanho() {
        return tamanho;
    }

    // Método que verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método que retorna a posição do primeiro elemento
    public int posicaoDe(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Método que retorna a última posição de determinado elemento
    public int ultimaPosicaoElemento(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Método que retorna a lista em formato de string
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("[");
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                retorno.append(elementos[i]).append(", ");
            }
            retorno.append(elementos[tamanho - 1]);
        }
        retorno.append("]");
        return retorno.toString();
    }
}







