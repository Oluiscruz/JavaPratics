import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        n1 = 1350;
        n2 = 3200;
        n3 = 1350;
        n4 = 2550;

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média salarial da empresa é de: " + media + " Reais");
    }
}
