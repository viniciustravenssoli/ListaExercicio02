import java.util.Scanner;

public class Exercicio08 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        System.out.println("Informe os valores do vetor A");

        for(int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe os valores do vetor B");

        for(int i = 0; i < vetorA.length; i++)
        {
            vetorB[i] = leitor.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++)
        {
            vetorC[i] = vetorA[i];
        }

        int aux = 5;
        for(int i = 0; i < vetorA.length; i++)
        {
            vetorC[aux] = vetorB[i];
            aux++;
        }

        System.out.println("Valores concatenados: ");

        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i]+ "\n");
        }

    }
}
