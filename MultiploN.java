import java.util.Scanner;

public class MultiploN {
    static Scanner Reader;
    static int N;

    public void lerEntrada() {
        Reader = new Scanner(System.in);
        System.out.print("Digite o Numero que deseja buscar o multiplo dele: ");
        N = Reader.nextInt();
    }

    public void legarMultiplo(int N) {
        for (int i = 1; i <= 200; i++) {
            if (i % N == 0) {
                System.out.println("GOZEI: " + i);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MultiploN MultN = new MultiploN();
        MultN.lerEntrada();
        MultN.legarMultiplo(MultN.N);
    }
}
