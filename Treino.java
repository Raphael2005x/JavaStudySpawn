import java.util.Scanner;

// fazer um programa que le n numeros inteiros e que guarde o menor e o maior numero.
public class Treino {
    public static void run() {
        Scanner reader = new Scanner(System.in);

        int n;
        n = reader.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }

        int maiorNumero = array[0];
        int menorNumero = array[0];
        for (int i = 1; i < n; i++) {
            if (maiorNumero < array[i]) {
                maiorNumero = array[i];
            } else if (menorNumero > array[i]) {
                menorNumero = array[i];
            }
        }
        int test = menorNumero;
        int matuto = maiorNumero;
        for (int i = 0; i < n; i++) {
            if (array[i] > menorNumero && array[i] < maiorNumero) {
                if (array[i] > test) {
                    test = array[i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > menorNumero && array[i] < maiorNumero) {
                if (array[i] < matuto) {
                    matuto = array[i];
                }
            }
        }
        System.out.println("Maior do menor: " + matuto);
        System.out.println("Menor do Maior:  " + test);
        System.out.println("Menor: " + menorNumero);
        System.out.println("Maior: " + maiorNumero);
    }

    public static void main(String[] args) {
        Treino.run();
    }
}
