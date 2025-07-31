package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex02SomatorioDeXNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número:");
        int x = teclado.nextInt();
        int soma = 0;

        for (int i = 1; i <= x; i++) {
            soma += i;
        }

        System.out.println("O somatório é: " + soma);

        teclado.close();
    }
}
