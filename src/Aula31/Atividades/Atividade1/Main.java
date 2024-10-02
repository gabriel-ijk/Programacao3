package Aula31.Atividades.Atividade1;

public class Main {
    public static void main(String[] args) {
        Pagamento mensalista = new FuncionarioMensalista("João", 3000);
        Pagamento horista = new FuncionarioHorista("Maria", 0, 160, 25);
        Pagamento comissionado = new FuncionarioComissionado("Pedro", 1500, 10000, 0.1);

        mensalista.processarPagamento();
        horista.processarPagamento();
        comissionado.processarPagamento();
    }
}
