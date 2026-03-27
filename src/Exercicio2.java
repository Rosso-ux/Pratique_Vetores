import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor que voce deseja : ");
        int tamanhoDoVetor = scanner.nextInt();
        int vetorDoUsuario[] = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            System.out.println("Digite o valor da posição " + i + " do seu vetor : ");
            vetorDoUsuario[i] = scanner.nextInt();
        }

        System.out.println("Agora vamos fazer o seguinte: se o valor da posição for par seu novo valor será ele mesmo multiplicado por 2 , se for ímpar o seu novo valor vai ser ele mesmo elevado por 2.\n");
        System.out.println("Seu vetor antes : ");
        exibeVetor(vetorDoUsuario);


        for (int i = 0; i < vetorDoUsuario.length; i++) {
                if (vetorDoUsuario[i] % 2 == 0 ){
                    vetorDoUsuario[i] = vetorDoUsuario[i] * 2;
                } else {
                    vetorDoUsuario[i] = (int )Math.pow(vetorDoUsuario[i] , 2 );
                }
        }

        System.out.println("Seu vetor agora : ");
        exibeVetor(vetorDoUsuario);


    }

    private static void exibeVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }
}



