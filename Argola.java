import java.util.Scanner;

public class Argola {
    public static void run() {

        Scanner reader = new Scanner(System.in);

        int n;
        n = reader.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }

        int test = array[0];
        for (int i = 1; i < n; i++) {
            if (test > array[i]) {
                test = array[i];
            }
        }
        int test2 = array[1];
        for (int i = 2; i < n; i++) {
            if (test2 > array[i]) {
                test = array[i];
            }
        }
        int test3 = array[2];
        for (int i = 3; i < n; i++) {
            if (test3 > array[i]) {
                test = array[i];
            }
        }
        int test4 = array[3];
        for (int i = 4; i < n; i++) {
            if (test4 > array[i]) {
                test = array[i];
            }
        }
        int test5 = array[4];
        for (int i = 5; i < n; i++) {
            if (test5 > array[i]) {
                test = array[i];
            }
        }
        // int ValorTotal = (test + test2 + test3 + test4 + test5);

        for(int j = 0; j < n; j++){
    
    
        if (test < test2 && test < test3 && test < test4 && test < test5) {
            System.out.println("O valor " + test + " é menor que o " + test2);
            System.out.println("O valor " + test2 + " é menor que o " + test3);
            System.out.println("O valor " + test3 + " é menor que o " + test4);
            System.out.println("O valor " + test4 + " é menor que o " + test5);

            
    
        } else {
            System.out.println("O valor " + test + " é maior que o " + test2);
            System.out.println("O valor " + test2 + " é maior que o " + test3);
            System.out.println("O valor " + test3 + " é maior que o " + test4);
            System.out.println("O valor " + test4 + " é maior que o " + test5);

        }
    }
    }

    // System.out.println("Verificar valor " + test);
    // System.out.println("Verificar valor " +test2);
    // System.out.println("Verificar valor " +test3);
    // System.out.println("Verificar valor " +test4);
    // System.out.println("Verificar valor " +test5);
    // System.out.println("Somando tudo " + ValorTotal);

    public static void main(String[] args) {
        Argola.run();
    }
}
