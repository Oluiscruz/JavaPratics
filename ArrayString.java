public class ArrayString {
    public static void main(String[] args) {

        String[] animais = { "cachorro", "gato", "coelho", "hamster" };

        System.out.println();
        System.out.println("O elemento no índice 0 é: " + animais[0]);
        System.out.println("O elemento no índice 3 é: " + animais[3]);

        System.out.println("Todos os animais no Array: ");
        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i]);
        }

        String TodosAnimais = "";
        for (String animal : animais) {
            TodosAnimais += animal + " - ";
        }

        System.out.println("Lista de todos os animais: " + TodosAnimais.trim());
    }
}
