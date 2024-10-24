
public class Array {
    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println();
        System.out.println("O elemento no índice 0 é: " + numeros[0]);
        System.out.println("O elemento no índice 3 é: " + numeros[3]);

        System.out.println("Todos os elementos do array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma de todos os elementos é: " + soma);
        System.out.println();
    }
}