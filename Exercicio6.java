public class Exercicio6 {
    public static void Executar(){
        double celsius = Prompt.lerDecimal("Digite a temperatura em graus Celsius: ");
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
    

