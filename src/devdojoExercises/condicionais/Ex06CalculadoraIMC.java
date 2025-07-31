package devdojoExercises.condicionais;

import java.util.Locale;
import java.util.Scanner;

//Desenvolva uma calculadora de IMC (Índice de Massa Corporal),
// após realizado o cálculo classificar o paciente de acordo com a tabela abaixo.
// Para realizar o cálculo de IMC utilize a fórmula abaixo:
// IMC = PESO/ALTURA^2

public class Ex06CalculadoraIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira seu peso:");
        float peso = teclado.nextFloat();
        System.out.println("Insira sua altura:");
        float altura = teclado.nextFloat();
        float imc = peso / (altura * altura);

        System.out.printf(Locale.US, "Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Baixo Peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Pré-obesidade");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III");
        }

        teclado.close();
    }
}
