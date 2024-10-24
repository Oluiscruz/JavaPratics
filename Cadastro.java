import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProfissionais = 5;

        String[] nome = new String[maxProfissionais];
        String[] cargo = new String[maxProfissionais];
        double[] salario = new double[maxProfissionais];

        int contador = 0;
        String opcao;

        do {
            if (contador < maxProfissionais) {
                System.out.println("\nCadastro de profissional " + (contador + 1));

                System.out.print("Nome: ");
                nome[contador] = scanner.nextLine();

                System.out.print("Cargo: ");
                cargo[contador] = scanner.nextLine();

                System.out.print("Salário: ");
                salario[contador] = scanner.nextDouble();
                scanner.nextLine();

                contador++;

                System.out.println("Deseja cadastrar outro profissional? (S/N): ");
                opcao = scanner.nextLine();

            } else {
                System.out.println("Número máximo de pessoas cadastradas.");
                break;

            }
        } while (opcao.equalsIgnoreCase("S"));

        System.out.println("\nProfissionais cadastrados: ");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". Nome: " + nome[i] + "\nCargo: " + cargo[i] + "\nSalário: R$ " + salario[i]);
            System.out.println();
        }

        scanner.close();
    }
}
