public class Exercicio20 {
    public static void Executar(){
        double tempo = Prompt.lerDecimal("Digite o tempo da viagem em horas: ");
        double velocidadeMedia = Prompt.lerDecimal("Digite a velocidade média em km/h: ");

        double distancia = tempo * velocidadeMedia;
        double consumo = 12.0;
        double litros = distancia / consumo;

        System.out.printf("A quantidade de litros de combustível gasta na viagem é: %.2f%n", litros);
    }
}
    

    

