package devdojoExercises.lacos;

import java.util.Scanner;

public class Ex06TesteLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeUsuario = "Verstappen";
        String senhaUsuario = "admin33";

        System.out.println("Login");

        do {
            System.out.println("Insira seu nome:");
            String entradaNomeUsuario = teclado.next();
            System.out.println("Insira sua senha:");
            String entradaSenhaUsuario = teclado.next();

            if (!entradaNomeUsuario.equals(nomeUsuario) || !entradaSenhaUsuario.equals(senhaUsuario)) {
                System.out.println("ACESSO NEGADO");
            } else{
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
        } while (true);
    }
}
