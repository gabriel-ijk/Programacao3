package Aula31.Atividades.Atividade6;

public class Moto extends Veiculo implements Manutencao {

    /**
     * Construtor para inicializar os atributos de uma moto.
     *
     * @param marca A marca da moto.
     * @param modelo O modelo da moto.
     * @param ano O ano da moto.
     */
    public Moto(String marca, String modelo, int ano) {
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
        System.out.println("Realizando manutenção na moto " + marca + " " + modelo + ".");
    }
}
