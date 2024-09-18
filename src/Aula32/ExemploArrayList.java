package Aula32;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {

        //ArrayList<tipo ->Integer | Float | Double | Pessoa >nome = new
        //ArrayLIst<>(capacidade -> opicional)
        ArrayList<String> l1 = new ArrayList<>();
        //metodo para adicionar elementos

        l1.add("A");
        l1.add("c");
        l1.add("D");
        l1.add("E");
        l1.add("F");
        l1.add("G");
        System.out.println(l1);
        l1.add(1,"B");
        System.out.println(l1);

    }
}
