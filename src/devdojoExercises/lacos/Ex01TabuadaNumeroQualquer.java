package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex01TabuadaNumeroQualquer {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char sn;
        do {
            System.out.println("Insira um número para realizar a tabuada: ");
            int num = teclado.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "x" + i + " = " + (num * i));
            }
            System.out.println("Deseja continuar? s(Sim) ou n(Não)");
            sn = teclado.next().charAt(0);

            if (sn == 'n') {
                System.out.println("O Sistema foi encerrado.");
                break;
            } else if (sn == 's') {
                System.out.println("O Sistema continuará.");
            } else {
                System.out.println("Entrada inválida.");
                break;
            }

        } while (true);

        teclado.close();
    }
}
