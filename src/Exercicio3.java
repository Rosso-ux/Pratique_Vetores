import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome : ");
        String nome = scanner.nextLine();
        char[] letras = nome.toCharArray();

        for (int i = letras.length - 1; i >= 0  ; i--) {
            System.out.print(letras[i]);
        }


    }

}
