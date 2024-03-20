import java.util.Scanner;

public class Exercicio09 {
    public static void Executar() {
        var leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        System.out.println("Informe os valores do vetor A: ");

        for (int i = 0; i < 5; i++){
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe os valores do vetor B: ");

        for (int i = 0; i < 5; i++){
            vetorB[i] = leitor.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i / 2];
            } else {
                vetorC[i] = vetorB[i / 2];
            }
        }

        System.out.println("-------------------------------------------");

        for(int i = 0; i < vetorC.length; i++)
        {
            System.out.print(vetorC[i]+ "\n");
        }

    }
}
