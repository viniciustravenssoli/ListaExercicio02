import java.util.Scanner;

public class Exercicio02 {

    public static void Executar()
    {
        int valores[] = new int[5];
        var leitor = new Scanner(System.in);

        System.out.println("Informe 5 valores");

        for(int i = 0; i < valores.length; i++)
        {
            valores[i] = leitor.nextInt();
        }

        for(int i = 0; i < valores.length; i++)
        {
            if(valores[i] > 0)
            {
                System.out.println("Positivo: " + valores[i]);
            }
            else if(valores[i] == 0)
            {
                System.out.println("Zero: " + valores[i]);
            }
            else
            {
                System.err.println("Negativo: " + valores[i]);
            }
        }


    }
}
