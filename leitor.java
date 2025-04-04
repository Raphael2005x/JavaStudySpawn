import java.util.Scanner;

public class leitor {
    public static void iniciar() {
        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();

        for (int i = 0; i < N; i++) {
            int array[] = new int[5];

            for (int j = 0; j < 5; j++) {
                array[j] = reader.nextInt();
            }
            for (int j = 0; j < 5; j++) {

                System.out.print(array[j] + " ");
            }
            int menor = array[0];
            for(int j = 0; j < 5; j++){
                if(menor > array[j]){
                    menor = array[j];
                }
            }
            System.out.println("Menor numero "+ menor);
        }

    }

    public static void main(String[] args) {
        leitor.iniciar();
    }
}