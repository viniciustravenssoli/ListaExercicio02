import java.util.Scanner;

public class Exercicio05 {
    public static void Executar() {
        var leitor = new Scanner(System.in);
        int[] valores = new int[5];
        int n = 0;
        int contador = 0;

        for(int i = 0; i < valores.length; i++)
        {
            System.out.println("Informe o valor " + (i + 1));
            valores[i] = leitor.nextInt();
        }

        System.out.println("Informe um numero de comparaçao");
        n = leitor.nextInt();
        leitor.close();

        for(int i = 0; i < valores.length; i++)
        {
            if(valores[i] == n)
            {
                contador++;
            }
        }

        System.out.println("O numero " + n + " Aparece " + contador + " vezes");
    }
}
