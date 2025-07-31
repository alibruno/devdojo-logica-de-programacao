package devdojoExercises.lacos;

public class Ex04SequenciaDeFibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int proximo = 0;
        for (int i = 0; i < 15; i++) {
            proximo = a + b;
            b = a;
            System.out.println(a);
            a = proximo;
        }
    }
}
