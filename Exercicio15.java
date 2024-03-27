public class Exercicio15 {
   public static void Executar(){
    double x1 = Prompt.lerDecimal("Digite a coordenada x1 do ponto P1: ");
        double y1 = Prompt.lerDecimal("Digite a coordenada y1 do ponto P1: ");
        double x2 = Prompt.lerDecimal("Digite a coordenada x2 do ponto P2: ");
        double y2 = Prompt.lerDecimal("Digite a coordenada y2 do ponto P2: ");

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f%n", distancia);
    }
}

   

