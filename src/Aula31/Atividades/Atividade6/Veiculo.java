package Aula31.Atividades.Atividade6;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    /**
     * Construtor para inicializar os atributos de um veículo.
     *
     * @param marca A marca do veículo.
     * @param modelo O modelo do veículo.
     * @param ano O ano do veículo.
     */
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     */
    public abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     */
    public abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     */
    public abstract void acelerar();
}