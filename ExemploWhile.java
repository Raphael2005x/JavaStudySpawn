import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso liberado!");
        scanner.close();
    }
}
