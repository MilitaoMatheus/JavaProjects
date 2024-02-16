import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora simples");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = scanner.nextInt();

        System.out.println("Escolha um número");
        double Num1 = scanner.nextDouble();

        System.out.println("Escolha outro número:");
        double Num2 = scanner.nextDouble();

        double resultado = 0;

        if (escolha == 1){
            resultado = Num1 + Num2;
        } else if (escolha == 2){
            resultado = Num1 - Num2;
        } else if (escolha == 3){
            resultado = Num1 * Num2;
        } else if (escolha == 4){
            if (Num2 != 0){
                resultado = Num1 / Num2;
            } else {
                System.out.println("Não é possível dividir por 0");
                return;
            }
        } else {
            System.out.println("Escolha uma opção válida");
            return;
        }
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

