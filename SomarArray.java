import java.util.Scanner;

public class SomarArray {

    public static int somar(int array[]) {
        int total = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            total += array[i];
        }
        return total;
    }

    public static void run() {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        n = reader.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }
        System.out.println(somar(array));
    }

    public static void main(String[] args) {
        main.run();
    }
}
