public class Exercicio11 {
    public static void Executar(){
        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = prompt.lerInteiro("Digite o segundo número: ");
        int c = Prompt.lerInteiro("Digite o terceiro número: ");
        
        if (a <= b && a <= c) {
            System.out.print(a + ", ");
            if (b <= c) {
                System.out.print(b + ", " + c);
            } else {
                System.out.print(c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            System.out.print(b + ", ");
            if (a <= c) {
                System.out.print(a + ", " + c);
            } else {
                System.out.print(c + ", " + a);
            }
        } else {
            System.out.print(c + ", ");
            if (a <= b) {
                System.out.print(a + ", " + b);
            } else {
                System.out.print(b + ", " + a);
            }
        }
    }
}
    

