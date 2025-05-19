package devdojoExercises.estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex05As4Operacoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual operação você deseja realizar? + (Soma) - (Subtração) * (Multiplicação) / (divisão)");
        char operacao = teclado.next().charAt(0);
        System.out.println("Insira o 1º número:");
        float num1 = teclado.nextFloat();
        System.out.println("Insira o 2º número:");
        float num2 = teclado.nextFloat();

        switch (operacao) {
            case '+':
                System.out.printf(Locale.US, "Resultado: %.2f\n", (num1 + num2));
                break;
            case '-':
                System.out.printf(Locale.US, "Resultado: %.2f\n", (num1 - num2));
                break;
            case '*':
                System.out.printf(Locale.US, "Resultado: %.2f\n", (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    System.out.printf(Locale.US, "Resultado: %.2f\n", (num1 / num2));
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        teclado.close();
    }
}
