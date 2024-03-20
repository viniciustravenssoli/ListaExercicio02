import java.util.Scanner;

public class Exercicio11 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = leitor.nextInt();
        }
        leitor.close();

        int response = 0;

        for (int i = 0; i < vetorB.length; i++) {
            response += vetorA[i] * vetorB[i];
        }
        System.out.println(response);

    }
}
