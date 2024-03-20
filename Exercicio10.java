import java.util.Scanner;

public class Exercicio10 {
    public static void Executar() {
        var leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = leitor.nextInt();
        }
        leitor.close();

        int aux = 4;

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[aux];
            aux--;
        }

        System.out.println("Valores do vetor B: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + "\n");
        }

    }
}
