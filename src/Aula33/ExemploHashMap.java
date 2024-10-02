package Aula33;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitais = new HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("PR","Curitiba");
        capitais.put("SC","Florianópolis");
        capitais.put("GO","Goiânia");

        System.out.println("Estados...");
        for(String estado:capitais.keySet())
            System.out.println(estado+"");

        System.out.println("\nCidades");
        for (String cidade:capitais.values())
            System.out.println(cidade+"");
        System.out.println("\nLista completa");
        System.out.println(capitais);
        capitais.put("RS","Rio Grande");
        System.out.println(capitais);
        System.out.println(capitais.get("RS"));
        System.out.println(capitais.containsValue("Rio Grande"));

    }





}
