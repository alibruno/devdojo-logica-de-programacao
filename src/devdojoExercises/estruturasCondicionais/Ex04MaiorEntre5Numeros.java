package devdojoExercises.estruturasCondicionais;

import java.util.Scanner;

public class Ex04MaiorEntre5Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Insira o 1º número:");
        numeros[0] = teclado.nextInt();
        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = teclado.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);

        teclado.close();
    }
}
