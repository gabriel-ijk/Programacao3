package Aula31.Atividades.Atividade6;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020);
        Moto moto = new Moto("Honda", "CB500", 2019);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021);

        carro.ligar();
        carro.acelerar();
        carro.realizarManutencao();
        carro.desligar();

        moto.ligar();
        moto.acelerar();
        moto.realizarManutencao();
        moto.desligar();

        caminhao.ligar();
        caminhao.acelerar();
        caminhao.realizarManutencao();
        caminhao.desligar();
    }
}