import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor que voce deseja : ");
        int tamanhoDoVetor = scanner.nextInt();
        int vetorDoUsuario[] = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++){

            System.out.println("Digite o valor da posição " + i + " do seu vetor : ");
            vetorDoUsuario[i] = scanner.nextInt();
        }


        for (int i = 0; i < vetorDoUsuario.length; i++) {
            for (int j = i; j < vetorDoUsuario.length; j++) {
                if (vetorDoUsuario[j] < vetorDoUsuario[i]) {
                    int aux = vetorDoUsuario[i];
                    vetorDoUsuario[i] = vetorDoUsuario[j];
                    vetorDoUsuario[j] = aux;
                }
            }
        }
        System.out.println("Seu vetor ordenado de forma Crescente : \n");
        exibeVetor(vetorDoUsuario);

        scanner.nextLine();
        System.out.println("\nOk, agora digite um nome, que irei falar  quantas vogais tem nesse nome : ");
        String nome = scanner.nextLine();

        char[] letras = nome.toCharArray();
        int contador = 0;

        for (int i = 0; i < letras.length; i++) {
            char letra = Character.toLowerCase(letras[i]);

            if (letra == 'a' ||  letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador ++;
            }
        }

        System.out.println("A quantidade de vogais do nome é : " + contador);


    }
    private static void exibeVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }
}
