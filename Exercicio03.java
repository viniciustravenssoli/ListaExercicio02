import java.util.Scanner;

public class Exercicio03 {

    public static void Executar()
    {
        int valores[] = new int[5];
        int valores2x[] = new int [5];
        var leitor = new Scanner(System.in);

        for(int i = 0; i < valores.length; i++)
        {
            valores[i] = leitor.nextInt();
            valores2x[i] = valores[i] * 2;
        }

        System.out.println("-------------------------------------");

        for(int i = 0; i < valores.length; i++)
        {
            System.out.println(valores2x[i]);
        }

    }
}
