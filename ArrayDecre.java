import java.util.Scanner;

public class ArrayDecre {

    public static int acharMaior(int array[]) {
        int n = array.length;
        int maior = Integer.MIN_VALUE;
        int menorIndice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(array[i] != -1) { 
                if (maior < array[i]) {
                    maior = array[i];
                    menorIndice = i;
                }
            }
        }

        return menorIndice;
    }

    public static void run() {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        n = reader.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int menorIndice = acharMaior(array);
            int menor = array[menorIndice];
    
            System.out.println(menor);
            array[menorIndice] = -1;
        }
    }

    public static void main(String[] args) {
        ArrayDecre.run();
    }
}
