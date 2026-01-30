import java.util.Scanner;

public class arrayd {
    public static int acharDecrescente(int caixaDeNumeros[]) {
        int n = caixaDeNumeros.length;
        int maior = Integer.MIN_VALUE;
        int maiorIndice = -1;

        for(int i = 0; i < n; i++){
            if(caixaDeNumeros[i] != -1) { 
            if(maior < caixaDeNumeros[i]){
                maior = caixaDeNumeros[i];
                maiorIndice = i;
            }
        }
    }
        return maiorIndice;
    }

    public static void run() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int caixaDeNumeros[] = new int[n];

        for (int i = 0; i < n; i++) {
            caixaDeNumeros[i] = reader.nextInt();
        }
        for(int i = 0; i < n; i++){
            int maiorIndice = acharDecrescente(caixaDeNumeros);


            if(maiorIndice != -1){
            int maior = caixaDeNumeros[maiorIndice];
            System.out.println("sssss"+maior);
            caixaDeNumeros[maiorIndice] = -1;
            }
        }
    }
    public static void main(String[] args) {
        arrayd.run();
    }
}
