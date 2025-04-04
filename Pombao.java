import java.util.Scanner;

public class Pombao {
    public static void run() {
        Scanner reader = new Scanner(System.in);
        int N;
        System.out.println("Primeiro Numero");
        N = reader.nextInt();

        int argola[] = new int[N];
        for (int i = 0; i < N; i += 1) {
            argola[i] = reader.nextInt();
        }
        int maiorArgola = argola[0];
        int menorArgona = argola[0];
        for (int i = 1; i < N; i++) {
            if (maiorArgola < argola[i]) {
                maiorArgola = argola[i];
            }
            if(menorArgona > argola[i]){
                menorArgona = argola[i];
            }
        }
        System.out.println("Menor argola: " + menorArgona);
        System.out.println("Maior argola: " + maiorArgola);
    }

    public static void main(String[] args) {
        Pombao.run();
    }
}
