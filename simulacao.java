import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco!");

        // Solicitar dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        // Simular a criação da conta bancária
        criarContaBancaria(nome, cpf, depositoInicial);

        // Mensagem de sucesso
        System.out.println("Conta bancária criada com sucesso!");
    }

    // Método que simula a criação da conta bancária
    public static void criarContaBancaria(String nome, String cpf, double depositoInicial) {
        // Aqui você pode adicionar a lógica para armazenar os dados da conta bancária
        System.out.println("Detalhes da conta:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Depósito inicial: R$ " + depositoInicial);
    }
}
