import java.util.Scanner;

public class Multiplo7 {
    public static void Multiplo() {

        for (int i = 1; i <= 200; i++) {
            if(i % 7 == 0){
                System.out.println("GOZOU " + i);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Multiplo7.Multiplo();

    }
}
