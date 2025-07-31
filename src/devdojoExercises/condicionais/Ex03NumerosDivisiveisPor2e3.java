package devdojoExercises.condicionais;

import java.util.Scanner;

public class Ex03NumerosDivisiveisPor2e3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        String numDivisiveisPor2e3 = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0 || numeros[i] % 3 == 0) {
                numDivisiveisPor2e3 = numDivisiveisPor2e3 + numeros[i] + " ";
            }
        }

        if(numDivisiveisPor2e3.equals("")){
            System.out.println("Não há números divisíveis por 2 ou 3.");
        } else{
            System.out.println(numDivisiveisPor2e3);
        }

        teclado.close();
    }
}
