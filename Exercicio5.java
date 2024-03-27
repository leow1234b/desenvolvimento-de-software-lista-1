public class Exercicio5 {
    public static void Executar(){
        int A = Prompt.lerInteiro("Digite o valor de A: ");
        int B = Prompt.lerInteiro("Digite o valor de B: ");

        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        // Troca dos valores
        int temp = A;
        A = B;
        B = temp;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
    

