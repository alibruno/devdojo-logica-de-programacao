package devdojoExercises.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex01StatusAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        float[] notas = new float[4];
        float media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a nota " + (i + 1) + ":");
            notas[i] = teclado.nextFloat();
            media = media + notas[i];
        }
        media = media / notas.length;

        if (media < 50) {
            System.out.println("Média:" + media + " - REPROVADO");
        } else if (media == 50) {
            System.out.println("Média:" + media + " - RECUPERAÇÃO");
        } else {
            System.out.println("Média:" + media + " - APROVADO");
        }

        teclado.close();
    }
}
