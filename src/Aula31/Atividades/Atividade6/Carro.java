package Aula31.Atividades.Atividade6;

public class Carro extends Veiculo implements Manutencao {

    /**
     * Construtor para inicializar os atributos de um carro.
     *
     * @param marca A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano do carro.
     */
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligando.");
    }

    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligando.");
    }

    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro " + marca + " " + modelo + ".");
    }
}
