import java.util.Scanner;

// Ler N;
// Ler N valores e armazenar em array argola de inteiros
// achar maior e menor argola
// imprimir os valores achados

public class Pombao3 {
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

        for (int i = 1; i < n; i++) {
            if (maiorArgola < argola[i]) {
                maiorArgola = argola[i];
            } else if (menorArgola > argola[i]) {
                menorArgola = argola[i];
            }
        }
        int argolinhaSafadinha = menorArgola;
        int argolinhaSafadinhaDois = maiorArgola;
        for (int i = 0; i < n; i++) {
            if (argola[i] > menorArgola && argola[i] < maiorArgola) {
                if (argola[i] > argolinhaSafadinha) {
                    argolinhaSafadinha = argola[i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (argola[i] > menorArgola && argola[i] < maiorArgola) {
                if (argola[i] < argolinhaSafadinhaDois) {
                    argolinhaSafadinhaDois = argola[i];
                }
            }
        }
        System.out.println("Maior argola: " + maiorArgola);
        System.out.println("Menor argola " + menorArgola);
        System.out.println("Maior que a menor: " + argolinhaSafadinha);
        System.out.println("Menor que a maior: " + argolinhaSafadinhaDois);
        


                                                                                        
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
System.out.println("\n \n");                                                                                
System.out.println("    xXXXXXXXXXXXXXXXXXXx");                              
System.out.println(" XXXX                  XXXX");                         
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");                       
System.out.println("X  X     XXXX    XXXX    X  X");                      
System.out.println("XXXXX     X       X      XXXXX");                     
System.out.println(" X  X        XXX         X  X");                      
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");                       
System.out.println("  XXXXX   X  X  X  X  XXXXX");                         
System.out.println("       XXXXXXXXXXXXXXX");                              
                                                                                                   
    }

    public static void main(String[] args) {
        Pombao3.run();
    }
}