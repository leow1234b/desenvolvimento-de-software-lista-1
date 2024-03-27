public class Exercicio1 {
    public static void Executar(){
        int numero = Prompt.lerInteiro("Digite um número: ");
        
        if (numero > 10) {
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        }
    }
}
    

