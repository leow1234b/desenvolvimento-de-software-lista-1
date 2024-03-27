public class Exercicio7 {
    public static void Executar(){
        int numero = Prompt.lerInteiro("Digite um número: ");
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }
    }
}
    

