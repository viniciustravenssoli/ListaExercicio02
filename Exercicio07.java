import java.util.Scanner;

public class Exercicio07 {
    public static void Executar() {
        var leitor = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe os valores do primeiro vetor");
            vetor1[i] = leitor.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe os valores do segundo vetor");
            vetor2[i] = leitor.nextInt();
        }
        leitor.close();

        boolean verificar = true;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                verificar = false;
            }
        }

        if(verificar)
        {
            System.out.println("Iguais");
        }
        else
        {
            System.out.println("Nao iguais");
        }

    }
}
