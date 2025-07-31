package devdojoExercises.funcoes.ex03.test;

import devdojoExercises.funcoes.ex03.dominio.ConversaoDeEscalasTermometricas;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeEscalasTermometricasTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ConversaoDeEscalasTermometricas conversaoDeEscalasTermometricas = new ConversaoDeEscalasTermometricas();
        String[] conversoesEmMemoria = new String[5];
        int countConversoes = 0;
        int quantOp = 0;
        while (true) {
            System.out.println("Menu de opções de conversão:");
            System.out.println("Considere ºC (celsius), ºF (Fahrenheit) e K (kelvin)");
            System.out.println("Digite: 1. ºC -> ºF // 2. ºF -> ºC // 3. ºC -> K // 4. K -> ºC // 5. K -> ºF // 6. ºF -> K");
            System.out.println("Outras operações: 0. Encerrar // -1. Exibir valores em memória.");
            byte opCode = input.nextByte();
            if (opCode == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            if (opCode == -1) {
                if (quantOp == 0) {
                    System.out.println("Não há valores em memória.");
                } else if (quantOp < 5) {
                    for (int i = 0; i < quantOp; i++) {
                        System.out.println(conversoesEmMemoria[i]);
                    }
                } else {
                    System.out.println("Observação: Pode estar fora de ordem cronológica.");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(conversoesEmMemoria[i]);
                    }
                }
                System.out.println("---------------------------");
                continue;
            }
            if (opCode < -1 || opCode > 6) {
                System.out.println("Número de operação inválido.");
                System.out.println("--------------------------------------------------------");
                continue;
            }

            System.out.println("-------------------------------------------");
            System.out.println("Digite o número a ser convertido:");
            int num = input.nextInt();
            switch (opCode) {
                case 1:
                    conversoesEmMemoria[countConversoes] = num + "ºC = " + conversaoDeEscalasTermometricas.celsiusParaFahrenheit(num) + "ºF";
                    break;
                case 2:
                    conversoesEmMemoria[countConversoes] = num + "ºF = " + conversaoDeEscalasTermometricas.fahrenheitParaCelsius(num) + "ºC";
                    break;
                case 3:
                    conversoesEmMemoria[countConversoes] = num + "ºC = " + conversaoDeEscalasTermometricas.celsiusParaKelvin(num) + "K";
                    break;
                case 4:
                    conversoesEmMemoria[countConversoes] = num + "K = " + conversaoDeEscalasTermometricas.kelvinParaCelsius(num) + "ºC";
                    break;
                case 5:
                    conversoesEmMemoria[countConversoes] = num + "K = " + conversaoDeEscalasTermometricas.kelvinParaFahrenheit(num) + "ºF";
                    break;
                case 6:
                    conversoesEmMemoria[countConversoes] = num + "ºF = " + conversaoDeEscalasTermometricas.fahrenheitParaKelvin(num) + "K";
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            System.out.println("-------------------------------------------");
            countConversoes++;
            if (countConversoes > 4){
                countConversoes = 0;
            }
            quantOp++;

        }
    }
}
