package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int quantidadeDeNotas = scanner.nextInt();

        double[] nota = new double[quantidadeDeNotas];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            nota[i] = scanner.nextDouble();
        }
        double total = 0;
        for (double notas : nota) {
            total += notas;
        }
        System.out.println("A média é " + (total / nota.length));
        scanner.close();
    }
}
