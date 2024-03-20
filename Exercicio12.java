import java.util.Scanner;

public class Exercicio12 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);
        int[] vetor = new int[12];
        int result = 1;

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if((vetor[i] > 0) && (vetor[i] % 2 == 0))
            {
                result *= vetor[i];
            }
        }

        System.err.println(result);
    }
}
