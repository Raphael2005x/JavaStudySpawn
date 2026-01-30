import java.util.Scanner;

public class MultiplicarArray {

    public static int Multiplicar(int array[]) {
        int total = array[0];
        int n = array.length;
        for (int i = 1; i < n; i++) {
            total *= array[i];
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
        System.out.println(Multiplicar(array));
    }

    public static void main(String[] args) {
        MultiplicarArray.run();
    }

    public void LerEntradas(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'LerEntradas'");
    }

    public void PegarMultiplo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PegarMultiplo'");
    }
}
