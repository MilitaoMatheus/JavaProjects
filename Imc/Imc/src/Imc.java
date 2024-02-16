import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de IMC: ");

        System.out.println(">> Digite o valor da sua altura: ");
        double alt = scanner.nextDouble();

        System.out.println(">> Digite o valor do seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso/(alt * alt);

        if (imc < 16.9){
            System.out.println("Muito abaixo do peso: " +imc);
        } else if (imc > 17 && imc < 18.4){
            System.out.println("Abaixo do peso: " +imc);
        } else if (imc > 18.5 && imc < 24.9){
            System.out.println("Peso normal: " +imc);
        } else if (imc > 25 && imc < 29.9){
            System.out.println("Acima do peso: " +imc);
        } else if(imc > 30 && imc < 34.9){
            System.out.println("Obesidade tipo 1: " +imc);
        } else if (imc > 35 && imc < 40){
            System.out.println("Obesidade tipo 2: " +imc);
        } else if (imc > 40){
            System.out.println("Peso normal: " +imc);
        }

        scanner.close();
    }
}