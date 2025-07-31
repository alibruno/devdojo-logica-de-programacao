package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex03ParesDe1aX {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número:");
        int x = teclado.nextInt();
        String numerosPares = "";

        if (x < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    numerosPares = numerosPares + i + " ";
                }
            }

            System.out.println(numerosPares);

            teclado.close();
        }
    }
}
