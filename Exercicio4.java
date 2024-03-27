public class Exercicio4 {
   public static void Executar(){
    double numero1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double numero2 = Prompt.lerDecimal("Digite o segundo número: ");
        
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
   }
   

