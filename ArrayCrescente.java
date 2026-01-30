import java.util.Scanner;

public class ArrayCrescente {

    public static int acharMenor(int array[]) {
        int n = array.length; // acha o tamanho do array
        int menor = Integer.MAX_VALUE; // inicia em um valor extremamente alto
        int menorIndice = 0; //inicializa o índice do menor valor encontrado

        for (int i = 0; i < n; i++) { // para i = 0; i menor que n incrementa mais 1
            if(array[i] != -1) {  // se o arrai[i] diferente de -1
                if (menor > array[i]) { // se o menor for maior ao array[i]
                    menor = array[i]; //menor vai ser igual ao array[i]
                    menorIndice = i; //armazena o indice onde ele achou o menor cara
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
            int menorIndice = acharMenor(array);

            
            int menor = array[menorIndice];
    
            System.out.println(menor);
            array[menorIndice] = -1;
        }
    }

    public static void main(String[] args) {
        ArrayCrescente.run();
    }
}
