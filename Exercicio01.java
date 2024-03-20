import java.util.Scanner;

public class Exercicio01 {

    public static void Executar()
    {
        int valores[] = new int[5];
        int media = 0;

        var leitor = new Scanner(System.in);
        System.out.println("Informe 5 numeros");

        for(int i = 0; i < 5; i++)
        {
            valores[i] = leitor.nextInt();
            media += valores[i];
        }
        leitor.close();

        media = media / valores.length;

        for(int x = 0; x < valores.length; x++)
        {
            if(valores[x] > media)
            {
                System.out.println("Maior que a media: " + valores[x]);
            }
            else if(valores[x] < media)
            {
                System.out.println("Menor que a media: " + valores[x]);
            }
            else if(valores[x] == media)
            {
                System.out.println("Igual a media: " + valores[x]);
            }
        }

    }
}
