package Aula31.ExempleInterface;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);

        v1.adiciona("Elemento 1");
        v1.adiciona("Elemento 2");
        v1.adiciona("Elemento 3");
        v1.adiciona("Elemento 4");

        System.out.println("Qual o tamanho da lista "+v1.tamanho());
        System.out.println(v1);
        System.out.println("Removendo elemento"+v1.remove());
        System.out.println(v1);


        /*para criar uma intancia de uma inteface preciso qccriar um contrutir
        de uma lcasse que a implemente, como desta forma estarão disponiveis na
         instancia criada apaenas nos metodos comuns a interface e a classe
         com o comportamento implementado na classe*/
        Lista l1 = new Vetor(5);
        l1.adiciona("teste");
        l1.adiciona("teste 2");
        l1.remove();
        //neste caso o método tamanho não vai estar disponível nainstancia

        l1.tamanho();
        System.out.println(l1);

    }
}
