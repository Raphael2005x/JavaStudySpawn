import java.util.Scanner;

public class multiproarray {
    static Scanner leitor;
    static int N;
    static int array[];
    static int value = 200;

    public void receberEntrada() {
        leitor = new Scanner(System.in);
        System.out.println("Quantidades de numeros que vao ser inseridos dentro do array");
        N = leitor.nextInt();
        array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = leitor.nextInt();
        }
    }

    public void multiplica(int array[], int N) {
        for (int i = 0; i < array.length; i++) {
            int contador = 0;
            for (int j = 1; j <= value; j++) {
                if (j % array[i] == 0) {
                    contador++;
                }
            }
            System.out.print(contador + " ");
        }
    }

    public static void main(String[] args) {
        multiproarray run = new multiproarray();
        run.receberEntrada();
        run.multiplica(array, N);
    }
}
