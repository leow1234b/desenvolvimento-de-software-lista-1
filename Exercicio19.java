public class Exercicio19 {
public static void executar(){
    Double raio = Prompt.lerDecimal("Digite o raio do cilindro: ");
        double altura = Prompt.lerDecimal("Digite a altura do cilindro: ");

        double volume = 3.14 * raio * raio * altura;

        System.out.printf("O volume do cilindro é: %.2f%n", volume);
    }
}



    

