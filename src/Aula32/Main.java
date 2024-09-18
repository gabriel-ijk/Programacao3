package Aula32;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista(5);
        l1.adiciona("a");
        l1.adiciona("c");
        l1.adiciona("d");
        l1.adiciona("e");
        l1.adiciona("f");
        l1.adiciona("g");
        l1.adiciona("h");

        System.out.println(l1);

        System.out.println("Elementos da posição 1"+l1.obter(1));
        try{
            System.out.println("Elementos da posição 11"+l1.obter(11));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        l1.adiciona(1,"b");
        System.out.println(l1);
    }

}
