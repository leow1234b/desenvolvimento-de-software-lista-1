public class Exercicio3 {
    public static void Executar(){

        int A = prompt.lerInteiro("Digite o primeiro número (A): ");
        int B = prompt.lerInteiro("Digite o segundo número (B): ");
        
        if (A > B) {
            System.out.println("O maior número é A: " + A);
        } else if (B > A) {
            System.out.println("O maior número é B: " + B);
        } else {
            System.out.println("A sequência de números informada é inválida, pois são iguais.");
        }
    }
    }


