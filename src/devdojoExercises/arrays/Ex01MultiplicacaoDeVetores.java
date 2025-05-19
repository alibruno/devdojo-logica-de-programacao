package devdojoExercises.arrays;

import java.util.Scanner;

public class Ex01MultiplicacaoDeVetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor1 = new int[9];
        int[] vetor2 = new int[9];
        int[] vetorResultante = new int[9];
        String valoresVR = "";
        for (int i = 0; i < 9; i++) {
            System.out.println("Posição " + (i+1) + ":");
            System.out.println("Insira o valor do vetor 1:");
            vetor1[i] = teclado.nextInt();
            System.out.println("Insira o valor do vetor 2:");
            vetor2[i] = teclado.nextInt();

            vetorResultante[i] = vetor1[i] * vetor2[i];
            valoresVR = valoresVR + vetorResultante[i] + " ";
        }

        System.out.println(valoresVR);

        teclado.close();


    }
}