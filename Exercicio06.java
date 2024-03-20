import java.util.Scanner;

public class Exercicio06 {
     public static void Executar() {
        var leitor = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];

        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Informe a " + (i + 1)  + " nota");
            notas[i] = leitor.nextDouble();
            System.out.println("Informe o peso da "  + (i + 1)  + " nota");
            pesos[i] = leitor.nextDouble();
        }

        double media = (notas[0] * pesos[0] + notas[1] * pesos[1] + notas[2] * pesos[2]) / (pesos[0] + pesos[1] + pesos[2]);
        System.out.println(String.format("%.2f", media));
       
    }
}
