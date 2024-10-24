import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km, hm, dam, dm, cm, mm;

        km = 1000;
        hm = 100;
        dam = 10;
        dm = 0.1;
        cm = 0.01;
        mm = 0.001;

        System.out.println();
        System.out.println("Olá\nBem vindo(a)!");
        System.out.println();
        System.out.print("Digite a quantidade de metros: ");
        double m = scanner.nextDouble();

        if (m >= 1) {
            System.out.println();
            System.out.println("Em quilômetros isso representa: " + (m / km) + " km");
            System.out.println("Em hectômetros isso representa: " + (m / hm) + " hm");
            System.out.println("Em decâmetros isso representa: " + (m / dam) + " dam");
            System.out.println("Em decímetros isso representa: " + (m / dm) + " dm");
            System.out.println("Em centímetros isso representa: " + (m / cm) + " cm");
            System.out.println("Em milímetros isso representa: " + (m / mm) + " mm");
            System.out.println();

        } else {
            System.out.println();
            System.out.println("Digite um valor acima de 0..");
            System.out.println();

        }

    }
}
