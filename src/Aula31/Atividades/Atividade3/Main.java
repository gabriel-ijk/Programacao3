package Aula31.Atividades.Atividade3;

public class Main {
    public static void main(String[] args) {
        Transporte carro = new Carro(5, 180);
        Transporte bicicleta = new Bicicleta(1, 25);
        Transporte aviao = new Aviao(150, 900);

        carro.mover();
        ((Combustivel) carro).abastecer();
        carro.parar();

        bicicleta.mover();
        bicicleta.parar();

        aviao.mover();
        ((Combustivel) aviao).abastecer();
        aviao.parar();
    }
}
