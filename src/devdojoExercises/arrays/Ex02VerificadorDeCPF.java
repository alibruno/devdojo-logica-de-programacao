package devdojoExercises.arrays;

import java.util.Scanner;

public class Ex02VerificadorDeCPF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu cpf (apenas números. Sem '.' e '-':");
        String stringCPF = teclado.next();
        char[] charCPF = stringCPF.toCharArray();

        if (charCPF.length != 11) {
            System.out.println("CPF Inválido. \nPossíveis causas: \n1.Inseriu '.' e/ou '-'; \n2.Entrada diferente de 11 dígitos.");
        } else {
            int[] algarismosCPF = new int[charCPF.length];

            for (int i = 0; i < charCPF.length; i++) {
                algarismosCPF[i] = charCPF[i] - '0';
            }

            boolean todosOsDigitosDoCPFSaoIguais = true;

            for (int i = 0; i < algarismosCPF.length; i++) {
                if (algarismosCPF[0] != algarismosCPF[i]) {
                    todosOsDigitosDoCPFSaoIguais = false;
                    break;
                }
            }

            if (todosOsDigitosDoCPFSaoIguais == true) {
                System.out.println("CPF Inválido - Todos os dígitos iguais");
            } else {

                int somaDosAlgarismosCPF = 0;

                for (int i = 0; i < 9; i++) {
                    somaDosAlgarismosCPF = somaDosAlgarismosCPF + algarismosCPF[i] * (10 - i);
                }

                int primeiroDigitoVerificadorCPF = 11 - (somaDosAlgarismosCPF % 11);

                if (primeiroDigitoVerificadorCPF >= 10) {
                    primeiroDigitoVerificadorCPF = 0;
                }

                if (algarismosCPF[9] != primeiroDigitoVerificadorCPF) {
                    System.out.println("CPF Inválido");
                } else {
                    somaDosAlgarismosCPF = 0;

                    for (int i = 0; i < 10; i++) {
                        somaDosAlgarismosCPF = somaDosAlgarismosCPF + algarismosCPF[i] * (11 - i);
                    }

                    int segundoDigitoVerificadorCPF = 11 - (somaDosAlgarismosCPF % 11);

                    if (segundoDigitoVerificadorCPF >= 10) {
                        segundoDigitoVerificadorCPF = 0;
                    }

                    if (algarismosCPF[10] != segundoDigitoVerificadorCPF) {
                        System.out.println("CPF Inválido");
                    } else {
                        System.out.println("CPF Válido");
                    }
                }
            }
        }
        teclado.close();
    }
}
