package devdojoExercises.funcoes.ex01e02.dominio;

public class Calculadora {
    public double somaDoisNumeros(double a, double b) {
        return a + b;
    }

    public double subtracaoDoisNumeros(double a, double b) {
        return a - b;
    }

    public double multiplicacaoDoisNumeros(double a, double b) {
        return a * b;
    }

    public double divisaoDoisNumeros(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão impossível.");
            return Double.NaN;
        }
        return a / b;
    }

    public double potencia(double a, double exp) {
        if (a == 0 && exp == 0) {
            System.out.println("Indeterminado.");
            return Double.NaN;
        }
        double result = 1;
        double baseMultip = (exp >= 0) ? a : (1 / a);
        double numDeIteracoes = (exp >= 0) ? exp : (-exp);

        for (int i = 0; i < numDeIteracoes; i++) {
            result *= baseMultip;
        }
        return result;
    }

    public double raizQuadradaEquacaoDePell(double a) {
        if (a < 0) {
            return Double.NaN;
        }
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                a = a - i;
                count++;
            }
        }
        return count;
    }
}
