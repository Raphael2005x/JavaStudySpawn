import java.util.Scanner;

public class SomarArrays {
    // 0 1 2 3
    // 1 2 3 4
    // arr[] = 0 + 1, 1 + 2, 2 +3 , 3 + 4
    // 1, 3, 5, 7
    public static int[] somar(int[] array1, int array2[]) {
        int n = array1.length;
        int[] total = new int[n];
        for (int i = 0; i < n; i++) {
            total[i] = array1[i] + array2[i];

        }
        return total;
    }

    public static void run() {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        n = reader.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = reader.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = reader.nextInt();
        }
        int resultado[] = somar(array1, array2);
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " ");

        }
    }

    public static void main(String[] args) {
        SomarArrays.run();
    }
}
