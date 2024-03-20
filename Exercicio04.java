import java.util.Scanner;

public class Exercicio04 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);
        int[]valores = new int[5];
        int n = 0;

        System.out.println("Informe 5 numeros");

        for(int i = 0; i < valores.length; i++)
        {
            valores[i] = leitor.nextInt();

        }

        System.out.println("Informe o numero de comparaçao");
        n = leitor.nextInt();
        leitor.close();
        System.out.println("Numeros menores que " + n);

        for(int i = 0; i < valores.length; i++)
        {
            if(valores[i] < n)
            {
                System.out.println(i);
            }
        }
    }
}
