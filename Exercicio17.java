public class Exercicio17 {
    public static void Executar (){
        double nota1 = Prompt.lerDouble("Digite a primeira nota: ");
        double peso1 = Prompt.lerDouble("Digite o peso da primeira nota: ");
        double nota2 = Prompt.lerDouble("Digite a segunda nota: ");
        double peso2 = Prompt.lerDouble("Digite o peso da segunda nota: ");
        double nota3 = Prompt.lerDouble("Digite a terceira nota: ");
        double peso3 = Prompt.lerDouble("Digite o peso da terceira nota: ");

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média ponderada é: %.2f%n", mediaPonderada);
    }
}
    

