package Aula33.Teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// classe Atendimento
class Atendimento {
    private LocalDate data;
    private String descricao;

    public Atendimento(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Data: " + data.format(formatoBr) + ", Descrição: " + descricao;
    }
}

// classe Paciente
class Paciente {
    private String nome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;
    private boolean ativo;

    public Paciente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.atendimentos = new ArrayList<>();
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return nome.equalsIgnoreCase(paciente.nome);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento.format(formatoBr);
    }

    // método para mostrar atendimentos de 5 em 5
    public void mostrarAtendimentos() {
        int total = atendimentos.size();
        for (int i = 0; i < total; i += 5) {
            for (int j = i; j < Math.min(i + 5, total); j++) {
                System.out.println(atendimentos.get(j));
            }
            if (i + 5 < total) {
                System.out.println("Pressione Enter para continuar...");
                new Scanner(System.in).nextLine();
            }
        }
    }
}

// Classe principal
public class SistemaConsultaMedica {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    incluirPaciente();
                    break;
                case 2:
                    alterarPaciente();
                    break;
                case 3:
                    realizarAtendimento();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    mostrarPaciente();
                    break;
                case 6:
                    apagarPaciente();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("=== Sistema de Consultas Médicas ===");
        System.out.println("1. Incluir paciente");
        System.out.println("2. Alterar paciente");
        System.out.println("3. Realizar atendimento");
        System.out.println("4. Listar pacientes");
        System.out.println("5. Mostrar paciente");
        System.out.println("6. Apagar paciente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // método para incluir um paciente
    private static void incluirPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Paciente novoPaciente = new Paciente(nome, dataNascimento);
        pacientes.add(novoPaciente);
        System.out.println("Paciente incluído com sucesso!");
    }

    // método para alterar um paciente
    private static void alterarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.print("Novo nome do paciente: ");
            String novoNome = scanner.nextLine();
            paciente.setNome(novoNome);
            System.out.println("Dados do paciente atualizados.");
        }
    }

    // método para realizar um atendimento
    private static void realizarAtendimento() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.print("Descrição do atendimento: ");
            String descricao = scanner.nextLine();
            Atendimento atendimento = new Atendimento(LocalDate.now(), descricao);
            paciente.adicionarAtendimento(atendimento);
            System.out.println("Atendimento registrado.");
        }
    }

    // método para listar pacientes ativos
    private static void listarPacientes() {
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    // método para mostrar um paciente e seus atendimentos
    private static void mostrarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.println(paciente);
            System.out.println("Atendimentos:");
            paciente.mostrarAtendimentos();
        }
    }

    // método para apagar um paciente
    private static void apagarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            paciente.desativar();
            System.out.println("Paciente desativado.");
        }
    }

    // método para buscar paciente pelo nome
    private static Paciente buscarPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome) && paciente.isAtivo()) {
                return paciente;
            }
        }
        System.out.println("Paciente não encontrado ou desativado.");
        return null;
    }
}

