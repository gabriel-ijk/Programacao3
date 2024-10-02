package Aula31.Atividades.Atividade6;

public class Caminhao extends Veiculo implements Manutencao {

    /**
     * Construtor para inicializar os atributos de um caminhão.
     *
     * @param marca A marca do caminhão.
     * @param modelo O modelo do caminhão.
     * @param ano O ano do caminhão.
     */
    public Caminhao(String marca, String modelo, int ano) {
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
        System.out.println("Realizando manutenção no caminhão " + marca + " " + modelo + ".");
    }
}
