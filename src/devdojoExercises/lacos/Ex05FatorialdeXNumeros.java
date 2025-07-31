package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex05FatorialdeXNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira quantos números você pretende calcular o fatorial:");
        int quantNumeros = teclado.nextInt();
        int numeros[] = new int[quantNumeros];
        int fatorial = 1;
        String fatorialDosNumerosAtribuidos = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + " número:");
            numeros[i] = teclado.nextInt();
            for (int j = 1; j <= numeros[i]; j++) {
                fatorial = fatorial * j;
            }
            if (numeros[i] < 0) {
                System.out.println("Fatorial não é definido para números negativos. Porém, se tiver digitado um número válido, ele será mostrado abaixo.\n");
                break;
            } else {
                fatorialDosNumerosAtribuidos = fatorialDosNumerosAtribuidos + "Fatorial do número " + numeros[i] + ": " + fatorial + "\n";
                fatorial = 1;
            }
        }

        System.out.println(fatorialDosNumerosAtribuidos);

        teclado.close();
    }
}
