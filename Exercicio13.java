import java.util.Scanner;

public class Exercicio13 {
    public static void Executar()
    {
        var leitor = new Scanner(System.in);

        System.out.println("Informe n:");
        int n = leitor.nextInt();

        int[] resultado = fibonacci(n);

        System.out.print("Os primeiros " + n + " termos da sequência de Fibonacci são: ");
        for (int i = 0; i < resultado.length; ++i) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1)
                System.out.print(", ");
        }
        System.out.println();

    }

    public static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i < 2)
                fibonacci[i] = 1;
            else
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
