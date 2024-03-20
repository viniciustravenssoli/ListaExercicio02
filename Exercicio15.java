import java.util.Scanner;

public class Exercicio15 {
    public static void Executar() {
        var leitor = new Scanner(System.in);
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            int numero = leitor.nextInt();

            if (i == 0 || numero > vetorA[i - 1]) {
                vetorA[i] = numero;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Digite novamente:");
                i--; 
            }
        }
        leitor.close();

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        

    }
}
