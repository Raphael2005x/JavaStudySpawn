import java.util.Scanner;

// Ler N;
// Ler N valores e armazenar em array argola de inteiros
// achar maior e menor argola
// imprimir os valores achados

public class Pombao2 {
    public static void run() {
        Scanner reader = new Scanner(System.in);
        int n;
        n = reader.nextInt();

        int argola[] = new int[n];
        for (int i = 0; i < n; i++) {
            argola[i] = reader.nextInt();
        }
        int maiorArgola = argola[0];
        int menorArgola = argola[0];
        for(int i = 1; i < n; i++){
            if (maiorArgola < argola[i]) {
                maiorArgola = argola[i];
            }
            if (menorArgola > argola[i]) {
                menorArgola = argola[i];
            }
        }
        System.out.println("Ver numero: " + maiorArgola);
        System.out.println("Menor argola " + menorArgola);
    }

    public static void main(String[] args) {
        Pombao2.run();
    }
}
