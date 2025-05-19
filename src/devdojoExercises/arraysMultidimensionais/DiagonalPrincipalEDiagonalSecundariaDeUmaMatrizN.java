package devdojoExercises.arraysMultidimensionais;

import java.util.Scanner;

public class DiagonalPrincipalEDiagonalSecundariaDeUmaMatrizN {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Defina o tamanho da matriz:");
        int numMQuadrada = leia.nextInt();
        int[][] matriz = new int[numMQuadrada][numMQuadrada];
        int[] diagonalPrincipal = new int[numMQuadrada];
        int[] diagonalSecundaria = new int[numMQuadrada];
        int resultadoMultiplicacaoDP = 1;
        int resultadoMultiplicacaoDS = 1;

        for (int i = 0; i < numMQuadrada; i++) {
            for (int j = 0; j < numMQuadrada; j++) {
                System.out.println("Posicao: Linha (" + (i + 1) + ") Coluna (" + (j + 1) + "):");
                matriz[i][j] = leia.nextInt();
                if (i == j) {
                    diagonalPrincipal[j] = matriz[i][j];
                }
                if ((i + j) == (numMQuadrada - 1)) {
                    diagonalSecundaria[j] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < numMQuadrada; i++) {
            resultadoMultiplicacaoDP = resultadoMultiplicacaoDP * diagonalPrincipal[i];
            resultadoMultiplicacaoDS = resultadoMultiplicacaoDS * diagonalSecundaria[i];
        }

        System.out.println("Multiplicação da diagonal principal: " + resultadoMultiplicacaoDP);
        System.out.println("Multiplicação da diagonal secundaria: " + resultadoMultiplicacaoDS);
    }
}


