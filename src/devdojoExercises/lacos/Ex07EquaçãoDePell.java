package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex07EquaçãoDePell {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num = teclado.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if(i%2 != 0){
                num = num - i;
                count++;
            }
        }

        System.out.println("Precisão inteira: " + count);

        teclado.close();
    }
}