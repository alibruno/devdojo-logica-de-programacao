package devdojoExercises.funcoes.ex01e02.test;

import devdojoExercises.funcoes.ex01e02.dominio.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Qual operação você deseja realizar? + (Soma) - (Subtração) * (Multiplicação) / (divisão) ^ (potenciação - 1ºnum = Base; 2ºNum = Potenc.) ? (raiz quadrada de 2 números)");
            System.out.println("Outras operações: & (Encerrar)");
            char operacao = input.next().charAt(0);
            if (operacao == '&') {
                break;
            }
            switch (operacao) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    System.out.println("Insira o 1º número:");
                    double num1 = input.nextDouble();
                    System.out.println("Insira o 2º número:");
                    double num2 = input.nextDouble();
                    switch (operacao) {
                        case '+':
                            System.out.printf("Resultado: %.2f\n", calculadora.somaDoisNumeros(num1, num2));
                            break;
                        case '-':
                            System.out.printf("Resultado: %.2f\n", calculadora.subtracaoDoisNumeros(num1, num2));
                            break;
                        case '*':
                            System.out.printf("Resultado: %.2f\n", calculadora.multiplicacaoDoisNumeros(num1, num2));
                            break;
                        case '/':
                            if (!Double.isNaN(calculadora.divisaoDoisNumeros(num1, num2))) {
                                System.out.printf("Resultado: %.2f\n", calculadora.divisaoDoisNumeros(num1, num2));
                            }
                            break;
                        case '^':
                            if (!Double.isNaN(calculadora.potencia(num1, num2))) {
                                System.out.printf("Resultado: %.2f\n", calculadora.potencia(num1, num2));
                            }
                            break;
                    }
                    break;
                case '?':
                    System.out.println("Insira o número:");
                    double num = input.nextDouble();
                    if (!Double.isNaN(calculadora.raizQuadradaEquacaoDePell(num))) {
                        System.out.printf("Precisão inteira: %.2f\n", calculadora.raizQuadradaEquacaoDePell(num));
                    } else {
                        System.out.println("A raiz quadrada de um número negativo não existe no conjunto dos números reais.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
