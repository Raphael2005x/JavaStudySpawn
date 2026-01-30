import java.util.Scanner;
public class main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] grade = new int[3];
    int valorMaximo = grade[0];
    int index = 0;
    
    for(int i = 0; i < grade.length; i++){
        if (grade[i] > valorMaximo){
            valorMaximo = grade[i];
            index = i;
        }
    }
}