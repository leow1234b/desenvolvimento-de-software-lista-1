public class Exercicio9 {
    public static void Executar(){
        int A = Prompt.lerInteiro("Digite o valor de A: ");
        int B = Prompt.lerInteiro("Digite o valor de B: ");
        
        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + (A > B ? A : B));
        }
    }
    }

