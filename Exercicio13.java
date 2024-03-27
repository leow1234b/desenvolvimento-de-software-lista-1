public class Exercicio13 {
    public static void Executar(){
        double A = Prompt.lerDecimal("Digite o valor de A: ");
        double B = Prompt.lerDecimal("Digite o valor de B: ");
        char operador = Prompt.lerLinha("Digite o operador (+, -, *, /): ").charAt(0);

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}