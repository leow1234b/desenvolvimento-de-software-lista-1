public class Exercicio18 {
    public static void Executar(){
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.printf("A média harmônica é: %.2f%n", mediaHarmonica);
    }
}
    

