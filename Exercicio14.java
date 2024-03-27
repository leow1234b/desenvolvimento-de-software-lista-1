public class Exercicio14 {
    public static void Executar(){
        int a1 = prompt.lerInteiro("Digite o primeiro termo (a1) da PA: ");
        int n = prompt.lerInteiro("Digite a posição do termo desejado (n): ");
        int r = prompt.lerInteiro("Digite a razão (r) da PA: ");

        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "º termo da PA é: " + an);
    }
} 
    

