import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // criando um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Solicita o primeiro número ao usuário
        System.out.print("Digite a primeiro nota: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        int n3 = scanner.nextInt();

        System.out.print("Digite a quarta nota: ");
        int n4 = scanner.nextInt();

        int media = (n1 + n2 + n3 + n4 / 4);

        System.out.println("A sua média final é: " + media);
        
        if (media > 7) {
            System.out.println("");
            System.out.println("Parabéns você foi aprovado");
        } else {
            System.out.println("");
            System.out.println("Você foi reprovado!");

        }
    }
}