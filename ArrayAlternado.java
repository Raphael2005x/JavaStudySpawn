import java.util.Scanner;

public class ArrayAlternado {
    static int[] array;
    static Scanner reader;

    public static void lerEntrada() {
        reader = new Scanner(System.in);
        int N = reader.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        reader.close();
    }

    // -1 -1
    public static int pegaMenor(int array[]) {
        int menor = Integer.MAX_VALUE;
        int indiceMenor = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                if (menor > array[i]) {
                    menor = array[i];
                    indiceMenor = i;
                }
            }
        }
        return indiceMenor;// -1
    }

    public static int pegaMaior(int array[]) {
        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                if (maior < array[i]) {
                    maior = array[i];
                    indiceMaior = i;
                }
            }
        }
        return indiceMaior;
    }

    public static int[] criar(int array[]) {
        int N = array.length;
        int[] resultado = new int[N]; // 1 2 3 4 5 -> 1 5 2 4 3

        boolean useMenor = true;
        for (int i = 0; i < N; i++) {
                if (useMenor == true) {
                    int indiceMenor = pegaMenor(array);
                    resultado[i] = array[indiceMenor];
                    array[indiceMenor] = -1;
                    useMenor = false;
                }
                else {
                    int indiceMaior = pegaMaior(array);
                    resultado[i] = array[indiceMaior];
                    array[indiceMaior] = -1;
                    useMenor = true;
                }
            }
            return resultado;
        }

    // public static void solucao() {
    //     boolean useMenor = true;
    //     int numerosRestantes = array.length;

    //     while (numerosRestantes > 0) {

    //         if (useMenor == true) {
    //             int idiceMenor = pegaMenor(array);
    //             System.out.println(array[idiceMenor] + " ");
    //             array[idiceMenor] = -1;
    //             numerosRestantes--;
    //             useMenor = false;
    //         } else {
    //             int idiceMaior = pegaMaior(array);
    //             System.out.println(array[idiceMaior] + " ");
    //             array[idiceMaior] = -1;
    //             numerosRestantes--;
    //             useMenor = true;
    //         }
    //     }
    // }

    public static void main(String[] args) {
        ArrayAlternado.lerEntrada();
        // ArrayAlternado.solucao();
        int resultado[] = criar(array);
        for (int i : resultado) {
            System.out.println(i);
        }
    }
}