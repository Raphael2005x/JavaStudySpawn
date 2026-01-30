import java.util.Scanner;

public class MultiploArray {
    static Scanner Reader;
    static int N;
    static int array[];
    static int count;

    public void lerEntradas() {
        Reader = new Scanner(System.in);
        N = Reader.nextInt();
        array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.nextInt();
        }
    }

    public void pegarMultiplo() {
        for (int j = 0; j < array.length; j++) { // olha cada elemento do array
            int test = 0;
            for (int i = 1; i <= 10; i++) { // i percorre os numeros
                if (i % array[j] == 0) {
                    test++;
                }
            }
            System.out.print(test + " ");
        }
    }

    public static void main(String[] args) {
        MultiploArray MultArray = new MultiploArray();
        MultArray.lerEntradas();
        MultArray.pegarMultiplo();
    }
}
